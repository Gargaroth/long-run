package Expert;

public  class Car implements Cost  {
    public int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice(){
        try {
            if (price < 0){
                throw new CostError();
            }

        }catch (CostError e){
            System.out.println("Ошибка: стоимость меньше 0");

        }


        return this.getPrice();
    }




}

