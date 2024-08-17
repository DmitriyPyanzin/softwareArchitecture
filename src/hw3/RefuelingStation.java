package hw3;

public class RefuelingStation  implements Refueling {

    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Запрпвка дизельным топливом");
            case GasoLine -> System.out.println("Заправка бензином");
        }
    }
}
