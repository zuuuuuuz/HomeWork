package Home_Work_6.dto;

import Home_Work_6.api.IOrderStatus;
import Home_Work_6.api.IStage;
import Home_Work_6.api.ITicket;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class OrderStatus implements IOrderStatus {
    private ITicket ticket;

    public OrderStatus(ITicket ticket){
        this.ticket=ticket;
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IStage> getHistory() {
        List<IStage> list = new ArrayList<>();
        list.add(new Stage("Заказ был принят: ",ticket.getCreatAt().toLocalTime()));

        if (LocalTime.now().minusSeconds(10).isAfter(ticket.getCreatAt().toLocalTime())){
            list.add(new Stage("Начато приготовление пиццы: ",ticket.getCreatAt().toLocalTime().plusSeconds(10)));
        }

        if (LocalTime.now().minusSeconds(20).isAfter(ticket.getCreatAt().toLocalTime())){
            list.add(new Stage("Пицца готовится: ",ticket.getCreatAt().toLocalTime().plusSeconds(20)));
        }

        if (LocalTime.now().minusSeconds(30).isAfter(ticket.getCreatAt().toLocalTime())){
            list.add(new Stage("Заказ пакуется: ",ticket.getCreatAt().toLocalTime().plusSeconds(30)));
        }

        if (LocalTime.now().minusSeconds(40).isAfter(ticket.getCreatAt().toLocalTime())){
            list.add(new Stage("Заказ готов: ",ticket.getCreatAt().toLocalTime().plusSeconds(40)));
        }
        return list;
    }

    @Override
    public boolean isDone() {
        return LocalTime.now().minusSeconds(40).isBefore(ticket.getCreatAt().toLocalTime());
    }
}
