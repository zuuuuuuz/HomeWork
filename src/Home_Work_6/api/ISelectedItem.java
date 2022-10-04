package Home_Work_6.api;
/**
 * Выбор покупателя
 */
public interface ISelectedItem {
    /**
     * Выбранное из меню
     * @return
     */
    IMenuRow getRow();

    /**
     * Количество выбранного
     * @return
     */
    int getCount();
}
