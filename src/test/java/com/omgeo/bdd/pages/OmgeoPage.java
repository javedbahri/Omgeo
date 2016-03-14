package com.omgeo.bdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.omgeo.com/")
public class OmgeoPage extends PageObject {

	@FindBy(linkText = "About")
	WebElementFacade  about;
	
	@FindBy(xpath = "//div[@id='pageWrapper']/div[2]/table/tbody/tr[3]/td/table/tbody/tr/td[3]/span[3]")
	WebElementFacade leaderShipHeading;
	
	@FindBy(xpath= "//div[@id='pageWrapper']/div[2]/table/tbody/tr[3]/td/table/tbody/tr/td[3]/span[5]")
	WebElementFacade CorporateResponsibilityHeading;
	
	@FindBy(css = "span.HeroHeaderOrange")
	WebElementFacade mainTitle;
	
	@FindBy(linkText = "ALERT")
	WebElementFacade alert;
	
	@FindBy(linkText = "Leadership Team")
	WebElementFacade leadershipTeamLink;
	
	@FindBy(css = "span.HeroHeaderPink")
	WebElementFacade omgeoAlertTitle;
	
	@FindBy(css = "span.HeroHeaderOrange")
	WebElementFacade leaderShipTeamHeading;
	
	
	public void clickAboutTab(){
		about.click();
		
	}
	/*
	 * Verifying various headings in the About tab
	 */
	public String verifyAboutPage(){
		String aboutContet = "";
		String corporateResponsibilityText = "";
		String leaderShipText = "";
		
		leaderShipText = leaderShipHeading.getText();
		assertEquals("Leadership Team",leaderShipText);
		
		corporateResponsibilityText = CorporateResponsibilityHeading.getText();
		assertEquals("Corporate Responsibility",corporateResponsibilityText);
		
		aboutContet = mainTitle.getText();
		
		return aboutContet;
	}
	
	//Selecting ALERT from the dropdown
	public void selectAlert(){
		alert.click();
	}
	
	//Verifying that Omgeo ALERT page
	public void verifyAlertSelection(){
		String omgeoAlertText = omgeoAlertTitle.getText();
		assertEquals("Omgeo ALERT",omgeoAlertText);
		
	}
	
	//navigating to Leadership Team page
	public void clickLeaderShipLink(){
		
		this.withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.linkText("Leadership Team")));
		leadershipTeamLink.click();
		
	}
	
	//verifying the content of LeaderShip Team Page
	public void verifyLeaderShipTeamPage(){
		String leaderShipTeamText = leaderShipTeamHeading.getText();
		assertEquals("Committed to propelling the industry forward", leaderShipTeamText);
	}
}