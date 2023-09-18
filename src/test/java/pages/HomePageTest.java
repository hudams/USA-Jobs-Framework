package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(priority = 1, enabled = true)
	public void HomePageElementTest() throws InterruptedException {
		homepage.clickLogo();
		homepage.clickSearchJobs();
		homepage.nevigateBack();
		homepage.clickCodeLists();
		homepage.nevigateBack();
		homepage.clickPastJobAnnouncements();
		homepage.nevigateBack();
		homepage.clickGeneralOverview();
		homepage.clickGeneralQuickStart();
		homepage.clickGeneralSchemas();
		homepage.clickGeneralHiringPaths();
		homepage.clickTutorials();
		homepage.clickTutorialsOverview();
		homepage.clickTutorialsSearchJobs();
		homepage.clickTutorialsCodeList();
		homepage.clickTutorialsPastJobAnnouncements();
		homepage.clickGuidesAuthentication();
		homepage.clickGuidesRateLimiting();
		homepage.clickGuidesTermsofUse();
		homepage.clickGuides();
		homepage.clickAPIReferenc();
		homepage.clickAPIReferencOverview();
		homepage.clickAPIReferencGETapiHistoricJoa();
		homepage.clickAPIReferencGETapiSearch();
		homepage.clickAPIReferencGETcodelistacademichonors();
		homepage.clickAPIReferencGETcodelistacademicclevels();
		homepage.clickAPIReferencGETcodelistactioncode();
		homepage.clickAPIReferencGETcodelistagencysubelements();
		homepage.clickAPIReferencGETcodelistannouncementclosingtype();
		homepage.clickAPIReferencGETcodelistapplicantsuppliers();
		homepage.clickAPIReferencGETcodelistapplicationstatuses();
		homepage.clickAPIReferencGETcodelistcountries();
		homepage.clickAPIReferencGETcodelistcountrysubdivisions();
		homepage.clickAPIReferencGETcodelistcyberworkgroupings();
		homepage.clickAPIReferencGETcodelistcyberworkroles();
		homepage.clickAPIReferencGETcodelistdegreetypecode();
		homepage.clickAPIReferencGETcodelistdisabilities();
		homepage.clickAPIReferencGETcodelistdocumentations();
		homepage.clickAPIReferencGETcodelistdocumentformats();
		homepage.clickAPIReferencGETcodelistethnicity();
		homepage.clickAPIReferencGETcodelistfederalemploymentstatuses();
		homepage.clickAPIReferencGETcodelistgeoloccodes();
		homepage.clickAPIReferencGETcodelistgsageoloccodes();
		homepage.clickAPIReferencGETcodelisthiringpaths();
		homepage.clickAPIReferencGETcodelistkeystandardrequirements();
		homepage.clickAPIReferencGETcodelistlanguagecodes();
		homepage.clickAPIReferencGETcodelistlanguageproficiency();
		homepage.clickAPIReferencGETcodelistlocationexpansions();
		homepage.clickAPIReferencGETcodelistmilitarystatuscodes();
		homepage.clickAPIReferencGETcodelistoccupationalseries();
		homepage.clickAPIReferencGETcodelistpayplans();
		homepage.clickAPIReferencGETcodelistpositionofferingtypes();
		homepage.clickAPIReferencGETcodelistpositionopeningstatuses();
		homepage.clickAPIReferencGETcodelistpositionscheduletypes();
		homepage.clickAPIReferencGETcodelistpostalcodes();
		homepage.clickAPIReferencGETcodelistracecodes();
		homepage.clickAPIReferencGETcodelistrefereetypecodes();
		homepage.clickAPIReferencGETcodelistremunerationrateintervalcodes();
		homepage.clickAPIReferencGETcodelistrequiredstandarddocuments();
		homepage.clickAPIReferencGETcodelistsecurityclearances();
		homepage.clickAPIReferencGETcodelistservicetypes();
		homepage.clickAPIReferencGETcodelistspecialhirings();
		homepage.clickAPIReferencGETcodelisttravelpercentages();
		homepage.clickAPIReferencGETcodelistwhomayapply();
	}

//	@Test(priority = 2, enabled = false)
//	public void clickSearchJobsTest () throws InterruptedException {
//	}
//	
//	@Test(priority = 3, enabled = false)
//	public void clickCodeListsTest () throws InterruptedException {
//	}
//	
//	@Test(priority = 4, enabled = false)
//	public void clickPastJobAnnouncementsTest() throws InterruptedException {
//	}
//	
//	@Test(priority = 5, enabled = true)
//	public void clickOverviewTest() throws InterruptedException {
//	}
//	
//	@Test(priority = 6, enabled = false)
//	public void clickQuickStartTest () throws InterruptedException {
//	}
//	
//	@Test(priority = 7, enabled = false)
//	public void clickSchemasTest() throws InterruptedException {
//	}
//	
//	@Test(priority = 8, enabled = false)
//	public void clickHiringPathsTest () throws InterruptedException {
//	}
//	
//	@Test(priority = 9, enabled = true)
//	public void clickTutorialsTest() throws InterruptedException {
//		
//	}
//	
//	@Test(priority = 6, enabled = true)
//	public void clickTutorialOverviewTest() throws InterruptedException {
//	}
//	
//	@Test(priority = 10, enabled = false)
//	public void clickGuidesTest() throws InterruptedException {
//	}
//	
//	@Test(priority = 12, enabled = false)
//	public void clickAPIReferencTest() throws InterruptedException {
}
