import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Insertion{

    public static void  insertionSort(int arr[]) {
            int len = arr.length;

            for (int i = 1; i < len; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && key < arr[j]) {
                    arr[j + 1] = arr[j];
                    --j;
                }
                arr[j + 1] = key;
            }
        }

        public static void main(String args[]) {

            In in = new In("/home/duc/Downloads/algs4-data/2Kints.txt");

            int[] a = in.readAllInts();

            int[] data;
            if (a.length > 1 && a[0] == a.length - 1) {
                data = new int[a[0]];
                System.arraycopy(a, 1, data, 0, a[0]);
            } else {
                data = a;
            }

            long start = System.currentTimeMillis();

            insertionSort(data);

            long end = System.currentTimeMillis();

            for (int x : data) {
                System.out.println(x);
            }

            System.err.printf("Sorting time: %d ms%n", (end - start));
        }
}


