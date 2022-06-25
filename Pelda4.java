import java.io.*;
import java.nio.charset.Charset;

public class Pelda4 {
    static int thirdNum;
    int firstNum, secondNum, result;

    public static void main(String[] args) throws IOException, NumberFormatException, FileNotFoundException {
        // System.out.println("Hello world!");
        try {
            Test();
        } catch (TestException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("További sor");
        thirdNum = 5;
    }

    public static void Test() throws IOException, NumberFormatException, TestException {

        Pelda4 a = new Pelda4();
        Pelda4 b = new Pelda4();
        a.thirdNum = 4;
        b.thirdNum = 10;
        a.firstNum = 5;
        BufferedReader br = new BufferedReader(new FileReader("v.txt"));
        try {
            User u = new User();
            BufferedReader br2 = new BufferedReader(new FileReader("v2.txt"));
        } catch (Exception e) {
            throw new TestException("Test hiba:", e);
        }

        System.out.println("Enter a first number:");
        b.firstNum = Integer.parseInt(br.readLine());
        System.out.println("Enter a second number:");
        b.secondNum = Integer.parseInt(br.readLine());
        a.result = b.firstNum * b.secondNum;
        System.out.println("The Result is: " + a.result);

    }
}