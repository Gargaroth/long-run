import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Арифметика {
    private static Math DoubleRounder;

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = x.nextDouble();
        System.out.println("Введите второе число: ");
        double b = x.nextDouble();

        Scanner z = new Scanner(System.in);
        System.out.println("Что вы хотели бы следать: Сложить, Вычесть, Умножить, Разделить? ");
        String q = z.next();

        switch (q) {

            case "Сложить": {
                System.out.println(a+b);
                break;
            }
            case "Вычесть": {
                System.out.println(a-b);
                break;
            }
            case "Умножить": {
                System.out.println(a*b);
                break;
            }
            case "Разделить": {
                Scanner w = new Scanner(System.in);
                System.out.println("Выберите количество знаков после запятой:");
                double p = w.nextDouble();
                double o = a/b;

                System.out.printf("%.(p)f", o);
                break;
            }
            default: {
                System.out.println("Неверная команда, повторите операцию!");
            }
            }
        }
    }

