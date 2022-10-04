package Home_Work_5.Time;

public class Unit {
    public long startTime;
    public long endTime;
    public String name;

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public String getName() {
        return name;
    }
    public Unit(Long startTime,Long endTime,String name){
        this.startTime=startTime;
        this.endTime = endTime;
        this.name=name;
    }
}
