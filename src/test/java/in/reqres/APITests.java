package in.reqres;

import in.reqres.data.DataUser;
import in.reqres.data.Resourse;
import in.reqres.helpers.Assert;
import in.reqres.helpers.CustomListener;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static in.reqres.specifications.Specification.*;
import static in.reqres.specifications.Specification.deleteSpec;
import static io.restassured.RestAssured.given;

@Listeners(CustomListener.class)
public class APITests {
    @Test()
    public void testAvatar() {
        checkAvatars(getResource().getData());
    }

    @Step("Получаю ресурс страницы")
    public Resourse getResource() {
        installSpec(requestSpec(), responseSpec200());
        Resourse resourse =
                given()
                        .when()
                        .get("/api/users?page=2")
                        .then()
                        .extract().body().as(Resourse.class);
        return resourse;
    }

    @Step("Проверяем, что все аватары пользователей уникальны")
    public void checkAvatars(List<DataUser> users){
        for (int i = 0; i < users.size(); i++) {
            for (int j = i + 1; j < users.size(); j++) {
                    Assert.assertNotEquals(users.get(i).getAvatar(), users.get(j).getAvatar(), "Аватар у пользователя c id: "
                            + users.get(i).getId() + " такой же как у пользователя с id: " + users.get(j).getId());
            }
        }
        deleteSpec();
    }


}