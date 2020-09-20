package io.searching;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr={10,10,10,20,20,30,40};
        int[] arr2={10,10,10,20,20,30,40};
        int element=10;
        int element2=20;
        int size=arr.length;
        System.out.println("The first Occurance of an element "+element+" is at position :"+ firstOccuranceOfAnElement(arr,size,element));
        System.out.println("The first Occurance of an element "+element2+" is at position :"+ firstOccuranceOfAnElement(arr,size,element2));
    }
    private static int firstOccuranceOfAnElement(int[] arr,int size,int element){
        int low=0;
        int end=size-1;
        while (low<=end){
            int mid=(low+end)/2;
            if(arr[mid]<element)
                low=mid+1;
            else  if(arr[mid]>element)
                end=mid-1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                    return  mid;
                else
                    end=mid-1;
            }
        }
        return  -1;
    }
}
