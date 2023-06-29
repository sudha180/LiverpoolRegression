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

<<<<<<< HEAD
WebUI.click(findTestObject('1HomePage/CategorasDropDown_HP'))

WebUI.click(findTestObject('1HomePage/L1_Category1_HP'))
=======
WebUI.click(findTestObject('HomePageShubhum/Categoras_hp'))

WebUI.click(findTestObject('HomePageShubhum/L1_hp'))

not_run: WebUI.click(findTestObject('PLPPage/Product_plp'))

not_run: WebUI.callTestCase(findTestCase('CommonMethods/BrowseAndNavigate_plp'), [:], FailureHandling.STOP_ON_FAILURE)
>>>>>>> 646bb8d80debf91a2e2517ec5e7537844213c0b8

WebUI.click(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

WebUI.enhancedClick(findTestObject('pdp/Share_pdp'))

WebUI.click(findTestObject('PLPPage/Link_1'))

WebUI.click(findTestObject('Object Repository/pdp/Social_Media_pdp'))

WebUI.switchToWindowTitle('Facebook')

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/Social_Link_pdp'), 0)

WebUI.closeBrowser()

