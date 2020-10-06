package aaa;

public class xuanze {

    //选择排序，每轮选出一个最大值放到“最后”，和冒泡排序其实很像，循环的边界值值得玩味
    public static void sort(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            int maxindex=0;
            for (int j=0;j<nums.length-i;j++){
                if (nums[j]>nums[maxindex]){
                    maxindex=j;
                }
            }
            int temp = nums[maxindex];
            nums[maxindex]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,7,8,6,5,3,4,2,1};
        sort(nums);
        for (int it:nums){
            System.out.print(it+" ");
        }
    }


}
