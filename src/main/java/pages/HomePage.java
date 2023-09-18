package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='usajobs-nav__brand-container']")
	WebElement clickLogo;

	@FindBy(xpath = "//h3[@class='buttons_item-title' and text()=' Search Jobs ']")
	WebElement clickSearchJobs;

	@FindBy(xpath = "//h3[@class='buttons_item-title' and text()=' Code Lists ']")
	WebElement clickCodeLists;

	@FindBy(xpath = "//h3[@class='buttons_item-title' and text()=' Past job announcements ']")
	WebElement clickPastJobAnnouncements;

	@FindBy(xpath = "//li[@class='usa-current']")
	WebElement clickGeneralOverview;

	@FindBy(xpath = "//a[text()='Quick Start']")
	WebElement clickGeneralQuickStart;

	@FindBy(xpath = "//a[text()='Schemas']")
	WebElement clickGeneralSchemas;

	@FindBy(xpath = "//a[text()='Hiring Paths']")
	WebElement clickGeneralHiringPaths;

	@FindBy(xpath = "//a[text()='Tutorials']")
	WebElement clickTutorials;
	
	@FindBy(xpath = "//li[@class='usa-current']")
	WebElement clickTutorialsOverview;
	
	@FindBy(xpath = "//a[text()='Search Jobs']")
	WebElement clickTutorialsSearchJobs;
	
	@FindBy(xpath = "//a[text()='Code List']")
	WebElement clickTutorialsCodeList;
	
	@FindBy(xpath = "//a[text()='Past job announcements']")
	WebElement clickTutorialsPastJobAnnouncements;


	@FindBy(xpath = "//a[@class='usa-current' and text() = 'Guides']")
	WebElement clickGuides;
	
	@FindBy(xpath = "//li[@class='usa-current']")
	WebElement clickGuidesOverview;
	
	@FindBy(xpath = "//a[text()='Authentication']")
	WebElement clickGuidesAuthentication;
	
	@FindBy(xpath = "//a[text()='Rate Limiting']")
	WebElement clickGuidesRateLimiting;
	
	@FindBy(xpath = "//a[text()='Terms of Use']")
	WebElement clickGuidesTermsofUse;

	@FindBy(xpath = "//a[@class='usa-current']")
	WebElement clickAPIReferenc;
	
	@FindBy(xpath = "//li[@class = 'usa-current']")
	WebElement clickAPIReferencOverview;
	
	@FindBy(xpath = "//a[text() = 'GET /api/HistoricJoa']")
	WebElement clickAPIReferencGETapiHistoricJoa;
	
	@FindBy(xpath = "//a[text() = 'GET /api/Search']")
	WebElement clickAPIReferencGETapiSearch;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/academichonors']")
	WebElement clickAPIReferencGETcodelistacademichonors;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/academiclevels']")
	WebElement clickAPIReferencGETcodelistacademicclevels;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/actioncode']")
	WebElement clickAPIReferencGETcodelistactioncode;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/agencysubelements']")
	WebElement clickAPIReferencGETcodelistagencysubelements;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/announcementclosingtype']")
	WebElement clickAPIReferencGETcodelistannouncementclosingtype;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/applicantsuppliers']")
	WebElement clickAPIReferencGETcodelistapplicantsuppliers;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/applicationstatuses']")
	WebElement clickAPIReferencGETcodelistapplicationstatuses;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/countries']")
	WebElement clickAPIReferencGETcodelistcountries;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/countrysubdivisions']")
	WebElement clickAPIReferencGETcodelistcountrysubdivisions;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/cyberworkgroupings']")
	WebElement clickAPIReferencGETcodelistcyberworkgroupings;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/cyberworkroles']")
	WebElement clickAPIReferencGETcodelistcyberworkroles;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/degreetypecode']")
	WebElement clickAPIReferencGETcodelistdegreetypecode;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/disabilities']")
	WebElement clickAPIReferencGETcodelistdisabilities;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/documentations']")
	WebElement clickAPIReferencGETcodelistdocumentations;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/documentformats']")
	WebElement clickAPIReferencGETcodelistdocumentformats;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/ethnicity']")
	WebElement clickAPIReferencGETcodelistethnicity;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/federalemploymentstatuses']")
	WebElement clickAPIReferencGETcodelistfederalemploymentstatuses;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/geoloccodes']")
	WebElement clickAPIReferencGETcodelistgeoloccodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/gsageoloccodes']")
	WebElement clickAPIReferencGETcodelistgsageoloccodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/hiringpaths']")
	WebElement clickAPIReferencGETcodelisthiringpaths;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/keystandardrequirements']")
	WebElement clickAPIReferencGETcodelistkeystandardrequirements;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/languagecodes']")
	WebElement clickAPIReferencGETcodelistlanguagecodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/languageproficiency']")
	WebElement clickAPIReferencGETcodelistlanguageproficiency;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/locationexpansions']")
	WebElement clickAPIReferencGETcodelistlocationexpansions;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/militarystatuscodes']")
	WebElement clickAPIReferencGETcodelistmilitarystatuscodes;
	//
	@FindBy(xpath = "//a[text() = 'GET /codelist/missioncriticalcodes']")
	WebElement clickAPIReferencGETcodelistmissioncriticalcodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/occupationalseries']")
	WebElement clickAPIReferencGETcodelistoccupationalseries;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/payplans']")
	WebElement clickAPIReferencGETcodelistpayplans;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/positionofferingtypes']")
	WebElement clickAPIReferencGETcodelistpositionofferingtypes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/positionopeningstatuses']")
	WebElement clickAPIReferencGETcodelistpositionopeningstatuses;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/positionscheduletypes']")
	WebElement clickAPIReferencGETcodelistpositionscheduletypes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/postalcodes']")
	WebElement clickAPIReferencGETcodelistpostalcodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/racecodes']")
	WebElement clickAPIReferencGETcodelistracecodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/refereetypecodes']")
	WebElement clickAPIReferencGETcodelistrefereetypecodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/remunerationrateintervalcodes']")
	WebElement clickAPIReferencGETcodelistremunerationrateintervalcodes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/requiredstandarddocuments']")
	WebElement clickAPIReferencGETcodelistrequiredstandarddocuments;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/securityclearances']")
	WebElement clickAPIReferencGETcodelistsecurityclearances;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/servicetypes']")
	WebElement clickAPIReferencGETcodelistservicetypes;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/specialhirings']")
	WebElement clickAPIReferencGETcodelistspecialhirings;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/travelpercentages']")
	WebElement clickAPIReferencGETcodelisttravelpercentages;
	
	@FindBy(xpath = "//a[text() = 'GET /codelist/whomayapply']")
	WebElement clickAPIReferencGETcodelistwhomayapply;

	public void clickLogo() throws InterruptedException {
		clickLogo.click();
		Thread.sleep(2000);
	}

	public void clickSearchJobs() throws InterruptedException {
		clickSearchJobs.click();
		Thread.sleep(2000);
	}
	
	public void nevigateBack() {
		driver.navigate().back();
	}

	public void clickCodeLists() throws InterruptedException {
		clickCodeLists.click();
		Thread.sleep(2000);
	}

	public void clickPastJobAnnouncements() throws InterruptedException {
		clickPastJobAnnouncements.click();
		Thread.sleep(2000);
	}

	public void clickGeneralOverview() throws InterruptedException {
		clickGeneralOverview.click();
		Thread.sleep(2000);
	}

	public void clickGeneralQuickStart() throws InterruptedException {
		clickGeneralQuickStart.click();
		Thread.sleep(2000);
	}

	public void clickGeneralSchemas() throws InterruptedException {
		clickGeneralSchemas.click();
		Thread.sleep(2000);
	}

	public void clickGeneralHiringPaths() throws InterruptedException {
		clickGeneralHiringPaths.click();
		Thread.sleep(2000);
	}

	public void clickTutorials() throws InterruptedException {
		clickTutorials.click();
		Thread.sleep(2000);
	}
	
	public void clickTutorialsOverview() throws InterruptedException {
		clickTutorialsOverview.click();
		Thread.sleep(5000);
	}
	
	public void clickTutorialsSearchJobs() throws InterruptedException {
		clickTutorialsSearchJobs.click();
		Thread.sleep(2000);
	}
	
	public void clickTutorialsCodeList() throws InterruptedException {
		clickTutorialsCodeList.click();
		Thread.sleep(2000);
	}
	
	public void clickTutorialsPastJobAnnouncements() throws InterruptedException {
		clickTutorialsPastJobAnnouncements.click();
		Thread.sleep(2000);
	}

	public void clickGuides() throws InterruptedException {
		clickGuides.click();
		Thread.sleep(2000);
	}
	
	public void clickGuidesOverview() throws InterruptedException {
		clickGuidesOverview.click();
		Thread.sleep(2000);
	}
	
	public void clickGuidesAuthentication() throws InterruptedException {
		clickGuidesAuthentication.click();
		Thread.sleep(2000);
	}
	
	public void clickGuidesRateLimiting() throws InterruptedException {
		clickGuidesRateLimiting.click();
		Thread.sleep(2000);
	}
	
	public void clickGuidesTermsofUse() throws InterruptedException {
		clickGuidesTermsofUse.click();
		Thread.sleep(2000);
	}

	public void clickAPIReferenc() throws InterruptedException {
		clickAPIReferenc.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencOverview() throws InterruptedException {
		clickAPIReferencOverview.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETapiHistoricJoa() throws InterruptedException {
		clickAPIReferencGETapiHistoricJoa.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETapiSearch() throws InterruptedException {
		clickAPIReferencGETapiSearch.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistacademichonors() throws InterruptedException {
		clickAPIReferencGETcodelistacademichonors.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistacademicclevels() throws InterruptedException {
		clickAPIReferencGETcodelistacademicclevels.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistactioncode() throws InterruptedException {
		clickAPIReferencGETcodelistactioncode.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistagencysubelements() throws InterruptedException {
		clickAPIReferencGETcodelistagencysubelements.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistannouncementclosingtype() throws InterruptedException {
		clickAPIReferencGETcodelistannouncementclosingtype.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistapplicantsuppliers() throws InterruptedException {
		clickAPIReferencGETcodelistapplicantsuppliers.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistapplicationstatuses() throws InterruptedException {
		clickAPIReferencGETcodelistapplicationstatuses.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistcountries() throws InterruptedException {
		clickAPIReferencGETcodelistcountries.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistcountrysubdivisions() throws InterruptedException {
		clickAPIReferencGETcodelistcountrysubdivisions.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistcyberworkgroupings() throws InterruptedException {
		clickAPIReferencGETcodelistcyberworkgroupings.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistcyberworkroles() throws InterruptedException {
		clickAPIReferencGETcodelistcyberworkroles.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistdegreetypecode() throws InterruptedException {
		clickAPIReferencGETcodelistdegreetypecode.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistdisabilities() throws InterruptedException {
		clickAPIReferencGETcodelistdisabilities.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistdocumentations() throws InterruptedException {
		clickAPIReferencGETcodelistdocumentations.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistdocumentformats() throws InterruptedException {
		clickAPIReferencGETcodelistdocumentformats.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistethnicity() throws InterruptedException {
		clickAPIReferencGETcodelistethnicity.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistfederalemploymentstatuses() throws InterruptedException {
		clickAPIReferencGETcodelistfederalemploymentstatuses.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistgeoloccodes() throws InterruptedException {
		clickAPIReferencGETcodelistgeoloccodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistgsageoloccodes() throws InterruptedException {
		clickAPIReferencGETcodelistgsageoloccodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelisthiringpaths() throws InterruptedException {
		clickAPIReferencGETcodelisthiringpaths.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistkeystandardrequirements() throws InterruptedException {
		clickAPIReferencGETcodelistkeystandardrequirements.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistlanguagecodes() throws InterruptedException {
		clickAPIReferencGETcodelistlanguagecodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistlanguageproficiency() throws InterruptedException {
		clickAPIReferencGETcodelistlanguageproficiency.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistlocationexpansions() throws InterruptedException {
		clickAPIReferencGETcodelistlocationexpansions.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistmilitarystatuscodes() throws InterruptedException {
		clickAPIReferencGETcodelistmilitarystatuscodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistmissioncriticalcodes() throws InterruptedException {
		clickAPIReferencGETcodelistmissioncriticalcodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistoccupationalseries() throws InterruptedException {
		clickAPIReferencGETcodelistoccupationalseries.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistpayplans() throws InterruptedException {
		clickAPIReferencGETcodelistpayplans.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistpositionofferingtypes() throws InterruptedException {
		clickAPIReferencGETcodelistpositionofferingtypes.click();
		Thread.sleep(2000);
	}

	public void clickAPIReferencGETcodelistpositionopeningstatuses() throws InterruptedException {
		clickAPIReferencGETcodelistpositionopeningstatuses.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistpositionscheduletypes() throws InterruptedException {
		clickAPIReferencGETcodelistpositionscheduletypes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistpostalcodes() throws InterruptedException {
		clickAPIReferencGETcodelistpostalcodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistracecodes() throws InterruptedException {
		clickAPIReferencGETcodelistracecodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistrefereetypecodes() throws InterruptedException {
		clickAPIReferencGETcodelistrefereetypecodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistremunerationrateintervalcodes() throws InterruptedException {
		clickAPIReferencGETcodelistremunerationrateintervalcodes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistrequiredstandarddocuments() throws InterruptedException {
		clickAPIReferencGETcodelistrequiredstandarddocuments.click();
		Thread.sleep(2000);
	}

	public void clickAPIReferencGETcodelistsecurityclearances() throws InterruptedException {
		clickAPIReferencGETcodelistsecurityclearances.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistservicetypes() throws InterruptedException {
		clickAPIReferencGETcodelistservicetypes.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistspecialhirings() throws InterruptedException {
		clickAPIReferencGETcodelistspecialhirings.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelisttravelpercentages() throws InterruptedException {
		clickAPIReferencGETcodelisttravelpercentages.click();
		Thread.sleep(2000);
	}
	
	public void clickAPIReferencGETcodelistwhomayapply() throws InterruptedException {
		clickAPIReferencGETcodelistwhomayapply.click();
		Thread.sleep(2000);
	}
}
