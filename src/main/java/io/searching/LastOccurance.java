package io.searching;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr={10,10,10,20,20,30,40};
        int[] arr2={10,10,10,20,20,30,40};
        int[] arr3={10,10,10,10,10,10};
        int element=10;
        int element2=20;
        int element3=10;
        int size=arr.length;
        System.out.println("The last Occurance of an element "+element+" is at position :"+ lastOccuranceOfAnElement(arr,size,element));
        System.out.println("The last Occurance of an element "+element2+" is at position :"+ naiveApproach(arr2,arr2.length,element2));
        System.out.println("The last Occurance of an element "+element3+" is at position :"+ lastOccuranceOfAnElement(arr3,arr3.length,element3));
    }

    private static int lastOccuranceOfAnElement(int[] arr, int size, int element) {
        int low=0;
        int end=size-1;
        while(low<=end){
            int mid=(low+end)/2;
            if(arr[mid]>element)
                end=mid-1;
            else  if(arr[mid]<element){
                low=mid+1;
            }
            else{
                if(mid==size-1|| arr[mid]!=arr[mid+1])
                    return  mid;
                else
                    low=mid+1;
            }
        }
        return  -1;
    }
    private  static  int naiveApproach(int[] arr,int size,int element){
        int pos=0;
        for(int i=0;i<size;i++){
            if(element==arr[i]){
                pos=i;
            }
        }
        return  pos;
    }


    private  static  int naiveApproach2(int[] arr,int size,int element){
        int pos=0;
        for(int i=size-1;i>=0;i--){
            if(element==arr[i]){
               return  i;
            }
        }
        return  -1;
    }
}
