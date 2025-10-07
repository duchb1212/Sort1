import java.util.Scanner;

public class Inserp1 {
    public static void insertionSort1 (int n,int arr[]){
        int val = arr[n-1];
        int i = n-2;

        while (i>=0 && arr[i]>val){
            arr[i+1] = arr[i];
            printarr(arr);
            i--;
        }

        arr[i+1] = val;
        printarr(arr);
    }

    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j=0;j<n;j++){
            arr[j] = sc.nextInt();
        }
        insertionSort1(n,arr);
    }
}
