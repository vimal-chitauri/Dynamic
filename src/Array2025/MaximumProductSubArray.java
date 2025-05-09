package Array2025;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{0,1,2,3}));
    }
    public static int maxProduct(int[] nums) {
        int result=0;
        for(int i=0;i<=nums.length-1;i++){
            for (int j = i; j <=nums.length-1; j++) {
                int product=1;
                for(int k=i; k<=j; k++){
                    //System.out.print(nums[k]);
                    product=product*nums[k];
                    if(product>=result){
                        result=product;
                    }
                }
            }

        }
        return result;
    }
}
