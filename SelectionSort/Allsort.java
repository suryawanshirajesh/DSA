package SelectionSort;

import java.util.ArrayList;

public class Allsort {
    public static void selectionsort(int [] arr){
     for(int i=0;i<arr.length-1;i++){
        int min=i;
       for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[min]){
            min=j;
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
       }
     }
    }

    public static void bubblesort(int [] arr){
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-1;j++){
              if(arr[j+1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
           }
            
           }
        }

        public static void Insertionsort(int arr[]){
            for(int i=0;i<arr.length;i++){
                int j=i;
                while (j > 0 && arr[j-1]>arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
        }
        public static void Ms(int arr [],int low,int heigh){
            int mid = (low+heigh)/2;
           if(low>=mid){
            return;
           }


           Ms(arr, low, mid);
           Ms(arr,mid+1,heigh);
           Mergsort(arr,low,mid,heigh);
        }
        public static void Mergsort(int [] arr, int low,int mid,int heigh){
            ArrayList<Integer> ls = new ArrayList<>();
            int left=low;
            int right=mid+1;    
            while(left<=mid&&right<=heigh) {
                if(arr[left]<=arr[right]){
                   ls.add(arr[left]);
                   left++;
                }else{
                    ls.add(arr[right]);
                    right++;
                }
            }  
            while (left<=mid) {
                ls.add(arr[left]);
                left++;
            } 
            while (right<=heigh) {
                ls.add(arr[right]);
                right++;
            }
            for(int i=low;i<=heigh;i++){
                arr[i]=ls.get(i-low);
            }

        }
    
    public static void main(String[] args) {
        int [] arr={6,34,22,48,16,3,5};
        //selectionsort(arr);
      //  bubblesort(arr);
      Ms(arr,0,arr.length-1);
     // Insertionsort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
