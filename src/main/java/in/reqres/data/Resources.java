package in.reqres.data;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
/**
 * Класс используется для сериализации полученых данных в датакласс
 *
 * @author Горячев Роман Юрьевич
 */
@Getter
@Setter
public class Resources {
    /**
     * номер страницы
     *
     * @author Горячев Роман Юрьевич
     */
    private Integer page;
    /**
     * Количество пользователей на странице
     *
     * @author Горячев Роман Юрьевич
     */
    private Integer per_page;
    /**
     * Всего пользователей
     *
     * @author Горячев Роман Юрьевич
     */
    private Integer total;
    /**
     * Всего страниц
     *
     * @author Горячев Роман Юрьевич
     */
    private Integer total_pages;
    /**
     * Список ресурсов
     *
     * @author Горячев Роман Юрьевич
     */
    private List<DataResource> data;
    /**
     * Техподдержка
     *
     * @author Горячев Роман Юрьевич
     */
    private Support support;
}
