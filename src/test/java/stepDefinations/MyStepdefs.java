package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("Add place payload")
    public void addPlacePayload() {
    }

    @When("User calls {string} with POST http request")
    public void userCallsWithPOSTHttpRequest(String arg0) {
    }

    @Then("the API call got success with status code {int}")
    public void theAPICallGotSuccessWithStatusCode(int arg0) {
    }

    @And("{string} in response body is {string}")
    public void inResponseBodyIs(String arg0, String arg1) {
    }
}
