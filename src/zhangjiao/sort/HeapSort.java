package zhangjiao.sort;

public class HeapSort {

    // 获取到左孩子结点
    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    //创建堆
    //@param arr 需要排序的数组
    //@param i 需要构建堆的根节点的序号
    //@param n 数组的长度
    private static void heapAdjust(int[] arr, int i, int n) {
        int child;//孩子节点的位置
        int father;//父节点的值
        for (father = arr[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);//找到其左孩子节点

            //如果左子树小于右子树，则需要比较其右子树和根节点
            if (child != n - 1 && arr[child] < arr[child + 1])
                child++;//序列号加1，指向其右子树

            if (father < arr[child])//father的值没有变，与下面的节点的孩子节点进行比较，直到不满足跳出循环则找到位置
                arr[i] = arr[child];
            else
                break;
        }
        arr[i] = father;
    }

    //堆排序
    private static void heapSort(int[] arr) {
        //先将待排序的序列进行调整，建成一个大根堆
        for (int i = arr.length / 2; i >= 0; i--)
            heapAdjust(arr, i, arr.length);

        //逐个将根节点的值与末尾元素交换，并调整树，使其成为最大堆
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapAdjust(arr,0,i);//需要调整的树的节点总数在逐渐减少
        }
    }

    // 交换元素位置
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }




    public static void main(String[] args) {
        int[] arr = { 50, 10, 90, 30, 70, 40, 80, 60, 20 };
        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 堆排序
        heapSort(arr);

        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}
