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
    /**
     * Метод для проверки условия и выдачи сообщения о проверяемой ошибке
     *
     * @author Горячев Роман Юрьевич
     */
    @Step("Проверяем, что нет ошибки: {message}")
    public static void assertNotEquals(String firstElement, String secondElement, String message) {
        org.testng.Assert.assertNotEquals(firstElement, secondElement, message);
    }
    /**
     * Метод для проверки условия и выдачи сообщения о проверяемой ошибке
     *
     * @author Горячев Роман Юрьевич
     */
    @Step("Проверяем, что нет ошибки: {message}")
    public static void assertEquals(String firstElement, String secondElement, String message) {
        org.testng.Assert.assertEquals(firstElement, secondElement, message);
    }
    /**
     * Метод для проверки условия и выдачи сообщения о проверяемой ошибке
     *
     * @author Горячев Роман Юрьевич
     */
    @Step("Проверяем, что нет ошибки: {message}")
    public static void assertEquals(Integer firstElement, Integer secondElement, String message) {
        org.testng.Assert.assertEquals(firstElement, secondElement, message);
    }

}
