package Expert;

public  class CarShopDecorator  implements Cost{
    private Cost cost;

    public CarShopDecorator(Cost cost){
        this.cost = cost;
    }

    public void sellCar(){
        if (cost.getPrice() == 5000){
            System.out.println("Здравствуйте клиент, цена этого авто: ");
            cost.getPrice();
            System.out.println("Хочешь купить авто?\n");
        }
        if (cost.getPrice() < 0){
            System.out.println("Здравствуйте клиент, цена этого авто: ");
            cost.getPrice();
            System.out.println("Давайте посмотрим другое авто\n");
        }

    }

    @Override
    public int getPrice() {
        if (cost.getPrice() == 5000){
            System.out.println("Здравствуйте клиент, цена этого авто: ");
            cost.getPrice();
            System.out.println("Хочешь купить авто?\n");
        }
        if (cost.getPrice() < 0){
            System.out.println("Здравствуйте клиент, цена этого авто: ");
            cost.getPrice();
            System.out.println("Давайте посмотрим другое авто\n");
        }
        return cost.getPrice();
    }
}
