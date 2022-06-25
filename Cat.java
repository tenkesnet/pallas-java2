import java.util.ArrayList;

public class Cat {

    public static void main(String[] tetovateve) {

        ArrayList<String> users = new ArrayList<String>();
        float a = Float.parseFloat("2.3");
        // System.out.println(user);
        System.out.println(a);
        System.out.println("Argumentum hossza: " + tetovateve.length);
        for (int i = 0; i < tetovateve.length; i++) {
            System.out.println(i + ". elem: " + tetovateve[i]);
            users.add(tetovateve[i]);
        }
        for (String elem : users) {

        }
    }
}
