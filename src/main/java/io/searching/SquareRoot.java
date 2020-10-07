package io.searching;

public class SquareRoot {
    public static void main(String[] args) {

        int element = 10;
        System.out.println("The sqrt of " + element + " is " + sqrtByNaive(element));
        System.out.println("The sqrt of " + element + " is " + sqrtByBinarySearch(element));
    }

    private static int sqrtByNaive(int element) {
        int i = 1;
        while (i * i <= element)
            i++;

        return i - 1;
    }

    private static int sqrtByBinarySearch(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == x)
                return mid;

            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else
                end = mid - 1;
        }
        return ans;
    }
}

