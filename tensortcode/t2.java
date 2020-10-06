package aaa;

public class t2 {

    //选择排序,每轮循环把这一层的最大值放到这一层的末尾
    public static void sort(int[] nums){
        int maxpos=0;
        for (int i=0;i<nums.length-1;i++){
            maxpos=0;
            for (int j=0;j<nums.length-i;j++){
                if (nums[j]>nums[maxpos]){
                    maxpos=j;
                }
            }
            int temp = nums[maxpos];
            nums[maxpos]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,8,7,6,5,4,3,2,1};
        sort(nums);
        for (int it:nums){
            System.out.println(it+" ");
        }
    }


}
