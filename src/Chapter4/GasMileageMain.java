package Chapter4;

import Chapter4.GasMileage;

public class GasMileageMain {
    public static void main(String[] args) {
        GasMileage car = new GasMileage();
        car.checkMileage();
        double get = car.getMilesPerGallon();
        System.out.println(get);
        car.combinedMilesPerGallon();
        System.out.println(car.combinedMilesPerGallon());
    }
}
