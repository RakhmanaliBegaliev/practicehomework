import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Generic<Integer, String> generic = new Generic<>(25,"25p");
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,100);
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if(max < array[j]){
                max = array[j];
            }
        }
        System.out.println("Max array : "+ max);

        generic.met(array);
        System.out.println(generic);


        }




    }



