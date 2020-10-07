package io.searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 40, 50, 60, 70};
        int size = arr.length;
        int element1 = 10;
        int element2 = 70;
        int element3 = 40;

        int i = binarySearch(arr, 0,size-1,size, element1);
        int i2 = binarySearch(arr, 0,size-1,size, element2);
        int i3 = binarySearch(arr, 0,size-1,size, element3);

        System.out.println("The position is: "+i);
        System.out.println("The position is: "+i2);
        System.out.println("The position is: "+i3);


    }

    public static int binarySearch(int[] arr, int low,int end,int size,int element) {

        if (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] == element)
                return mid + 1;
            else if (arr[mid] < element)
                return binarySearch(arr, mid + 1, end, size, element);
            else
                return binarySearch(arr, low, mid - 1, size, element);
        }

        return -1;
    }
}
