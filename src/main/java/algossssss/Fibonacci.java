package algossssss;

public class Fibonacci {


    //наивный
    // O (n)
    public static long fibNaive(int n, long[] mem) {

        if (mem[n] != -1) {
            return mem[n];
        }

        if (n <= 1) {
            return n;
        }

        long result =  fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;

        return result;
    }

    // O(n)
    public static long fibEffective(int n) {
        // O(n)
        long[] arr = new long[n + 1];

        if (n <= 1) {
            return n;
        }

        arr[0] = 0;
        arr[1] = 1;



        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }


}
