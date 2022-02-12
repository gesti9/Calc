import java.util.Scanner;

public class Calc {
    enum Operation {
        PLUS, MINUS, UMNOZHIT, RAZDELIT,STEPEN;

        public static Operation valueOfSign(String sign) {
            switch (sign) {
                case "+":
                    return PLUS;
                case "-":
                    return MINUS;
                case "*":
                    return UMNOZHIT;
                case "/":
                    return RAZDELIT;
                case "^":
                    return STEPEN;
                default:
                    throw new RuntimeException("Не тот символ");
            }
        }

        public void Rezultat(double x, double y){
            switch (this) {
                case PLUS:
                    System.out.println(x + y);
                    break;
                case MINUS:
                    System.out.println(x - y);
                    break;
                case UMNOZHIT:
                    System.out.println(x * y);
                    break;
                case RAZDELIT:
                    if (y == 0) {
                        System.out.println("Нельзя делить на 0");
                    } else {
                        System.out.println(x / y);
                    }
                    break;
                case STEPEN:
                    System.out.println(Math.pow(x,y));
                    break;
                default:
                    System.out.println("Ошибка вы ввели не верный символ!");
            }
        }
    }

    public static void  Kalk(double x, Operation operation, double y) {
        operation.Rezultat(x,y);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalk(scanner.nextDouble(),Operation.valueOfSign(scanner.next()), scanner.nextDouble());
    }
}
