package in.reqres.data;

import lombok.Getter;
import lombok.Setter;
/**
 * Класс используется для сериализации полученых данных в датакласс
 *
 * @author Горячев Роман Юрьевич
 */
@Getter
@Setter
public class ResponseMessage {
    /**
     * токен
     *
     * @author Горячев Роман Юрьевич
     */
    private String token;
    /**
     * ошибка
     *
     * @author Горячев Роман Юрьевич
     */
    private String error;
}

