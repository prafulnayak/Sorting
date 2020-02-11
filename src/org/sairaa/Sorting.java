package org.sairaa;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        // write your code here
        System.out.print("SelectionSort\n");
        // Selection sort
        SelectionSort selectionSort = new SelectionSort();
        int [] arr = {2,5,3,7,9,10,6,1};
        selectionSort.sort(arr);
        selectionSort.printArray(arr);

        //bubble sort
        System.out.print("BubbleSort\n");
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr1 = {10,5,6,4,2,9};
        bubbleSort.sort(arr1);
        bubbleSort.printArray(arr1);

        //Insertion sort
        System.out.print("Insertion Sort\n");
        InsertionSort insertionSort = new InsertionSort();
        int [] arr2 = {10,5,6,4,2,9};
        insertionSort.sort(arr2);
        insertionSort.printArray(arr2);

        //Heap Sort
        System.out.print("Heap Sort\n");
        HeapSort heapSort = new HeapSort();
        int [] arr3 = {50,30,20,15,10,8,16,60};
        heapSort.sort(arr3);
        HeapSort.printArray(arr3);

        //Subarray with given sum
        /*
        Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

        Input:
        The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

        Output:
        For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

        Constraints:
        1 <= T <= 100
        1 <= N <= 107
        1 <= Ai <= 1010

        Example:
        Input:
        2
        5 12
        1 2 3 7 5
        10 15
        1 2 3 4 5 6 7 8 9 10
        Output:
        2 4
        1 5

        Explanation :
        Testcase1: sum of elements from 2nd position to 4th position is 12
        Testcase2: sum of elements from 1st position to 5th position is 15
         */
        //|||||||||||||||||||||||||||||||||||||||||||||||||||||
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        while (t>0){
//            int n = s.nextInt();
//            int sum = s.nextInt();
//            int[] a = new int[n];
//            for(int i =0; i<n ; i++){
//                a[i] = s.nextInt();
//            }
//            computeT(a,n,sum);
//            t--;
//        }
        //||||||||||||||||||||||||||||||||||||||||||||||||||||||||


        // Number of pairs
    /*
    Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.

    Input:
    The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test consists of three lines. The first line of each test case consists of two space separated M and N denoting size of arrays X and Y respectively. The second line of each test case contains M space separated integers denoting the elements of array X. The third line of each test case contains N space separated integers denoting elements of array Y.

    Output:
    Corresponding to each test case, print in a new line, the number of pairs such that xy > yx.

    Constraints:
    1 ≤ T ≤ 100
    1 ≤ M, N ≤ 105
    1 ≤ X[i], Y[i] ≤ 103

    Example:
    Input
    1
    3 2
    2 1 6
    1 5

    Output
    3

    Explanation:
    Testcase 1: The pairs which follow xy > yx are as such: 21 > 12,  25 > 52 and 61 > 16
     */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t>0){
            int n = s.nextInt();
            int m = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i =0; i<n ; i++){
                a[i] = s.nextInt();
            }
            for(int i =0; i<m ; i++){
                b[i] = s.nextInt();
            }
            findCompute(a,b);
            t--;
        }

    }

    private static void findCompute(int[] a, int[] b) {
        int count = 0;
        for(int i= 0; i<a.length;i++){
            for (int j = 0; j<b.length;j++){
                int x = a[i];
                int y =b[j];
                int cb = b[j];
                int ca = a[i];
                while (cb>0){
                    x = x * x;
                    cb--;
                }
                while (ca> 0){
                    y = y * y;
                    ca--;
                }
                if(x>y){
                    count++;
                }
            }
        }
        System.out.print(""+count);
    }

    private static void computeT(int[] a, int n, int sum) {
        int s =0;
        int start = 0;
        int end = 0;
        boolean found = false;
        for(int i =0; i<n;i++){
            end = i;
            start = -1;
            s= 0;
            System.out.print("ZSum: "+s+" Start: "+start+" End: "+i+" \n");
            for(int j= i;j>=0;j--){
                s = s+a[j];
                System.out.print("Sum: "+s+" Start: "+j+" End: "+i+" \n");
                if(s == sum){
                    System.out.print("ASum: "+s+" Start: "+j+" End: "+i+" \n");
                    start = j;
                    found = true;
                    break;
                    //got it
                }else if(s> sum) {
                    break;
                }
            }
            if(found)
                break;
        }
        System.out.print(""+start+" : "+end);
    }
}
