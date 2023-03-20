package Video96_forEach;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("---------------------------------------");
        for (String obj : vect) { // obj poderia ser um nome qualquer
            System.out.println(obj);
        }

    }
}
