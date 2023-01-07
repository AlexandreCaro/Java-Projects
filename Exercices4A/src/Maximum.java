public class Maximum {

    public static int maximum(int[] array){
        int max = array[0];

        for(int i=1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
