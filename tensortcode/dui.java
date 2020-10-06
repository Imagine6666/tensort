package aaa;

public class dui {
    //堆排序,还是用数组模拟，一般并不会真手写一个堆数据结构的板子，把数组看作一个完全二叉树，然后不断操作就行，这是一种原地排序，不需要额外的空间
    //事实上，我对这几种排序中，最不熟悉的就是堆排序，当然现在是比较熟悉了
    //优先队列一般用堆来实现
    public static void sort(int[] nums){
        //对每个非叶子节点调用一次堆调整函数，而且顺序是自底向上，保证这次for循环结束后的堆真的是一个最大堆
        for (int i=nums.length/2-1;i>=0;i--){
            adjustheap(nums,i,nums.length);
        }
        // 上述逻辑，建堆结束,自底向上建堆,建堆完成即代表这个数组现在是一个大顶堆
        // 下面，开始排序逻辑，其实就是每次把大顶堆的最大值取出放到“最后”，选择排序有类似的过程
        for (int i=nums.length-1;i>0;i--){
            swap(nums,0,i);
            //把最大值交换后，得重新调整一次堆，这次调整的堆的顶点的index是0，显然
            adjustheap(nums,0,i);
        }
    }

    //堆调整函数，length代表堆的边界，实际是从i到length-1处，i和length均代表index
    public static void adjustheap(int[] nums, int i, int length){
        //取顶点值
        int temp = nums[i];
        for (int k=2*i+1;k<length;k=2*k+1){
            //让k先指向子节点中最大的节点,总之就是找出左子树和右子树的最大值
            if (k+1<length&&nums[k]<nums[k+1]) {  //如果有右子树,并且右子树大于左子树
                k++;
            }
            //如果发现结点(左右子结点)大于根结点，则进行值的交换
            if (nums[k]>temp) {
                swap(nums,i,k);
                // 如果子节点更换了，那么，以子节点为根的子树会受到影响,所以，循环对子节点所在的树继续进行判断,相当于用循环迭代的方式进行了递归
                i=k;
            } else {  //不用交换，直接终止循环，同时也意味着函数的结束,优雅的代码
                break;
            }
        }
    }




    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{9,7,8,6,5,3,4,2,1};
        sort(nums);
        for (int it:nums){
            System.out.print(it+" ");
        }
    }


}
