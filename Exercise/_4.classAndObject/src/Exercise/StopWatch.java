package Exercise;

public class StopWatch {
    private long startTime = 0, stopTime = 0;
//lấy thời điểm hiện tại của hệ thống
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
//lấy thời điểm hiện tại của hệ thống
    public void start() {
        startTime = System.currentTimeMillis();
    }
//trả về khoảng thời gian theo mili giây và giây
    public void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds.");
        System.out.println("StopWatch: " + getElapsedTimeSecs() + " seconds.");

    }

    /**
     * @param process_name
     */

    // trả vè khoảng thời gian theo mili giây và giây cộng thêm tên tiến trình
    public void stop(String process_name) {
        stopTime = System.currentTimeMillis();
        System.out.println(process_name + " StopWatch: " + getElapsedTime() + " milliseconds.");
        System.out.println(process_name + " StopWatch: " + getElapsedTimeSecs() + " seconds.");
    }

    //elaspsed time in milliseconds
    public long getElapsedTime() {
        return stopTime - startTime;

    }
    //elaspsed time in seconds
    public double getElapsedTimeSecs() {
        double elapsed;
        elapsed = ((double)(stopTime - startTime)) / 1000;
        return elapsed;
    }
}
