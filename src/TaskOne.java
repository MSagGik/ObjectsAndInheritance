import model.FreightCar;
import model.PassengerCar;
import model.Vehicle;

public class TaskOne  {
    public static void main(String[] args) {
        minTravelTime();
        averageSpeed();
    }

    public static void minTravelTime () {
        // Инициализация объектов
        Vehicle[] vehicle = new Vehicle[3];
        vehicle[0] = new Vehicle("Lada",90,true);
        vehicle[1] = new Vehicle("Kia",105,true);
        vehicle[2] = new Vehicle("Ford",103,false);

        // Вычисление времени движения и самого скорого автомобиля
        double[] travelTime = new double[3];
        double minTravelTime = 1080000;
        int indexMinTravelTime = 0;
        for (int i = 0; i < 3; i++) {
            travelTime[i] = vehicle[i].tripDuration(240);
            if(vehicle[i].isCondition()) { // если автомобиль движется
                if(travelTime[i]<minTravelTime) { // если время движения автомобиля меньше
                    minTravelTime = travelTime[i];
                    indexMinTravelTime = i;
                }
            }

        }
        System.out.println("Первым к конечной точке придёт автомобиль " + vehicle[indexMinTravelTime]
                + " за время " + String.format("%.2f",travelTime[indexMinTravelTime]) + " секунд");
    }

    public static void averageSpeed() {
        // Инициализация объектов
        Vehicle[] vehicleDuo = new Vehicle[6];
        vehicleDuo[0] = new PassengerCar("Lada",90,true, 5);
        vehicleDuo[1] = new PassengerCar("Kia",105,true, 5);
        vehicleDuo[2] = new PassengerCar("Volkswagen",103,false, 8);
        vehicleDuo[3] = new FreightCar("Gazel",85,true, 3);
        vehicleDuo[4] = new FreightCar("Kamaz",70,true, 50);
        vehicleDuo[5] = new FreightCar("Bylaz",30,false, 100);

        double sumSpeed = 0;
        // Вычисление средней скорости
        for (int y = 0; y < 6; y++) {
            sumSpeed = sumSpeed + vehicleDuo[y].getSpeed();
        }
        double mediumSpeed =  sumSpeed/vehicleDuo.length;
        System.out.println("Средняя скорость всех транспортных средств будет равняться " + mediumSpeed + " км/час");
    }
}
