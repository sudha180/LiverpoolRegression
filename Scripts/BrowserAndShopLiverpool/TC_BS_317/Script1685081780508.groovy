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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.GID], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product1_PLP'))

WebUI.click(findTestObject('0PDPPage/GID collection/SoftLine_product1_selectButton_PDP'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/GID collection/SoftLine_product1_SelectionTick(Pink)_PDP - Copy'), 
    0)

WebUI.click(findTestObject('0PDPPage/GID collection/StickyBar_product1_close_PDP'))

WebUI.verifyElementNotPresent(findTestObject('0PDPPage/GID collection/SoftLine_product1_SelectionTick(Pink)_PDP - Copy'), 
    0)

WebUI.closeBrowser()

