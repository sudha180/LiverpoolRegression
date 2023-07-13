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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HOME_PAGE/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePageShubhum/Categoras_hp'))

WebUI.mouseOver(findTestObject('HomePageShubhum/L1Odtaqab_hp'))

not_run: WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('HomePageShubhum/L2_hp'))

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('CLP/CheckoutButton_Cart'))

WebUI.click(findTestObject('Checkout/PaymentMethod_Checkout'))

WebUI.click(findTestObject('Checkout/PaymentPopupCashNTransfers_Checkout'))

WebUI.click(findTestObject('Checkout/PaymentPopupContinueButton_checkout'))

WebUI.scrollToElement(findTestObject('Checkout/EDD_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/EDD_Checkout'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

