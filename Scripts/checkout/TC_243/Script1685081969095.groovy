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

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePageShubhum/Iniciar sesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.GRuser, ('password') : GlobalVariable.GRpassword], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.MKPProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('Checkout/ChangeAddress_Checkout'))

WebUI.click(findTestObject('Checkout/AddressPopupCLickNCollect_Checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout/ClickNCollectionRadioButton_Checkout'))

WebUI.click(findTestObject('Checkout/ClickNCollectionSelectEvent_Checkout'))

WebUI.click(findTestObject('Checkout/OptionOfSelectEvent_Checkout'))

WebUI.click(findTestObject('Checkout/ContinueButtonClickNCollectPopup_Checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout/DefaultAddress_Checkout'), 0)

WebUI.closeBrowser()

