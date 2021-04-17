import java.util.Scanner;

public class Загадка {
    public static void main(String[] args) {
        System.out.println("Давай сыграем в игру, угадай число от 0 до 10 или умрешь! У тебя есть 3 попытки");
        int number = 8;
        final int maxattemt = 3;
        int attemt = 0;
        Scanner in = new Scanner(System.in);

        while (attemt < maxattemt) {
            attemt++;
            System.out.println("Попытка не умереть"+" "+ attemt + ":");
            int value = in.nextInt();

            if (value == number) {
                System.out.println("Поздравляю, ты остался жив");
                break;
            }
            if (attemt==maxattemt) {
                System.out.println("YOU DIE!!"+" "+"💀");
                break;
            }

            if (!(value==number)) {
                continue;
            }

        }
        System.out.println("КОНЕЦ ИГРЫ!");
    }
}

