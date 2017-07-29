# 经典排序算法的实现与总结
* [1.选择排序 Selection Sort](#1选择排序-selection-sort)
* [2.冒泡排序 Bubble Sort](#2冒泡排序-bubble-sort)
* [3.插入排序 Insertion Sort](#3插入排序-insertion-sort)
* [4.归并排序 Merge Sort](#4归并排序-merge-sort)
* [5.快速排序 Quick Sort](#5快速排序-quick-sort)
* [6.堆排序 Heap Sort](#6堆排序-heap-sort)



**所有的讨论都是基于从小到大的排序**

### 1.选择排序 Selection Sort

遍历数组元素，每一趟都选出最小的元素,每遍历一次起始位置往后挪一位……重复这一过程，直至遍历完数组。总共需要遍历n-1次数组，算法的时间复杂度为O(n^2).
排序时间与输入无关，最佳情况，最坏情况都是如此, **不稳定**。

### 2.冒泡排序 Bubble Sort

不断比较相邻元素，如果不满足约定的关系，就交换两者位置，因此大的数就会逐步后挪。从1到n-1个元素持续同样的操作，
直至排序完成。算法时间复杂度为O(n^2),排序时间与输入无关，最好，最差，平均都是O(n^2),**稳定**.

**存在的缺陷**：在排序的过程中，可能第i趟已经完成排序了，可是程序无法判断程序时候排序结束了，
会继续执行剩下的(n-i-1)趟排序

**优化方法**:设置一个标志flag,当某趟排序过程没有进行数据交换flag=0，说明
已经完成了排序，程序可以结束了。


### 3.插入排序 Insertion Sort

![Insertion Sort](https://github.com/JHWen/SortingAlogrithm/blob/master/images/Insertion-sort-example-300px.gif)

通过构建有序序列，对于每个无序序列数据，在有序序列中从后往前扫描，比较找出
合适的位置插入(有点类似整理扑克牌).算法时间复杂度为O(n^2)，稳定.

##### 具体步骤：
1. 选取第一个元素构成有序序列
2. 从第二个元素开始，从后往前扫描有序序列元素，进行比较
3. 如果无序序列元素小于有序序列元素，把有序元素往后移一位，直到找到等于或小于
当前无序元素的位置，插入该元素

4. 重复2-3步直至排序完成

最好的情况是n-1次比较,0次后移；最坏的情况是n(n-1)/2次比较，n(n-1)/2次后移。
插入排序适合数据量小的排序

### 4.归并排序 Merge Sort
![Merge Sort](https://github.com/JHWen/SortingAlogrithm/blob/master/images/Merge-sort-example-300px.gif)

归并排序是采用分治法典型的例子，核心思想是先递归分解数组，再合并数组。

- 先考虑递归分解数组，基本思路是将数组分解成left和right两部分，如果这
两个数组内部是有序的,就合并这两个数组。那么怎么判断s数组内部是有序的呢？
可以一直分解数组到只有一个元素，那么就可以认为数组内部是有序的，然后在
向上合并数组。

- 再考虑合并数组，从两个数组第一个元素开始，比较两者大小，把小的放入合并的数组中，
指针向后移一位，继续比较直到其中一个数组为空，再把另一个数组的剩余数据加入
到合并数组的后面。

[ Robert Sedgewick的大作,解释非常清晰](http://algs4.cs.princeton.edu/22mergesort/)

### 5.快速排序 Quick Sort
![Quick Sort](https://github.com/JHWen/SortingAlogrithm/blob/master/images/Quicksort-example.gif)

核心:快排是一种采用分治思想的排序算法，主要分为一下三个步骤

1. 定基准——首先随机选择一个元素作为基准(一般取第一个或者最后一个元素)

2. 划分区——所有比基准小的元素置于基准左侧，比基准大的元素置于基准右侧

3. 递归调用——递归地调用此切分过程

快速排序是不稳定的，最好的情况下时间复杂度位O(nlogn),最坏的情况下
时间复杂度为O(n^2)


### 6.堆排序 Heap Sort

![Quick Sort](https://github.com/JHWen/SortingAlogrithm/blob/master/images/Heapsort-example.gif)

核心：构建大顶堆（小顶堆），大顶堆就是每棵子树的根节点大于其左右子树。
1. 初始化构建大顶堆（小顶堆）

2. 把堆顶元素与堆最后一个元素交换，堆大小减1。

3. 调整当前堆为大顶堆（小顶堆），重复第2步操作直至堆大小为1.

