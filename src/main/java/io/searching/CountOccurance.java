package io.searching;

public class CountOccurance {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,20,40,40};
        int[] arr2={0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
        int size=arr.length;
        int element=20;


        System.out.println((LastOccurance.lastOccuranceOfAnElement(arr2,arr2.length,1)-FirstOccurance.firstOccuranceOfAnElement(arr2,arr2.length,1))+1);

    }

}
