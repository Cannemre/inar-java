package week_09.assignments;

public class Stopwatch {
    private long startTime;

    private long endTime;

    Stopwatch() {
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
