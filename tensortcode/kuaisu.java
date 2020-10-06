package aaa;

public class kuaisu {

    //this code is for kuaisupaixu,practice,review,you know?
    public static void sort(int[] nums,int l,int r){
        if (l>r){
            return;
        }
        int i=l,j=r;
        //挑选base值，可以用随机数，也可以直接用最左边的index的值
        int base=nums[l];
        //每轮快排都会把小于base的放在base的左边，大于base的放在base右边
        while (i!=j){
            //注意两个while的判断条件都带有等号，这样可以让选定的base值在循环中按兵不动，然后最后再交换两值（base和最终的i的值）
            while (nums[j]>=base&&i<j){
                j--;
            }
            while (nums[i]<=base&&i<j){
                i++;
            }
            if (i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        //执行到这里i==j是成立的
        nums[l]=nums[i];
        nums[i]=base;
        //再分别对base两边的进行递归
        sort(nums,l,i-1);
        sort(nums,i+1,r);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,7,8,6,5,3,4,2,1};
        sort(nums,0,nums.length-1);
        for (int it:nums){
            System.out.print(it+" ");
        }
    }


}
