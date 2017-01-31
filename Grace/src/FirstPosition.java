/**
 * Created by yuehu on 1/31/17.
 */
public class FirstPosition {

    public static void main(String[] args) {
        // TODO code application logic here
//        Sample1 s = new Sample1();

//        System.out.println(s.strStr("source", "r"));
        FirstPosition s = new FirstPosition();

        int test[] = {1, 2, 3, 3, 4, 5, 10};

        System.out.println(s.binarySearch(test,3));
    }



    public int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int start = 0, end = nums.length - 1;
        //exist start=1,end=2
        while(start + 1 < end){
            int mid = (end - start)/2 + start;
            if(target == nums[mid]){
                end = mid;
            }else if(target < nums[mid]){
                end = mid;
            }else if(target > nums[mid]){
                start = mid;
            }
        }
        if (nums[start] == target){
            return start;
        }
        if (nums[end] == target){
            return end;
        }
        return -1;
    }


}
