package in.reqres.data;

import lombok.Getter;
import lombok.Setter;
/**
 * Класс используется для сериализации аттрибута data
 *
 * @author Горячев Роман Юрьевич
 */
@Getter
@Setter
public class DataUser {
    /**
     * id
     *
     * @author Горячев Роман Юрьевич
     */
    private Integer id;
    /**
     * email адрес
     *
     * @author Горячев Роман Юрьевич
     */
    private String email;
    /**
     * имя
     *
     * @author Горячев Роман Юрьевич
     */
    private String first_name;
    /**
     * фамилия
     *
     * @author Горячев Роман Юрьевич
     */
    private String last_name;
    /**
     * аватарка
     *
     * @author Горячев Роман Юрьевич
     */
    private String avatar;
}
