package test;

import java.util.Random;

/**
 * Writer: codesky
 * Time: 2017/7/30
 * Description: 随机数组生成.
 */
public class RandomArray {

    /**
     * 生成一组随机数
     *
     * @param n 生成的随机数的数量
     * @param range 随机数范围
     * @return 随机数组
     */
    public static int[] getRandomArray(int n,int range) {
        Random rand = new Random();
        int []array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=rand.nextInt(range);
        }
        return array;
    }
}
