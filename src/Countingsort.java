import  java.util.Scanner;

public class Countingsort {
    public static int[] countingSort(int[] arr) {
        int[] freq = new int[100];
        for (int x : arr) {
            freq[x]++;
        }
        return freq;
    }

    public static void printarr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        countingSort(arr);
        printarr(arr);
    }



}
