import java.util.*;
public class Quicksrt {
    public static void quicksrt(String arr[],int low,int high){
        if(low<high){
            int pivot=partition(arr, low,high);
            quicksrt(arr,low,pivot-1);
            quicksrt(arr,pivot+1,high);
        }
    }
public static int partition(String arr[],int low,int high){
    String pivot=arr[low];
    int l=low;
    int r=high;
    while(l<r){
        while(arr[l].compareTo(pivot)<=0 && l<=high){
            l++; 
        }
        while(arr[r].compareTo(pivot)>0 && r>=low){
            r--; 
        }
        if(l<r){
            String temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
    }
    arr[low]=arr[r];
    arr[r]=pivot;
    return r;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of arr");
    int n=sc.nextInt();
    String arr[]=new String[n];
    System.out.println("enter the elements of arr");
    for(int i=0;i<n;i++){
        arr[i]=sc.next();
    }
    quicksrt(arr,0,n-1);
    System.out.println("sorted arr");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+"\t");
    }
}
}
