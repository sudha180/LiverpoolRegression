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

WebUI.delay(5)

WebUI.click(findTestObject('1HomePage/CategorasDropDown_HP'))

L1 = WebUI.getText(findTestObject('1HomePage/L1_Category2_HP'))

WebUI.click(findTestObject('1HomePage/L1_Category2_HP'))

subCategory = WebUI.getText(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

'Product listing page\r\n'
WebUI.click(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

WebUI.callTestCase(findTestCase('CommonMethods/assert_L2_CLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1vedant/CLP/Left_Current_Page_CLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('1vedant/CLP/L1_leftmenu_CLP'), L1)

WebUI.verifyElementText(findTestObject('1HomePage/L2_leftmenu_HP'), subCategory)

WebUI.closeBrowser()

