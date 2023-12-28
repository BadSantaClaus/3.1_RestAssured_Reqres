package in.reqres.helpers;

import in.reqres.data.DataResource;
import in.reqres.data.DataUser;
import in.reqres.data.ResponseMessage;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
/**
 * Класс используется для описания логики шагов прохождения проверок в тестах
 *
 * @author Горячев Роман Юрьевич
 */
@Slf4j
public class StepsAssert {
    /**
     * Метод для проверки, что все аватары пользователей уникальны
     *
     * @author Горячев Роман Юрьевич
     * @param users список пользователей
     */
    @Step("Проверяем, что все аватары пользователей уникальны")
    public static void checkAvatars(List<DataUser> users) {
        for (int i = 0; i < users.size(); i++) {
            for (int j = i + 1; j < users.size(); j++) {
                log.info(users.get(i).getAvatar() + " compare to " + users.get(j).getAvatar());
                Assert.assertNotEquals(users.get(i).getAvatar(), users.get(j).getAvatar(), "Аватар у пользователя c id: "
                        + users.get(i).getId() + " такой же как у пользователя с id: " + users.get(j).getId());
            }
        }
    }
    /**
     * Метод для проверки, что авторизация успешно пройдена
     *
     * @author Горячев Роман Юрьевич
     * @param successResponse успешный ответ сервера
     */
    @Step("Проверяем успешную авторизацию")
    public static void checkSuccesLogin(ResponseMessage successResponse) {
        Assert.assertTrue(successResponse.getToken() != null, "Авторизация не пройдена");
    }
    /**
     * Метод для проверки, что при авторизации без введенного пароля будет ошибка 'Missing password'
     *
     * @author Горячев Роман Юрьевич
     * @param errorToken ответ сервера с ошибкой
     */
    @Step("Проверяем, что при авторизации без введенного пароля будет ошибка 'Missing password'")
    public static void checkFailLogin(ResponseMessage errorToken) {
        Assert.assertEquals(errorToken.getError(), "Missing password", "Пароль введён");
    }
    /**
     * Метод для проверки, что ресурсы отсортированы по годам
     *
     * @author Горячев Роман Юрьевич
     * @param resources список ресурсов
     */
    @Step("Проверяем, что ресурсы отсортированы по годам")
    public static void checkResources(List<DataResource> resources) {
        for (int i = 0; i < resources.size(); i++) {
            for (int j = i + 1; j < resources.size(); j++) {
                Assert.assertTrue(Integer.parseInt(resources.get(i).getYear()) < Integer.parseInt(resources.get(j).getYear()),
                        "Год ресурса c id: " + resources.get(i).getId() +
                                " больше чем у ресурса с id: " + resources.get(j).getId());
            }
        }
    }
    /**
     * Метод для проверки, что ресурсы отсортированы по годам
     *
     * @author Горячев Роман Юрьевич
     * @param quantity количество тегов для проверки
     * @param response ответ сервера
     */
    @Step("Проверяем, что количество тэгов больше {quantity}")
    public static void checkTagsQuantity(int quantity, Response response) {
        String[] words = response.asString().split("</");
        Assert.assertEquals((words.length - 1), quantity, "Количество тэгов на странице не равно " + quantity);
    }
}
