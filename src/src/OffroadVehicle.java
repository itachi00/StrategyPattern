public class OffroadVehicle {
    DriveStrategy driveStrategy;

    OffroadVehicle(DriveStrategy obj)
    {
        driveStrategy = obj;
    }

    void drive()
    {
        driveStrategy.drive();
    }
}
