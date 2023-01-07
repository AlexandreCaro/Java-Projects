import java.util.Arrays;

public class FindPattern {

    public static int find(int[] pattern, int[] sequence){
        int len = pattern.length;

        Arrays.sort(pattern);

        for(int i=0; i < sequence.length-(len-1); i++){
            if(compare(pattern, sort(sequence, i, len))){
                return i;
            }
        }
        return -1;
    }

    public static int[] sort(int[] s, int pos, int length){

        int[] a = new int[length];
        for(int i=0; i < length; i++){
            a[i] = s[pos+i];
        }
        Arrays.sort(a);
        return a;

    }

    public static boolean compare(int[] a, int[] b){
        for(int i=0; i < a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
