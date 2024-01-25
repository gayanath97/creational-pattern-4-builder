import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Main {
    public static void main(String[] args) {

        //constructSportsCar
        System.out.println("constructSportsCar");
        Director director = new Director();
        CarBuilder carbuilder = new CarBuilder();
        director.constructSportsCar(carbuilder);
        Car car = carbuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        //constructCityCar
        System.out.println("\nconstructCityCar");
        Director director2 = new Director();
        CarBuilder carBuilder2 = new CarBuilder();
        director2.constructCityCar(carBuilder2);
        Car car2 = carBuilder2.getResult();
        System.out.println("\nCar built:\n" + car2.getCarType());
        CarManualBuilder manualBuilder2 = new CarManualBuilder();
        director2.constructCityCar(manualBuilder2);
        Manual carManual2 = manualBuilder2.getResult();
        System.out.println("\nCar manual built:\n" + carManual2.print());

        //constructSUV
        System.out.println("\nconstructSUV");
        Director director3 = new Director();
        CarBuilder carBuilder3 = new CarBuilder();
        director3.constructSUV(carBuilder3);
        Car car3 = carBuilder3.getResult();
        System.out.println("\nCar built:\n" + car3.getCarType());
        CarManualBuilder manualBuilder3 = new CarManualBuilder();
        director3.constructSUV(manualBuilder3);
        Manual carManual3 = manualBuilder3.getResult();
        System.out.println("\nCar manual built:\n" + carManual3.print());



    }
}