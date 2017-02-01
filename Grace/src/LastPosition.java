/**
 * Created by yuehu on 1/31/17.
 */
public class LastPosition {
    public static void main(String[] args) {
        // TODO code application logic here
//        Sample1 s = new Sample1();

//        System.out.println(s.strStr("source", "r"));
        LastPosition s1 = new LastPosition();

        int test[] = {1, 2, 3, 3, 4, 5, 10};

        System.out.println(s1.binarySearch(test,3));
    }


    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                start = mid;
            } else if (nums[mid] < target) {
                start = mid;
                // or start = mid + 1
            } else {
                end = mid;
                // or start = mid - 1
            }
        }

        if (nums[end] == target) {
            return end;
        }
        if (nums[start] == target) {
            return start;
        }
        return -1;
    }
}
