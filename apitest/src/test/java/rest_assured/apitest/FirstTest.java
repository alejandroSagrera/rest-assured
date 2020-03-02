package rest_assured.apitest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FirstTest {

	@Test
	public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills() {

		given().when().get("http://zippopotam.us/us/90210").then().assertThat().body("places[0].'place name'",
				equalTo("Beverly Hills"));
	}
}
