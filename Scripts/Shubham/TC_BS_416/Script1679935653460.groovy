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

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'laptop'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP/firstProductImage_srp'))

a = WebUI.getText(findTestObject('Object Repository/1vedant/PDP/quantity_value_PDP'), 
    FailureHandling.STOP_ON_FAILURE)

if (a == 1) {
    print('checked 1')
}

WebUI.getText(findTestObject('Object Repository/1vedant/PDP/quantity_value_PDP'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('pdp/qunaityMinua_stickBar_pdp'))

WebUI.enhancedClick(findTestObject('pdp/quantityPlus_stickbar_pdp'))

b = WebUI.getText(findTestObject('Object Repository/1vedant/PDP/quantity_value_PDP'), 
    FailureHandling.STOP_ON_FAILURE)
System.out.print(b)
if (b == 2) {
    System.out.print(b)
}

WebUI.closeBrowser()

