package in.reqres.data;

import lombok.Getter;
import lombok.Setter;
/**
 * Класс используется для сериализации полученых данных в датакласс
 *
 * @author Горячев Роман Юрьевич
 */
@Setter
@Getter
public class DataResource {

    private Integer id;
    private String name;
    private String year;
    private String color;
    private String pantone_value;
}
