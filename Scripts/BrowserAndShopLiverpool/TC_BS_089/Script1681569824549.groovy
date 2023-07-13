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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpParentBTgiftSL], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('pdp/gwpRegaloLabel_pdp'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/clickAddToCart'), [:], FailureHandling.OPTIONAL)

<<<<<<< HEAD
WebUI.click(findTestObject('0PDPPage/gift_popup_submitButton_PDP'), FailureHandling.OPTIONAL)
=======
WebUI.click(findTestObject('1vedant/PDP/gift_popup_submitButton_PDP'), FailureHandling.OPTIONAL)
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('pdp/inventoryMessageforGWP_pdp'), 0)

