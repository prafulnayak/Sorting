package org.sairaa;

public class BubbleSort {
    void sort(int arr[]){
        int n = arr.length;
        for(int i =0; i< n ; i++){
            for(int j = 0; j<n-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i =0; i< n ; i++){
            if(i ==0 && arr[i]>=1){
                arr[i] = 1;
            }else {
                if(arr[i]-arr[i-1] >1)
                    arr[i] = arr[i-1] +1;
            }
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
