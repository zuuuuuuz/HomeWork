package Home_Work_6.dto;

import Home_Work_6.api.IDoneOrder;
import Home_Work_6.api.IOrderStatus;
import Home_Work_6.api.ITicket;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pizzeria pizzeria = new Pizzeria();

        System.out.println(pizzeria.takeMenu());

        pizzeria.create(new Order("С языком и хреном 3", "Ал полло 2"));

        ITicket ticket = pizzeria.create(new Order("С языком и хреном 3", "Ал полло 2"));

        System.out.println(ticket);

        IOrderStatus checkPizza = pizzeria.check(ticket);

        System.out.println(checkPizza.isDone());
        Thread.sleep(10000);

        System.out.println(checkPizza.getHistory());
        Thread.sleep(10000);

        System.out.println(checkPizza.isDone());

        System.out.println(checkPizza.getHistory());
        Thread.sleep(10000);
        System.out.println(checkPizza.isDone());

        System.out.println(checkPizza.getHistory());
        System.out.println(checkPizza.isDone());
        Thread.sleep(10000);

        System.out.println(checkPizza.getHistory());

        System.out.println(checkPizza.isDone());


    }
}
