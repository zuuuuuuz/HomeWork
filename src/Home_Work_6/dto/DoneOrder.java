package Home_Work_6.dto;

import Home_Work_6.api.IDoneOrder;
import Home_Work_6.api.IPizza;
import Home_Work_6.api.ITicket;

import java.util.ArrayList;
import java.util.List;

public class DoneOrder implements IDoneOrder {

    private  ITicket ticket;


    private List<IPizza> listPizza;

    public DoneOrder(ITicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public ITicket getTicket() {
        return ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return listPizza;
    }


    public List<IPizza> getPizzas(ITicket ticket) {
        listPizza = new ArrayList<>();

        int sizeOrder = ticket.getOrder().getSelected().size();
        for (int i = 0; i < sizeOrder; i++) {
            listPizza.add(new Pizza(ticket.getOrder().getSelected()
                    .get(i).getRow().getDescription().getName(),
                    ticket.getOrder().getSelected().get(i).getRow().getDescription().getSize()));

        }return listPizza;
    }
}
