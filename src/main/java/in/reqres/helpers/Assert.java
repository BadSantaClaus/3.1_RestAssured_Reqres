package in.reqres.helpers;

import io.qameta.allure.Step;

/**
 * Класс используется для переопределения ассертов
 *
 * @author Горячев Роман Юрьевич
 */
public class Assert {
    /**
     * Метод для проверки условия и выдачи сообщения о проверяемой ошибке
     *
     * @author Горячев Роман Юрьевич
     */
    @Step("Проверяем, что нет ошибки: {message}")
    public static void assertTrue(boolean condition, String message) {
        org.testng.Assert.assertTrue(condition, message);
    }

    @Step("Проверяем, что нет ошибки: {message}")
    public static void assertNotEquals(String o1, String o2, String message) {
        org.testng.Assert.assertNotEquals(o1, o2, message);
    }
}
