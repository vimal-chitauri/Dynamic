package dynamic2025;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr= new int[]{2,1,4,9};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }
    private static int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }

        int right=rob(nums, i - 2) + nums[i];
        int left=rob(nums, i - 1);
        return Math.max(right,left );
    }
}
