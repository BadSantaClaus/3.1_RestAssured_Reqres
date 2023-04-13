package in.reqres.specifications;

import in.reqres.helpers.Properties;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
/**
 * Класс используется для задания спецификаций
 *
 * @author Горячев Роман Юрьевич
 */
public class Specification {
    /**
     * Метод для создания RequestSpecification при переходе на заданный сайт
     *
     * @author Горячев Роман Юрьевич
     */
    public  static RequestSpecification requestReqresSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(Properties.testsProperties.reqresUrl())
                .setContentType("application/json")
                .build();
    }
    /**
     * Метод для создания RequestSpecification при переходе на заданный сайт
     *
     * @author Горячев Роман Юрьевич
     */
    public  static RequestSpecification requestDnsSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(Properties.testsProperties.autodnsUrl())
                .setContentType("application/json")
                .build();
    }
    /**
     * Метод для создания ResponseSpecification с кодом ответа 201
     *
     * @author Горячев Роман Юрьевич
     */
    public static ResponseSpecification responseSpec201(){
        return new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();
    }
    /**
     * Метод для создания ResponseSpecification с кодом ответа 200
     *
     * @author Горячев Роман Юрьевич
     */
    public static ResponseSpecification responseSpec200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
    /**
     * Метод для создания ResponseSpecification с кодом ответа 400
     *
     * @author Горячев Роман Юрьевич
     */
    public static ResponseSpecification responseSpec400(){
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }
    /**
     * Метод для установки RequestSpecification
     *
     * @author Горячев Роман Юрьевич
     */
    @Step ("Устанавливаем RequestSpecification")
    public static void installSpec(RequestSpecification requestSpec){
        RestAssured.requestSpecification= requestSpec;
    }
    /**
     * Метод для установки ResponseSpecification
     *
     * @author Горячев Роман Юрьевич
     */
    @Step ("Устанавливаем ResponseSpecification")
    public static void installSpec(ResponseSpecification responseSpec){
        RestAssured.responseSpecification = responseSpec;
    }
    /**
     * Метод для установки RequestSpecification и ResponseSpecification
     *
     * @author Горячев Роман Юрьевич
     */
    @Step ("Устанавливаем RequestSpecification и ResponseSpecification")
    public static void installSpec(RequestSpecification requestSpec, ResponseSpecification responseSpec){
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }
    /**
     * Метод для удаления всех спецификаций
     *
     * @author Горячев Роман Юрьевич
     */
    @Step ("Удаляем все спецификации")
    public static void deleteSpec() {
        RestAssured.requestSpecification = null;
        RestAssured.responseSpecification = null;
    }
}
