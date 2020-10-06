package aaa;

public class maopao {

    public static void sort(int[] nums){
        //冒泡排序值得注意的一个tips是i+j=nums.length-1
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-i-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
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
