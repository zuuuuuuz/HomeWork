package Home_Work_6.api;

/**
 * Строчка меню
 */
public interface IMenuRow {
    /**
     * Информация о пицце
     * @return
     */
    IPizzaInfo getDescription();

    /**
     * Стоимость пиццы
     * @return
     */
    double getPrice();
}
