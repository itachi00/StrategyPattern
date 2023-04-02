public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy obj)
    {
        driveStrategy = obj;
    }

    void drive()
    {
        driveStrategy.drive();
    }
}
