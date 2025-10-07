import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;


public class Selection {
    public static  void selectionSort(int arr[]) {
        int len = arr.length;
        for (int step = 0; step < len - 1; step++) {
            int idx = step;
            for (int i = step + 1; i < len; i++) {
                if (arr[i] < arr[idx]) {
                    idx = i;
                }
            }
            int tmp = arr[step];
            arr[step] = arr[idx];
            arr[idx] = tmp;
        }
    }

    public static  void main(String[] args){
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

        selectionSort(data);

        long end = System.currentTimeMillis();

        for (int x : data) {
            System.out.println(x);
        }

        System.err.printf("Sorting time: %d ms%n", (end - start));
    }
}
