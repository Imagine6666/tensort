package aaa;

public class charu {

    //this code is for charu paixu
    public static void sort(int[] nums){
        //nums[i]即可看作每轮插入的数据
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
        int[] nums = new int[]{9,7,8,6,5,3,4,2,1};
        sort(nums);
        for (int it:nums){
            System.out.print(it+" ");
        }
    }


}
