public class SportVehicle {
    DriveStrategy driveStrategy;

    SportVehicle(DriveStrategy obj)
    {
        driveStrategy = obj;
    }

    void drive()
    {
        driveStrategy.drive();
    }
}
