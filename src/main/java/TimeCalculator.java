public class TimeCalculator {
    public double calculateTime(double distance, double speed){
        if (speed <= 0){
            throw new IllegalArgumentException("Speed must be greater than 0");
        }
        return distance / speed;
    }
}
