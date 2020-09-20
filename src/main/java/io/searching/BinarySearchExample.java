package io.searching;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50, 60, 70};
        int size = arr.length;
        int element1 = 10;
        int element2 = 70;
        int element3 = 40;

        int i = binarySearch(arr, size, element1);
        int i2 = binarySearch(arr, size, element2);
        int i3 = binarySearch(arr, size, element3);

        System.out.println("The position is: "+i);
        System.out.println("The position is: "+i2);
        System.out.println("The position is: "+i3);


    }

    private static int binarySearch(int arr[], int size, int element) {

        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high )/ 2;
            if (arr[mid] == element)
                return mid+1 ;
            else if (arr[mid] > element)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
