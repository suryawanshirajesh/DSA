public class CheckArraySortedRotated {

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Loop through the array to count the number of inversions
        for (int i = 0; i < n; i++) {
            System.out.println("i :"+i+" "+" nums[i] : "+nums[i]+" "+"(i+1)%n : "+(i+1)%n+" "+" nums[(i+1)%n] : "+nums[(i+1)%n]);
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // If there is more than one inversion, it is not sorted and rotated
        if (count > 1) {
            return false;
        }
        
        // Otherwise, it is sorted and rotated
        return true;
    }

    public static boolean check1(int [] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
             if(nums[i]>nums[(i+1)%n]){
                count++;
             }
        }
        if(count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        boolean result=check1(nums);
        System.out.println("Result : "+result);

    }
}
