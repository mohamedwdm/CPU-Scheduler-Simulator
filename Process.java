

public class Process {
    String processName;
    int arrivalTime;
    int BurstTime;
    int PriorityNum;
    int age;
    int waitingTime = 0;
    int turnaroundTime = 0;
    int remainingBurstTime;
    int completionTime;



    public Process(String processName, int arrivalTime, int burstTime, int priorityNum ) {
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.BurstTime = burstTime;
        this.PriorityNum = priorityNum;
        this.remainingBurstTime = burstTime;

    }




    @Override
    public String toString() {
        return "{Process Name: " + processName + ", BurstTime: " + BurstTime + "}";
    }
}
