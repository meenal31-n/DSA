import java.util.Arrays;

public class SquaresOfSorted{
  public static void main(String[] args) {
    int[] arr = {-4,-1,0,3,10};
    System.out.println(Arrays.toString(func(arr)));
    
  }
  static int[] func(int[] arr){
    for(int i =0;i<arr.length;i++){
      arr[i] = arr[i]*arr[i];
    }
    Arrays.sort(arr);
    return arr;
  }
}


