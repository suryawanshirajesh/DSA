
import java.util.*;

class TrieNode {

    Map<Character, TrieNode> children;
    Map<String, Integer> sentenceFreq;

    TrieNode() {
        children = new HashMap<>();
        sentenceFreq = new HashMap<>();
    }
}

class AutocompleteSystem {

    private TrieNode root;
    private TrieNode currentNode;
    private StringBuilder currentPrefix;
    private Map<String, Integer> sentenceFrequency;

    public AutocompleteSystem() {
        root = new TrieNode();
        currentNode = root;
        currentPrefix = new StringBuilder();
        sentenceFrequency = new HashMap<>();
    }

    public void insert(String sentence) {
        TrieNode node = root;
        for (char c : sentence.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
            node.sentenceFreq.put(sentence, node.sentenceFreq.getOrDefault(sentence, 0) + 1);
        }
        sentenceFrequency.put(sentence, sentenceFrequency.getOrDefault(sentence, 0) + 1);
    }

    public List<String> input(char c) {
        if (c == '#') {
            String completedSentence = currentPrefix.toString();
            insert(completedSentence);
            currentNode = root;
            currentPrefix.setLength(0);  // Clear the current prefix
            return new ArrayList<>();
        } else {
            currentPrefix.append(c);
            if (currentNode.children.containsKey(c)) {
                currentNode = currentNode.children.get(c);
                return getTop3Sentences(currentNode.sentenceFreq);
            } else {
                currentNode = new TrieNode();  // Reset to a new TrieNode if path breaks
                return new ArrayList<>();
            }
        }
    }

    private List<String> getTop3Sentences(Map<String, Integer> sentenceFreq) {
        List<String> sentences = new ArrayList<>(sentenceFreq.keySet());
        sentences.sort((a, b) -> {
            int freqCompare = sentenceFreq.get(b).compareTo(sentenceFreq.get(a));
            return freqCompare != 0 ? freqCompare : a.compareTo(b);
        });
        return sentences.size() > 3 ? sentences.subList(0, 3) : sentences;
    }

    public static void main(String[] args) {
        AutocompleteSystem autocompleteSystem = new AutocompleteSystem();
        String[] queries = {"i love you", "island", "ironman", "i love leetcode"};
        for (String query : queries) {
            autocompleteSystem.insert(query);
        }

        // Simulate typing "i l"
        System.out.println(autocompleteSystem.input('i'));  // ['i love you', 'i love leetcode']
        System.out.println(autocompleteSystem.input(' '));  // ['i love you', 'i love leetcode']
        System.out.println(autocompleteSystem.input('l'));  // ['i love you', 'i love leetcode']

        // Simulate ending a sentence
        System.out.println(autocompleteSystem.input('#'));  // []

        // Simulate typing "ir"
        System.out.println(autocompleteSystem.input('i'));  // ['i love you', 'i love leetcode', 'island']
        System.out.println(autocompleteSystem.input('r'));  // ['ironman']
    }
}
