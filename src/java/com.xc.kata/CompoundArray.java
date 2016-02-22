package com.xc.kata;

/**
 * You have to create a method "compoundArray" which should take as input two int arrays of different length and return one int array with numbers of both arrays shuffled one by one. Example: Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
 */
public class CompoundArray {
    /**
     * best
     * @param a
     * @param b
     * @return
     */
    public static int[] compoundArray1(int[] a, int[] b){
        int[] output = new int[a.length+b.length];
        int index=0;
        int length = (a.length > b.length) ? a.length : b.length;
        for (int i=0 ; i<length; i++){
            if (i<a.length){output[index]=a[i];
                index++;}
            if (i<b.length) {output[index]=b[i];
                index++;}
        }
        return output;
    }

    public static int[] compoundArray2(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        for (int i = 0, j = 0; i < result.length; j++) {
            if (j < a.length) result[i++] = a[j];
            if (j < b.length) result[i++] = b[j];
        }
        return result;
    }


    public static int[] compoundArray(int[] a, int[] b) {
        //Who Dares wins!

        int[] res = new int[a.length + b.length];
        if (a.length >= b.length) {
            int i = 0, j = 0, k = 0;
            for (; i < b.length * 2; i +=2) {
                res[i]=a[j];
                res[i+1]=b[k];
                j++;
                k++;
            }
            int n=b.length;
            for (int m = b.length*2;m<a.length + b.length;m++){
                res[m]=a[n];
                n++;
            }
        }else{
            int i = 0, j = 0, k = 0;
            for (; i < a.length * 2; i +=2) {
                res[i]=a[j];
                res[i+1]=b[k];
                j++;
                k++;
            }
            int n=a.length;
            for (int m = a.length*2;m<a.length + b.length;m++){
                res[m]=b[n];
                n++;
            }
        }
        return res;
    }
}
