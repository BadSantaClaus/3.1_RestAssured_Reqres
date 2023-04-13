package in.reqres.helpers;
/**
 * Класс для предоставления аргументов тестам
 *
 * @author Горячев Роман Юрьевич
 */
public class DataProvider {
    /**
     * Метод для задания аргументов, которые будут переданы в тест
     *
     * @author Горячев Роман Юрьевич
     * @return массив аргументов для прохождения теста
     */
    @org.testng.annotations.DataProvider(name = "provideSuccessTestLogin")
    public static Object[][] provideSuccessTestLogin() {
        return new Object[][]{{"eve.holt@reqres.in", "cityslicka"}};
    }
    /**
     * Метод для задания аргументов, которые будут переданы в тест
     *
     * @author Горячев Роман Юрьевич
     * @return массив аргументов для прохождения теста
     */
    @org.testng.annotations.DataProvider(name = "provideFailTestLogin")
    public static Object[][] provideFailTestLogin() {
        return new Object[][]{{"eve.holt@reqres.in"}};
    }
    /**
     * Метод для задания аргументов, которые будут переданы в тест
     *
     * @author Горячев Роман Юрьевич
     * @return массив аргументов для прохождения теста
     */
    @org.testng.annotations.DataProvider(name = "provideTestTagsQuantity")
    public static Object[][] provideTestTagsQuantity() {
        return new Object[][]{{14}};
    }
}
