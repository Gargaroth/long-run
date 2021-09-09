import java.util.Scanner;

public class Лабиринт {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Вы попали в лабиринт Минотавра, идите вперед (s), поворачивайте направо (r) или на лево (l), чтобы выбраться наружу. Остерегайтесь приближающихся шагов ☠");
        System.out.println("Перед вами три пути, куда вы пойдете?");

        for ( ; ; ){
            char path = in.next().charAt(0);

            switch (path) {
                case 's' :
                    System.out.println("Вы пошли прямо");
                    char turn = in.next().charAt(0);
                    switch (turn) {
                        case 's':
                            System.out.println("Вы пошли прямо, самый короткий пусть, не всегда самый быстрый");
                            char back = in.next().charAt(0);
                            switch (back) {
                                case 's':
                                    System.out.println("Вы уткнулись в тупик и вернулись в начало");
                                    break;
                                case 'r':
                                    System.out.println("Повернув на право, вы почувствовали лекгий ветерок, доносящийся из левого тунелля");
                                    char out = in.next().charAt(0);
                                    switch (out) {
                                        case 's':
                                            System.out.println("Опять тупик, гребанный лабиринт!!, подумали вы, пришлось начать с начала" );
                                            continue;
                                        case 'r':
                                            System.out.println("Минотавр ожидал вас прямо за поворотом, RIP, эх, опять двадцать пять");
                                            continue;
                                        case 'l':
                                            System.out.println("Вы видите выход перед глазами, наконец то!!");
                                            break;
                                    }
                                    break;
                                case 'l':
                                    System.out.println("Перед вами обрыв, придется возвращаться");
                                    continue;
                            }
                        break;
                        case 'r':
                            System.out.println("Вы решили повернуть направо и услышали шаги, приближающиеся из левого туннеля");
                            char out = in.next().charAt(0);
                            switch (out){
                                case 's':
                                    System.out.println("До того, как минотавр заметил, Вы успели проскочить, можно двигаться дальше");
                                    System.out.println("Дальше всего 2 пути, направо или на лево?");
                                    char exit = in.next().charAt(0);
                                    switch (exit){
                                        case 'r':
                                            System.out.println("К сожалению, повернув направо вы попавли в ловушку. Вас вернуло в начало");
                                            continue;
                                        case 'l':
                                            System.out.println("Отлично, свобода!!");
                                            break;
                                        default:
                                            System.out.println("Пришлось начать заново");
                                            continue;
                                    }

                            }
                            break;

                        case 'l':
                            System.out.println("Вы выбрали левый туннель, к сожалению выхода там не оказалось");
                            continue;
                    }
                    break;

                case 'r':
                    System.out.println("Вы повернули направо");
                    char out = in.next().charAt(0);
                    switch (out){
                        case 's':
                            System.out.println("Дальше проход закрыт, ☠");
                            continue;
                        case 'r':
                            System.out.println("Вы начинаете сходить с ума");
                            char exit = in.next().charAt(0);
                            switch (exit){
                                case 's':
                                    System.out.println("Вы попали прямиком в лапы Минотавра");
                                    continue;
                                case 'r':
                                    System.out.println("Вы потеряли рассудок и двигаетесь по кругу. RIP");
                                    continue;
                                case 'l':
                                    System.out.println("Зря я повернул направо в прошлый раз, подумали вы, падая в пропасть.");
                                    continue;
                            }
                            continue;
                        case 'l':
                            System.out.println("Пока все тихо, нужно двигаться дальше");
                            char quit = in.next().charAt(0);
                            switch (quit){
                                case 's':
                                    System.out.println("Стрелки выцарапанные на стене показывают направление, ➞");
                                    char back = in.next().charAt(0);
                                    switch (back){
                                        case 's':
                                            System.out.println("Пройдя прямо, вы наткнулись на кучу костей, похоже придется возвращаться");
                                            continue;
                                        case 'r':
                                            System.out.println("Вы доверились стрелке на стене и вышли наружу!");
                                            break;
                                        case 'l':
                                            System.out.println("Вы угодили в логово Минотавра, ему даже не пришлось вас искать.");
                                            continue;
                                    }
                                case 'r':
                                    System.out.println("Вы плутали слишком долго и умерли от истощения");
                                    continue;


                                case 'l':
                                    System.out.println("Зазстряв в текстурах, вы не смогли выбраться");
                                    continue;
                            }
                            break;
                    }
                    break;

                case 'l':
                    System.out.println("Вы повернули на лево");
                    char quit = in.next().charAt(0);
                    switch (quit) {
                        case 's':
                            System.out.println("Вы на распутье, прямо или на лево?");
                            char exit = in.next().charAt(0);
                            switch (exit) {
                                case 's':
                                    System.out.println("Опять тупик!");
                                    continue;
                                case 'l':
                                    System.out.println("В темноте на вас напало неизвестное существо, ☠");
                                    continue;
                                default:
                                    System.out.println("Выбрав неверный путь, пришлось начинать с начала");
                                    continue;
                            }
                        case 'r':
                            System.out.println("А вот и выход, он оказался ближе чем вы думали!");
                            break;

                        case 'l':
                            System.out.println("YOU DIE! ps: не ходите на лево");
                            continue;

                    }
                    break;


                default:
                    System.out.println("Вы задумались, какой выберите путь?");
                    continue;

            }
            System.out.println("Поздравляю, вы выбрались из лабиринта");
break;
        }

    }

}
