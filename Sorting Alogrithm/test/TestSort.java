package test;

import sorting.*;

import java.util.Arrays;

/**
 * Writer: codesky
 * Time: 2017/7/30
 * Description: 测试排序算法.
 */
public class TestSort {
    final static int MAX = 200000;
    final static int RANGE = 100000;

    public static void main(String[] args) {
        int[] array, array1, array2, array3,array4,array5,array6;
        array = RandomArray.getRandomArray(MAX, RANGE);
        array1 = Arrays.copyOf(array, array.length);
        array2 = Arrays.copyOf(array, array.length);
        array3 = Arrays.copyOf(array, array.length);
        array4 = Arrays.copyOf(array, array.length);
        array5 = Arrays.copyOf(array, array.length);
        array6 = Arrays.copyOf(array, array.length);

        //冒泡排序
        long start1 = System.currentTimeMillis();
        BubbleSort.BubbleSortImprove(array1);
        long end1 = System.currentTimeMillis();
        System.out.println("1.BubbleSort time cost:"+(end1-start1)+"ms");

        //快速排序
        long start2 = System.currentTimeMillis();
        QuickSort.quickSort(array2);
        long end2 = System.currentTimeMillis();
        System.out.println("2.QuickSort time cost:"+(end2-start2)+"ms");

        //选择排序
        long start3 = System.currentTimeMillis();
        SelectionSort.selectionSort(array3);
        long end3 = System.currentTimeMillis();
        System.out.println("3.SelectSort time cost:" + (end3 - start3) + "ms");

        //堆排序
        long start4 = System.currentTimeMillis();
        HeapSort.heapSort(array4);
        long end4 = System.currentTimeMillis();
        System.out.println("4.HeapSort time cost:" + (end4 - start4) + "ms");

        //插入排序
        long start5 = System.currentTimeMillis();
        InsertionSort.insertionSort(array5);
        long end5 = System.currentTimeMillis();
        System.out.println("5.InsertSort time cost:" + (end5 - start5) + "ms");

        //归并排序
        long start6 = System.currentTimeMillis();
        MergeSort.mergeSort(array6);
        long end6 = System.currentTimeMillis();
        System.out.println("6.MergeSort time cost:" + (end6 - start6) + "ms");

    }
}
