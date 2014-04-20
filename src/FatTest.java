import java.util.Scanner;

public class FatTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double weight = keyboard.nextDouble();
        if (weight >= 80.0) {
            System.out.println("肥満");
        } else {
            System.out.println("肥満ではない");
        }
    }
}
