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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/cart/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product3_PLP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('0PDPPage/Size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('0PDPPage/Bag_PDP'))

WebUI.click(findTestObject('1vedant/cart/comprar'))

'delete the present card to enter new card'
WebUI.callTestCase(findTestCase('CommonMethods/deleteCARD_NEWCRETED'), [:], FailureHandling.OPTIONAL)

/*	
if (a==false )
{
	WebUI.click(findTestObject('1vedant/CheckOut(CO)/close_popup_OPC'))
}
*/
WebUI.click(findTestObject('1vedant/CheckOut(CO)/paymentMethod_change_OPC'), FailureHandling.OPTIONAL)

'add new card'
WebUI.click(findTestObject('1vedant/CheckOut(CO)/addnewcard_Popup_OPC'))

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/newCardNumber_OPC'), '4343434311111111')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/newCard_alias_Addnew_cardPOPUP'), 'sharma')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/enterCardName_OPC'), 'vedant')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/enterCardExpire_OPC'), '12/24')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/enterCardCVV_OPC'), '123')

WebUI.click(findTestObject('1vedant/CheckOut(CO)/selectCardOption_save_cardpopup_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/selectCardOption_save_cardpopup_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/close_popup_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/close_popup_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/paymentMethod_change_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/card3_Option_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/selectCard1Option_cardpopup_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/selectCardOption_default_cardpopup_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/selectCardOption_save_cardpopup_OPC'), 0)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/selectCard1Option_cardpopup_OPC'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

