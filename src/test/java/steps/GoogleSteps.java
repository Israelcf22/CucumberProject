package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {


    GooglePage google = new GooglePage();


    @Given("^I am on the Google search page$")  //Los simbolos  ^ y $ son necesarios para que no se confunda cucumber a la hora de ir a buscar los Given
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
    }

    @And("^Click on the search button$")
    public void clickSearchButton(){
    }

    @Then("^The results match the criteria%")
    public void validateResults(){

    }
}
