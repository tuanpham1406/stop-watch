import java.util.*;

public class StopWatch {
    private double startTime;
    private double endTime;
    public double getStartTime() {
        return startTime;
    }
    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }
    public double getEndTime() {
        return endTime;
    }
    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
    public void startTime() {

    }
    public double start() {
        return startTime = System.currentTimeMillis();
    }
    public double stop() {
        return endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Date date = new Date();
        System.out.println("Time start:");
        stopWatch.start();
        System.out.println(new Date() + "\n");
        System.out.println("Time end:");
        stopWatch.stop();
        System.out.println(new Date() + "\n");
        System.out.println("Difference is: " + stopWatch.getElapsedTime());
    }
}
