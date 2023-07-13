import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplication('C:\\Users\\mahi1\\OneDrive\\Desktop\\Authenticator.lnk')

pinCode = Windows.getText(findWindowsObject('Object Repository/Salesforce/Page_Salesforce Commerce Cloud Verification/copyCode_authenticator'))

println(pinCode)
WebUI.openBrowser('')

WebUI.navigateToUrl('https://bjcl-006.dx.commercecloud.salesforce.com/on/demandware.store/Sites-Site/default/ViewProductPrices_52-Dispatch?csrf_token=PWRlk9Bd0wA7tshlrSYInJ8QLaIW2KFemNtcWVenAslj6HMLGIhHy7kOHHoiWh7bxmYuguMNTTEF2AuolM1gVQJXMYh2hV5oSs4gbB9xNBPgAQhvsy83degcDVxqdW55eOOPocf_JpZdTPNX-MPZaDb06Mo_vePeV7Xc-Vrnw5yPxq33crA=')

WebUI.setText(findTestObject('Salesforce/Page_Commerce Cloud Account Manager/userName_salesForce'), 'saddepalli@kognivera.com')

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Commerce Cloud Account Manager/loginButton_SalesForce'))

WebUI.setEncryptedText(findTestObject('Object Repository/Salesforce/Page_Commerce Cloud Account Manager/input_Password_SalesForce'), 
    'lXhfQJJOrwg2pUTYRcOAuw==')

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Commerce Cloud Account Manager/loginButton_SalesForce'))

Windows.startApplication('C:\\Users\\mahi1\\OneDrive\\Desktop\\Authenticator.lnk')

pinCode = Windows.getText(findWindowsObject('Object Repository/Salesforce/Page_Salesforce Commerce Cloud Verification/copyCode_authenticator'))

//WebUI.doubleClick(findTestObject('Object Repository/Salesforce/Page_Salesforce Commerce Cloud Verification/copyCode_authenticator'))
//WebUI.click(findTestObject('Object Repository/Salesforce/Page_Salesforce Commerce Cloud Verification/em_Verify the details'))
WebUI.setText(findTestObject('Object Repository/Salesforce/Page_Salesforce Commerce Cloud Verification/input_Verification Code_input-12'), 
    pinCode)

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Salesforce Commerce Cloud Verification/button_Verify'))

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Sandbox  Home  Business Manager/span_Select a SiteSelect a SiteTotalplay Sh_382c85'))

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Sandbox  Home  Business Manager/span_Totalplay Shop'))

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Sandbox  Totalplay Shop  Business Manager/button_Open menu item submenu'))

WebUI.click(findTestObject('Object Repository/Salesforce/Page_Sandbox  Totalplay Shop  Business Manager/a_Jobs'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Salesforce/Page_Sandbox  Jobs  Business Manager/span_Jobs'), 
    0)

