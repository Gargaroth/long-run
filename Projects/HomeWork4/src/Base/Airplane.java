package Base;

public class Airplane implements Flyable{
    private Integer countPassengers;

    public Airplane(Integer countPassengers) {
        this.countPassengers = countPassengers;
    }

    public Integer getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(Integer countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void Fly() {
        try {
            if (countPassengers < 0){
                throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
            } else {
                System.out.println("Самолет летит");
            }
        }catch (FlyException e) {
/*      System.out.println("Ошибка: пассажиров в самолете меньше 0");
        можно не писать в throw new FlyException() какая ошибка и сделать просто вывод текста,
        не знаю какой вариант предпочтительней, просто от выбора
        зависит какой конструктор создавать в FlyException
         */

            System.out.println(e.getMessage());
        }

    }
}
