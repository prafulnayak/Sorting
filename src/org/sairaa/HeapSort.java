package org.sairaa;

public class HeapSort {
    void sort(int arr[]){
        int n = arr.length;
        for(int i = n/2 -1; i>= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n-1; i>=0; i--){
            //swap root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify to the reduced heap
            heapify(arr,i,0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i +2;

        if(left<n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right]> arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,n, largest);

        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
