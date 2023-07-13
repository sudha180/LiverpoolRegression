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

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HOME_PAGE/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLSearchTerm], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('pdp/BuyNow_pdp'))

WebUI.verifyElementPresent(findTestObject('Checkout/ShippingDetails_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/deliveryAddressHeading_address_opc'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/label_Cambiar_payment_opc'), 0)

WebUI.closeBrowser()

