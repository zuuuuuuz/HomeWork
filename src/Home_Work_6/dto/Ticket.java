package Home_Work_6.dto;

import Home_Work_6.api.IOrder;
import Home_Work_6.api.ITicket;

import java.time.LocalDateTime;

public class Ticket implements ITicket {


    private String number;

    private final LocalDateTime createAt;

    private IOrder order;
    public Ticket(String number, IOrder order) {
        this.number = number;
        this.order = order;
        this.createAt = LocalDateTime.now();
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public LocalDateTime getCreatAt() {
        return createAt;
    }

    @Override
    public IOrder getOrder() {
        return order;
    }
    public String toString() {

        StringBuilder str = new StringBuilder();

        str.append("заказ номер: ")
                .append(getNumber()).append("\n");
        str.append("Заказ оформлен в ").append(createAt.getHour())
                .append(":").append(createAt.getMinute()).append("\n");
        str.append(order);

        return str.toString();
    }

}
