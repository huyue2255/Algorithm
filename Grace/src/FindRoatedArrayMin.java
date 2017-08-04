/**
 * Created by yuehu on 1/31/17.
 */
public class FindRoatedArrayMin {

    public static void main(String[] args) {
        // TODO code application logic here
//        Sample1 s = new Sample1();

//        System.out.println(s.strStr("source", "r"));
        FindRoatedArrayMin s1 = new FindRoatedArrayMin();

        int test[] = {4, 5, 6, 1, 2, 3};

        System.out.println(s1.findMin(test));
    }



    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == nums[end]) {
                // if mid equals to end, that means it's fine to remove end
                // the smallest element won't be removed
                end--;
            } else if (nums[mid] < nums[end]) {
                end = mid;
                // of course you can merge == & <
            } else {
                start = mid;
                // or start = mid + 1
            }
        }

        if (nums[start] <= nums[end]) {
            return nums[start];
        }
        return nums[end];
    }
}

