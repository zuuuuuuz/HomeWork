package Home_Work_6.api;

/**
 * Пиццерия
 */
public interface IPizzeria {
    /**
     * Получить меню
     * @return меню с доступными для заказа пиццами
     */
    IMenu takeMenu();

    /**
     * Оформить заказ
     * @param order заказ
     * @return квиток для отслеживания
     */
    ITicket create(IOrder order);

    /**
     * Проверить состояние заказа по квитку
     * @param ticket квиток выданный при создании заказа
     * @return информация о состоянии заказа
     */
    IOrderStatus check(ITicket ticket);

    /**
     * Получить сформированный заказ
     * @param ticket квиток выданный при создании заказа
     * @return готовый заказ с тем что мы выбрали
     */
    IDoneOrder pickup(ITicket ticket);
}
