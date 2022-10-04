package Home_Work_6.api;
import java.util.List;

/**
 * Готовый заказ
 */
public interface IDoneOrder {

    /**
     * Квиток по которому заказ готовился
     * @return квиток выданный при формировании заказа
     */
    ITicket getTicket();

    /**
     * Готовые пиццы приготовленные по заказу
     * @return список пицц
     */
    List<IPizza> getItems();
}
