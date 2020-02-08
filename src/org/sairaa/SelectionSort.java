package org.sairaa;

public class SelectionSort {
    void sort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n;i++){
            int minIndex = i;

            // find next small number
            // Find the minimum element in unsorted array
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
