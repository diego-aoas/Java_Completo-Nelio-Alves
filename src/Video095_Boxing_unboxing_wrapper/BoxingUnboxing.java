package Video095_Boxing_unboxing_wrapper;

public class BoxingUnboxing {
    public static void main(String[] args) {

        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);
    }
}
