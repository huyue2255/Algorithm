/**
 * Created by yuehu on 1/30/17.
 */


import java.util.ArrayList;
import java.util.Arrays;


class Subsets {

    public static void main(String[] args) {
        // TODO code application logic here
//        Sample1 s = new Sample1();

//        System.out.println(s.strStr("source", "r"));
        Subsets s = new Subsets();

        int test[] = {1, 2, 3};
        System.out.println(s.subsets(test));
    }


    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);
        dfsHelper(nums, 0, new ArrayList<Integer>(), results);
        return results;
    }

    // 1.递归的定义
    // 把所有以subset 参数开头的集合，都丢到results 里面
    //（他要做这件事情）
    private void dfsHelper(int[] nums,
                           int startIndex,
                           ArrayList<Integer> subset,
                           ArrayList<ArrayList<Integer>> results) {
        // nums = [1,2,3]
        // startIndex = 0;
        // subset = []
        // results [..]
        //2.递归的拆解
        results.add(new ArrayList<Integer>(subset));
        for (int i = startIndex; i < nums.length; i++) {
            subset.add(nums[i]); //[1]
            dfsHelper(nums, i + 1, subset, results);
            subset.remove(subset.size() - 1);
        }
        //3.递归的出口
    }
}
