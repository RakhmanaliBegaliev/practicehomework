import java.util.Arrays;
import java.util.Random;

public class Generic <S,T>{
    private S size;
    private T id;

    public Generic(S size, T id) {
        this.size = size;
        this.id = id;
    }
    public static <Integer> void met(int [] array  ){
        System.out.println(Arrays.toString(array));
    }

    public S getSize() {
        return size;
    }

    public void setSize(S size) {
        this.size = size;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "size=" + size +
                ", id=" + id +
                '}';
    }


}
