package Video059;

public class replace02 {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.replace("ab", "xy");

        System.out.println("Original: " + original);
        System.out.println("replace:  " + s01);

    }

}
