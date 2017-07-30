package sorting;

import java.util.Random;

/**
 * Writer: codesky
 * Time: 2017/7/29
 * Description: 堆排序.
 */
public class HeapSort {
     final static int MAX=10000; //待排序数组大小
    
    /**
     * 调整堆->大顶堆
     * @param array 待排序数组
     * @param top 堆顶元素下标
     * @param length 待调整的堆长度
     */
    public static void adjustHeap(int array[],int top,int length){
        int temp=array[top]; //暂存堆顶元素
        //比较左右子树根结点，从大的子树向下遍历调整堆
        for(int i=2*top+1;i<length;i=i*2+1){
            //保证i为较大的子树下标
            if(i<length-1&&array[i]<array[i+1]){
                i++;
            }
            if(temp>array[i]){
                break;
            }
            array[top]=array[i];
            top=i;//向下搜索
        }
        array[top]=temp;
    }

    /**
     * 堆排序 
     * @param array 待排序数组
     */
    public static void heapSort(int array[]){
        int length=array.length;
        //初始化大顶堆
        for(int i=(length-2)/2;i>=0;i--){
            adjustHeap(array,i,length);
        }

        //每次取堆顶元素与堆尾元素交换，再重新调整成大顶堆
        for(int i=length-1;i>0;i--){
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            adjustHeap(array,0,i);
        }

    }
    
    public static void main(String[] args) {
        Random random=new Random();
        int []array=new int[MAX];
        //生成随机数测试
        for(int i=0;i<MAX;i++){
            array[i]= random.nextInt(10000);
        }
        long start=System.currentTimeMillis();
        heapSort(array);
        long end=System.currentTimeMillis();
        System.out.println("heapSorting time cost:"+(end-start)+"ms");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }
}
