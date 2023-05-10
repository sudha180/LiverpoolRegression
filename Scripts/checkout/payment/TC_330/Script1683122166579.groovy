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

WebUI.navigateToUrl(GlobalVariable.url3)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/cart/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'bag'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product3_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PDP/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/PDP/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/PDP/AddToCart_PDP'))

WebUI.click(findTestObject('1vedant/PDP/Bag_PDP'))

WebUI.click(findTestObject('1vedant/cart/comprar'))

WebUI.click(findTestObject('1vedant/CheckOut(CO)/paymentMethod_change_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/selectCard1Option_cardpopup_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/selectCardOption_default_cardpopup_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/selectCardOption_save_cardpopup_OPC'), 0)

'to set card as default card\r\n'
WebUI.click(findTestObject('1vedant/CheckOut(CO)/addnewcard_Popup_OPC'))

'section present to edit is address'
WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/AddressSection_card_popup_OPC'), 0)

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/newCardNumber_OPC'), '434343666')

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/img_alias(visa)_OPC'), 0)

WebUI.closeBrowser()

