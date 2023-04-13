package in.reqres;

import in.reqres.helpers.CustomListener;
import in.reqres.helpers.DataProvider;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static in.reqres.helpers.Steps.*;
import static in.reqres.helpers.StepsAssert.*;
/**
 * Класс используется для запуска тестов
 *
 * @author Горячев Роман Юрьевич
 */
@Listeners(CustomListener.class)
public class APITests {
    /**
     * Метод для запуска теста "Проверка, что аватары пользователей уникальны"
     *
     * @author Горячев Роман Юрьевич
     */
    @Feature("Проверка, что аватары пользователей уникальны")
    @Test
    public void testAvatar() {
        checkAvatars(getUsers().getData());
    }
    /**
     * Метод для запуска теста "Проверка на успешное логирование"
     *
     * @author Горячев Роман Юрьевич
     * @param email email адрес для логина
     * @param password пароль
     */
    @Feature("Проверка на успешное логирование")
    @Test(dataProvider = "provideSuccessTestLogin", dataProviderClass = DataProvider.class)
    public void testSuccessLogin(String email, String password) {
        checkSuccesLogin(getSuccessResponse(email, password));
    }
    /**
     * Метод для запуска теста "Проверка на логирование без ввода пароля"
     *
     * @author Горячев Роман Юрьевич
     * @param email пароль
     */
    @Feature("Проверка на логирование без ввода пароля")
    @Test(dataProvider = "provideFailTestLogin", dataProviderClass = DataProvider.class)
    public void testFailLogin(String email) {
        checkFailLogin(getErrorResponse(email));
    }
    /**
     * Метод для запуска теста "Проверка порядка расположения ресурсов в зависимости от года"
     *
     * @author Горячев Роман Юрьевич
     */
    @Feature("Проверка порядка расположения ресурсов в зависимости от года")
    @Test
    public void testResources() {
        checkResources(getResources().getData());
    }
    /**
     * Метод для запуска теста "Проверка количсетва тегов"
     *
     * @author Горячев Роман Юрьевич
     * @param tagsQuantity количество тегов для проверки
     */
    @Feature("Проверка количсетва тегов")
    @Test(dataProvider = "provideTestTagsQuantity", dataProviderClass = DataProvider.class)
    public void testTagsQuantity(int tagsQuantity) {
        checkTagsQuantity(tagsQuantity, getResponse());
    }
}