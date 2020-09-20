package io.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int size = arr.length;
        int element1 = 10;
        int element2 = 70;
        int element3 = 40;

        int i = linearSearch(arr, size, element1);
        int i2 = linearSearch(arr, size, element2);
        int i3 = linearSearch(arr, size, element3);

        System.out.println("The position is: " + i);
        System.out.println("The position is: " + i2);
        System.out.println("The position is: " + i3);
    }

    private static int linearSearch(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (element == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}
