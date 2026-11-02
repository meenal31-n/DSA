import java.util.ArrayList;

public class PairWithTargetSum{
  public static void main(String args[]){

    int[] nums = {-1,0};
    int target = -1;
    System.out.println(func(nums, target));
  }
  static ArrayList<Integer> func(int[] nums, int target){
    ArrayList<Integer> ans = new ArrayList<>();
    int start = 0;
    int end = nums.length-1;
    while(start<=end){
      int mid = start+ (end-start)/2;
      if(nums[start] + nums[end] == target){
        ans.add(start+1);
        ans.add(end+1);
        return ans;
      }
      else if(nums[start] + nums[end] < target){
        start = mid+1;
      }
      else{
        end = mid;
      }
    }
    return ans;
  }
}