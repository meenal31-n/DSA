import java.util.Arrays;

public class Seggregate0and1 {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    System.out.println(Arrays.toString(func(nums)));
    
  }

  static int[] func(int[] arr){
        int count0 = 0;
        int count1 = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i] == 0){
                count0++;
            }
            else{
                count1++;
            }
            
        }
        
        for(int i =0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i = count0;i<count0+count1;i++){
            arr[i] = 1;
        }
        return arr;
  }
}
