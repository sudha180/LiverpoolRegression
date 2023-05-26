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

WebUI.click(findTestObject('HomePage/Iniciar sesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Categoras_hp'))

WebUI.mouseOver(findTestObject('HomePage/L1Odtaqab_hp'))

WebUI.click(findTestObject('HomePage/L2_hp'))

WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CLP/CheckoutButton_Cart'))

WebUI.click(findTestObject('Checkout/ChangeAddress_Checkout'))

WebUI.click(findTestObject('Checkout/AddAddressButtonPopup_checkout'))

WebUI.click(findTestObject('Checkout/AddressAliase_checkout'))

WebUI.setText(findTestObject('Checkout/AddressAliase_checkout'), 'SHiv')

WebUI.click(findTestObject('Checkout/PostalCode_Checkout'))

WebUI.setText(findTestObject('Checkout/PostalCode_Checkout'), '09090')

WebUI.click(findTestObject('Checkout/SetCity_Checkout'))

WebUI.setText(findTestObject('Checkout/SetCity_Checkout'), 'Maxico')

WebUI.click(findTestObject('Checkout/StreetAddress_Checkout'))

WebUI.setText(findTestObject('Checkout/StreetAddress_Checkout'), 'SanFransisco')

WebUI.click(findTestObject('Checkout/ExtNumber_Checkout'))

WebUI.setText(findTestObject('Checkout/ExtNumber_Checkout'), '982395823')

WebUI.click(findTestObject('Checkout/CellPhone_Checkout'))

WebUI.setText(findTestObject('Checkout/CellPhone_Checkout'), '892395823')

WebUI.click(findTestObject('Checkout/ContinueButtonAddAddress_Checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout/VerifyAddressOPC_Checkout'), 0)

WebUI.scrollToElement(findTestObject('Checkout/EDD_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/EDD_Checkout'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

