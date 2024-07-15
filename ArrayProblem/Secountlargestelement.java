public class Secountlargestelement {

    public static int secoundelement(int [] arr){
     int Largestelement=0;
     int Secoundelement=0;
     for(int i=0;i<arr.length;i++){
        if(Largestelement<arr[i]){
            Secoundelement=Largestelement;
            Largestelement=arr[i];
        }else if(Largestelement>Secoundelement&&Secoundelement<arr[i]){
            Secoundelement=arr[i];
        }
     }
     System.out.println("Largest Element "+Largestelement);
     System.out.println("Secound Element "+Secoundelement);
    return 0;
    }
    public static void main(String[] args) {
         int [] nums = {5,2,7,23,89,4};
         secoundelement(nums);
    }
}
