package Home_Work_6.dto;

import Home_Work_6.api.IStage;

import java.time.LocalTime;

public class Stage implements IStage {
    private String description;
    private LocalTime time;

    public Stage(String description, LocalTime time){
        this.description=description;
        this.time=time;
    }
    public String toString(){
        StringBuilder resultStage = new StringBuilder();
        resultStage.append(getDescription()).append(" - ")
                .append(time.getHour()).append(":")
                .append(time.getMinute()).append(":")
                .append(time.getSecond());
        return resultStage.toString();
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public LocalTime getTime() {
        return time;
    }
}
