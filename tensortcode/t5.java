package aaa;

public class t5 {

    //归并排序，分治
    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h)
            return new int[] { nums[l] };

        int mid = l + (h - l) / 2;
        //这里的代码的空间复杂度过高，开了太多数组空间！因为它只用了一个递归函数即自己本身，所以相当笨拙,为了空间复杂度的降低我们最好还是多写一个递归函数
        int[] leftArr = mergeSort(nums, l, mid); //左有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }
    public static void main(String[] args) {
        int[] nums = new int[] { 9, 8, 5, 6, 7, 4, 3, 2, 1 };
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        for (int x : newNums) {
            System.out.println(x+" ");
        }
    }

}
