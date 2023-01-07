import java.util.Arrays;

public class FindPattern1 {
    public static int find(int[] pattern, int[] sequence) {
        // int a[] = sort(pattern, 0, pattern.length);  // VERSION 2
        for (int i = 0; i < sequence.length - (pattern.length - 1); i++) {
            int a[] = sort(pattern, 0, pattern.length);  // VERSION 1
            int b[] = sort(sequence, i, pattern.length);
            if (compare(a, b)) {
                return i;
            }
        }
        return -1;
    }

    public static int[] sort(int[] s,
                             int pos,
                             int length) {
        int a[] = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = s[pos + i];
        }
        Arrays.sort(a);
        return a;
    }

    public static boolean compare(int[] a,
                                  int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
