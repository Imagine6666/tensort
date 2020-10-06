package aaa;

public class t3 {

    //插入排序
    public static void sort(int[] nums){
        for (int i=1;i<nums.length;i++){
            int temp=nums[i];
            int j=i-1;
            while (j>=0&&nums[j]>temp){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
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
