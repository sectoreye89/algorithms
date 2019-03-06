package com.sectoreye.hard;

/**
 * Created by sectoreye on 2019-02-28.
 */
public class JumGame2 {
    public int jump(int[] nums) {
        return s2(nums);
    }

    private int s2(int[] nums) {
        int step = 0;
        int curMax = 0;
        int index = 0;

        while (curMax < nums.length - 1) {
            step++;
            int tmp = curMax;
            while (index <= tmp) {
                curMax = Math.max(curMax, index + nums[index]);
                index++;
            }
        }

        return step;
    }

    public static void main(String[] args) {
        JumGame2 jumGame2 = new JumGame2();
        jumGame2.jump(new int[]{2,1,1,1,4});
    }
}
