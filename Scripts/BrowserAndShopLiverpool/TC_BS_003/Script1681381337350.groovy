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

WebUI.callTestCase(findTestCase('null'), [('searchTerm') : 'Jeans skinny 365 Essential Claro'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product1_PLP'))

'cart/bag present at top right corner'
WebUI.verifyElementText(findTestObject('0PDPPage/shopCart_HP'), '0')

'first present colour of radio button'
WebUI.click(findTestObject('0PDPPage/Colour1_PDP'))

'first present size of box'
WebUI.click(findTestObject('0PDPPage/Size1_PDP'))

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

'cart/bag present at top right cornern after order 1 item'
WebUI.verifyElementText(findTestObject('0PDPPage/shopCart_HP'), '1')

'second present colour of radio button'
WebUI.click(findTestObject('0PDPPage/Colour2_PDP'))

'second present size of box'
WebUI.click(findTestObject('0PDPPage/Size2_PDP'))

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

'cart/bag present at top right corner after order 2 items'
WebUI.verifyElementText(findTestObject('0PDPPage/shopCart_HP'), '2')

WebUI.closeBrowser()

