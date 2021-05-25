package ApiTesting;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class RestAss {

    @Test
    public void deleteUser(){
        String ep = "https://fakerestapi.azurewebsites.net/api/v1/Authors/5";
        given().when().delete(ep).then().log().body().assertThat().statusCode(200);
    }

    @Test
    public void getUsers(){
        String ep = "https://fakerestapi.azurewebsites.net/api/v1/Authors/1";
        given().
                when().
                get(ep).
                then().log().body().assertThat().statusCode(200).body("idBook",equalTo(1));

    }






}
