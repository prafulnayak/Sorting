package org.sairaa;

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
        System.out.print("BubbleSort\n");
        InsertionSort insertionSort = new InsertionSort();
        int [] arr2 = {10,5,6,4,2,9};
        insertionSort.sort(arr2);
        insertionSort.printArray(arr2                                       );

    }
}
