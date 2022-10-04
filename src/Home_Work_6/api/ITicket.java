package Home_Work_6.api;

import java.time.LocalDateTime;

/**
 * Квиток выдаваемый к заказу
 */
public interface ITicket {

    /**
     * Уникальный номер заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalDateTime getCreatAt();

    /**
     * Заказ для которого выдали квиток
     * @return
     */
    IOrder getOrder();
}
