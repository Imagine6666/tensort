package aaa;

public class t1 {

    //冒泡排序
    public static void sort(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
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
