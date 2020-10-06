package aaa;

public class guibing {

    //归并排序,即mergesort，实际上是先递归地sort，然后merge，这里给出的是二路归并
    //实际上sort函数仅仅是把数组不断分割，最终分成的单位为1，然后sort递归结束，就会自底向上递归merge
    //这里的排序都是增序
    public static void sort(int[] nums,int low,int high){
        int mid=(low+high)/2;
        if (low<high){
            sort(nums,low,mid);
            sort(nums,mid+1,high);
            //归并
            merge(nums,low,high,mid);
        }
    }

    //low-mid一组，mid+1-high一组
    public static void merge(int[]nums,int low,int high,int mid){
        //开一个缓存数组,用于归并排序，排序完成后再将其更新到原数组中，可见归并从排序不是原地排序
        //为什么不能原地排序，显然不能，因为是对两个“数组”操作，原地无法实现
        int[] temp = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while (i<=mid&&j<=high){
            if (nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }
            else {
                temp[k++]=nums[j++];
            }
        }
        while (i<=mid){
            temp[k++]=nums[i++];
        }
        while (j<=high){
            temp[k++]=nums[j++];
        }
        //这里进行对数组的更新，即把temp里的值挨个传回原nums数组
        for (int x=0;x<temp.length;x++){
            nums[low+x]=temp[x];
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{9,7,8,6,5,3,4,2,1};
        sort(nums,0,nums.length-1);
        for (int it:nums){
            System.out.print(it+" ");
        }
    }


}
