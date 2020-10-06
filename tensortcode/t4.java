package aaa;

public class t4 {

    //快速排序,递归
    public static void sort(int[] nums,int l,int r){
        if (l>r){
            return;
        }
        int i=l,j=r;
        int base = nums[l];
        while (i!=j){
            while (nums[j]>=base&&i<j){
                j--;
            }
            while (nums[i]<=base&&i<j){
                i++;
            }
            if (i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        nums[l]=nums[i];
        nums[i]=base;
        sort(nums,l,i-1);
        sort(nums,i+1,r);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,4,7,8,5,6,3,1,2};
        sort(nums,0,nums.length-1);
        for (int it:nums){
            System.out.print(it+" ");
        }
    }


}
