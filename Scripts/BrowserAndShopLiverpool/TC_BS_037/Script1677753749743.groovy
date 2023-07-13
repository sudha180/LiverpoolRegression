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

WebUI.scrollToPosition(0, 350)

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'laptop'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1SRP page/firstProductImage_srp'))

WebUI.scrollToPosition(0, 400)

WebUI.verifyElementPresent(findTestObject('Object Repository/0PDPPage/quantity_value_PDP'), 0)

A = WebUI.getAttribute(findTestObject('Object Repository/0PDPPage/quantity_value_PDP'), 'value')

A = WebUI.getAttribute(findTestObject('Object Repository/1vedant/PDP/quantity_value_PDP'), 'value')

WebUI.verifyElementNotClickable(findTestObject('pdp/qunaityMinua_stickBar_pdp'))

WebUI.verifyElementPresent(findTestObject('pdp/quantityPlus_stickbar_pdp'), 0)

WebUI.enhancedClick(findTestObject('pdp/quantityPlus_stickbar_pdp'), FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
B = WebUI.getAttribute(findTestObject('Object Repository/0PDPPage/quantity_value_PDP'), 'value')
=======
B = WebUI.getAttribute(findTestObject('Object Repository/1vedant/PDP/quantity_value_PDP'), 'value')
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283
System.out.print(A)
System.out.print(B)

assert A < B

WebUI.closeBrowser()

