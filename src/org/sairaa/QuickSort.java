package org.sairaa;

public class QuickSort {
    private int partition(int []a, int l, int h){
        int pivot = a[l];
        int i =l;
        int j = h;
        //int [] arr4 = {50,30,20,15,10,8,16,60, 1};
        while (i<j){
//            printArray(a);
//            while (a[i]<pivot && i<h){
//                i++;
//            }
            do{
                i++;
//                System.out.println(a[i]+" - "+pivot);
            }while (a[i]<pivot && i<h-1);
            do{
                j--;
//                System.out.println(a[j]);
            }while (a[j]>pivot);
            if(i<j){
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //swap
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;
        return j;
    }

    public void sort(int[] a, int l, int h){
        if(l<h-1){
            int j  = partition(a, l, h);
            sort(a,l,j);
            sort(a, j+1, h);
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
