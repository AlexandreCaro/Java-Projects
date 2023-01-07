package module4_min;

public class MainTest_manually {

    public static void main(String[] args) {
        int r1 = Main.min(3, 5);

        if(r1!=3){
            System.out.println("Test 1 failed");
        }

        int r2 = Main.min(5, 3);
        if(r2!=3){
            System.out.println("Test 2 failed");
        }
    }
}
