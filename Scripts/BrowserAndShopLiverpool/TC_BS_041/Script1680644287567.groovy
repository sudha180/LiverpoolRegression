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

WebUI.mouseOver(findTestObject('01HomePage/CategorasDropDown_HP'))

WebUI.mouseOver(findTestObject('01HomePage/L1_Category1_HP'))

WebUI.enhancedClick(findTestObject('01HomePage/L3_categoryMenu_HP'))

'L4 category page\r\n'
WebUI.getText(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('1vedant/CLP/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('1vedant/PLP/product1_PLP'))

WebUI.click(findTestObject('0PDPPage/Colour1_PDP'))

WebUI.click(findTestObject('0PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

WebUI.delay(1)

<<<<<<< HEAD
WebUI.verifyElementText(findTestObject('0PDPPage/AddedToCart_alert_message_PDP'), 'Agregaste un producto a tu bolsa')
=======
WebUI.verifyElementText(findTestObject('1vedant/PDP/AddedToCart_alert_message_PDP'), 'Agregaste un producto a tu bolsa')
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

WebUI.closeBrowser()

