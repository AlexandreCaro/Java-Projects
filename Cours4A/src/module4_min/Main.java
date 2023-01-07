package module4_min;

public class Main {

    public static int min(int a, int b){
        int m;
        if(a < b) {
            m = a;
        } else {
            m = b;
        }
        return m;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(min(a,b));
    }
}
