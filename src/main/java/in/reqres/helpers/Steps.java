package in.reqres.helpers;

import in.reqres.data.*;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static in.reqres.specifications.Specification.*;
import static io.restassured.RestAssured.given;
/**
 * Класс используется для описания логики шагов прохождения тестов
 *
 * @author Горячев Роман Юрьевич
 */
public class Steps {
    /**
     * Метод для получения ресурса со списком пользователей
     *
     * @author Горячев Роман Юрьевич
     * @return ресурс со списком пользователей
     */
    @Step("Получаем список пользователей")
    public static Users getUsers() {
        installSpec(requestReqresSpec(), responseSpec200());
        Users users =
                given()
                        .when()
                        .get("/api/users?page=2")
                        .then()
                        .extract().body().as(Users.class);
        deleteSpec();
        return users;
    }
    /**
     * Метод для получения ответа авторизации с ошибкой
     *
     * @author Горячев Роман Юрьевич
     * @param email Email для ввода в логин
     * @return ответ сервера с ошибкой
     */
    @Step("Получаем ответ авторизации")
    public static ResponseMessage getErrorResponse(String email) {
        Map<String, String> body = new HashMap<>();
        body.put("email", email);
        installSpec(requestReqresSpec(), responseSpec400());
        ResponseMessage errorResponse =
                given()
                        .body(body)
                        .when()
                        .post("/api/login")
                        .then()
                        .extract().as(ResponseMessage.class);
        deleteSpec();
        return errorResponse;
    }
    /**
     * Метод для получения успешного ответа авторизации
     *
     * @author Горячев Роман Юрьевич
     * @param email email для ввода в логин
     * @param password пароль для ввода
     * @return ответ сервера с ошибкой
     */
    @Step("Получаем ответ авторизации")
    public static ResponseMessage getSuccessResponse(String email, String password) {
        Map<String, String> body = new HashMap<>();
        body.put("email", email);
        body.put("password", password);
        installSpec(requestReqresSpec(), responseSpec200());
        ResponseMessage successResponse =
                given()
                        .body(body)
                        .when()
                        .post("/api/login")
                        .then()
                        .extract().as(ResponseMessage.class);
        deleteSpec();
        return successResponse;
    }
    /**
     * Метод для получения ресурса страницы
     *
     * @author Горячев Роман Юрьевич
     * @return ресурс страницы
     */
    @Step("Получаем ресурс страницы")
    public static Resources getResources() {
        installSpec(requestReqresSpec(), responseSpec200());
        Resources resources =
                given()
                        .when()
                        .get("/api/unknown")
                        .then()
                        .extract().body().as(Resources.class);
        deleteSpec();
        return resources;
    }
    /**
     * Метод для получения ресурса страницы в формате XML
     *
     * @author Горячев Роман Юрьевич
     * @return ресурс страницы
     */
    @Step("Получаем XML страницы")
    public static Response getResponse() {
        installSpec(requestDnsSpec());
        Response response =
                given()
                        .contentType(ContentType.XML)
                        .when()
                        .get()
                        .then()
                        .extract().response();
        deleteSpec();
        return response;
    }
}

