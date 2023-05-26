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

WebUI.click(findTestObject('HomePageShubhum/Iniciar sesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePageShubhum/LoginButton_hp'))

WebUI.click(findTestObject('HomePageShubhum/myAccount_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('Checkout/ChangeAddress_Checkout'))

WebUI.click(findTestObject('Checkout/3DotButton2_Checkout'))

WebUI.click(findTestObject('Checkout/EditAddress_Checkout'))

WebUI.setText(findTestObject('Object Repository/DemoObjects/checkoutpage/shortName_addAddress_opc'), GlobalVariable.ShortName)

WebUI.click(findTestObject('Checkout/ContinueButtonAddAddress_Checkout'))

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.mouseOver(findTestObject('CLP/AfterLogin_hp'))

WebUI.click(findTestObject('HomePageShubhum/myAccount_hp'))

WebUI.click(findTestObject('DemoObjects/checkoutpage/deliveryAddressHeading_address_opc'))

addressBlockContainer = WebUI.getText(findTestObject('AccountManagement/addressBlockContainer_Account'))

if (addressBlockContainer == GlobalVariable.ShortName) {
    println('Checked')
}

WebUI.closeBrowser()

