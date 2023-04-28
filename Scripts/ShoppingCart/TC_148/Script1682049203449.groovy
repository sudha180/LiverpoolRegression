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

WebUI.callTestCase(findTestCase('null'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : GlobalVariable.GWPProduct], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.verifyElementPresent(findTestObject('CartPage/GiftProduct_Cart'), 0)

WebUI.verifyElementNotPresent(findTestObject('CartPage/GiftProductQuntity_Cart'), 0)

WebUI.closeBrowser()

