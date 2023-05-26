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

WebUI.click(findTestObject('HomePageShubhum/Iniciar sesión_hp'))

WebUI.callTestCase(findTestCase('null'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

not_run: WebUI.navigateToUrl(GlobalVariable.PreOrderProductLink)

not_run: WebUI.scrollToElement(findTestObject('pdp/AddToCart_pdp'), 0)

not_run: WebUI.scrollToElement(findTestObject('pdp/QuantityTotal_pdp'), 0)

WebUI.delay(3)

WebUI.clearText(findTestObject('pdp/QuantityTotal_pdp'))

WebUI.delay(2)

WebUI.setText(findTestObject('pdp/QuantityTotal_pdp'), '999')

WebUI.delay(5)

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

not_run: WebUI.navigateToUrl(GlobalVariable.PreOrderProductLink)

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

WebUI.delay(3)

WebUI.clearText(findTestObject('pdp/QuantityTotal_pdp'))

WebUI.delay(2)

WebUI.setText(findTestObject('pdp/QuantityTotal_pdp'), '20')

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.verifyElementPresent(findTestObject('pdp/AlertMessage_pdp'), 0)

WebUI.closeBrowser()

