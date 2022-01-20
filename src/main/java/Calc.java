import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            String vvod = scanner.next();
            double y = scanner.nextDouble();
            switch (vvod) {
                case "+":
                    System.out.println(x + y);
                    break;
                case "-":
                    System.out.println(x - y);
                    break;
                case "*":
                    System.out.println(x * y);
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Нельзя делить на 0");
                    }else {
                        System.out.println(x / y);
                    }
                    break;
                default:
                    System.out.println("Ошибка вы ввели не верный символ!");
            }

        }catch (InputMismatchException e){
            System.out.println("Вы ввели не верные данные!");
        }
    }
}
