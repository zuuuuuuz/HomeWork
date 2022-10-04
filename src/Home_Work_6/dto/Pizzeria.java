package Home_Work_6.dto;


import Home_Work_6.api.*;

public class Pizzeria implements IPizzeria {
    private IMenu menu;
    private int number=0;
    public Pizzeria(){
        menu = new Menu();
    }

    @Override
    public IMenu takeMenu() {
        return menu;
    }

    @Override
    public ITicket create(IOrder order) {
        String ticket ;

        if (number<100){
            ++number;
            ticket =String.valueOf(number);
        }else{
            number=0;
            ticket="1";
        }
        return new Ticket(ticket,order);

    }

    @Override
    public IOrderStatus check(ITicket ticket) {
        return new OrderStatus(ticket);
    }

    @Override
    public IDoneOrder pickup(ITicket ticket) {
        return new DoneOrder(ticket);
    }
}
