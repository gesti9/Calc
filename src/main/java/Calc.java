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
                    PrintUtils.printMassage(x + y);
                    break;
                case MINUS:
                    PrintUtils.printMassage(x - y);
                    break;
                case UMNOZHIT:
                    PrintUtils.printMassage(x * y);
                    break;
                case RAZDELIT:
                    if (y == 0) {
                        PrintUtils.printMassage("Нельзя делить на 0");
                    } else {
                        PrintUtils.printMassage(x / y);
                    }
                    break;
                case STEPEN:
                    PrintUtils.printMassage(Math.pow(x,y));
                    break;
                default:
                    PrintUtils.printMassage("Ошибка вы ввели не верный символ!");
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
