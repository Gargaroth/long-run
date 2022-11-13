public class Base1 {
    public static void main(String[] args) {
        double weight = 82;
        double height = 1.78;
        double bmi = weight / (height * height);

        System.out.printf("\n%1$.11f",bmi); /* пару лет назад занимался чутка уже изучением, вот вспомнил как ограничить
        количество знаков после запятой, в примере решения указано 11 знаков после запятой, значит будет 11 :) */
    }

}




