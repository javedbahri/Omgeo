package com.omgeo.bdd.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.*;
import static org.junit.Assert.*;
import com.omgeo.bdd.pages.OmgeoPage;



public class NavigationSteps {

	private OmgeoPage homePage;
	
	//Launching the browser and the Omgeo home page
    @Given("the user is on the Omgeo home page")
    public void givenTheUserIsOnOmgeoHomePage() {
    	homePage.open();
    }

    //Clicking on the About tab
    @When("the user clicks on the About tab")
    public void whenTheUserClicksOnAboutTab() {
    	homePage.clickAboutTab();
    	
    }

    //Verifying the Omgeo About Page
    @Then("the user shall be routed to the About content page")
    public void thenTheyShouldSeeTheAboutContent() {
    	String aboutContent = homePage.verifyAboutPage();
    	assertEquals("What We Bring to the Table",aboutContent);
    	
    }
    
    //Selecting the ALERT from the dropdown
    @When("the user selects ALERT from the dropdown under Find a Product section")
    public void whenTheUserSelectsAlert() {
    	homePage.selectAlert();
    	
    }
    //Verifying the omgeo Alert Page
    @Then("the user shall be routed to Omgeo Alert Page")
    public void verifyOmgeoAlertPage(){
    	homePage.verifyAlertSelection();
    }
    
    //Navigating to Leadership Team page
    @When("the user clicks on the Leadership Team link")
    public void whenTheUserClicksOnLeaderShipTeamLink() {
    	homePage.clickAboutTab();
    	homePage.clickLeaderShipLink();
    	
    }
    //Verifying the content of LeaderShip Team Pag
    @Then("the user shall be routed to Omgeo Leadership Team page")
    public void verifyLeaderShipTeamPage(){
    	homePage.verifyLeaderShipTeamPage();
    }
}
