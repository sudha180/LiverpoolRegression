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

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/cart/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product2_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('0PDPPage/Bag_PDP'), '0')

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

WebUI.verifyElementText(findTestObject('0PDPPage/Bag_PDP'), '1')

WebUI.click(findTestObject('0PDPPage/Bag_PDP'))

WebUI.click(findTestObject('1vedant/cart/comprar'))

WebUI.click(findTestObject('1vedant/CheckOut(CO)/paymentMethod_change_OPC'), FailureHandling.STOP_ON_FAILURE)

'select a liverpool card '
CardToSelect = WebUI.getText(findTestObject('1vedant/CheckOut(CO)/card3Name_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('1vedant/CheckOut(CO)/card3_Option_OPC'))

'to set card as default card\r\n'
WebUI.enhancedClick(findTestObject('1vedant/CheckOut(CO)/option1DropDown_setDefault_card_OPC'))

'check the card had moved upward\r\n'
CardAfterSelect = WebUI.getText(findTestObject('1vedant/CheckOut(CO)/card3Name_OPC'), FailureHandling.STOP_ON_FAILURE)

if (CardToSelect == CardAfterSelect) {
    System.out.println('checked that the card is set as default')
}

WebUI.closeBrowser()

