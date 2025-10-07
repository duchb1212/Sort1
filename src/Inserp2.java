
import java.util.*;

public class Inserp2 {

        public static void insertionSort2(int n, int[] arr) {
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;


                printArray(arr);
            }
        }

        private static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);
            int n = ob.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = ob.nextInt();
            }
            insertionSort2(n, arr);
            ob.close();
        }
    }

