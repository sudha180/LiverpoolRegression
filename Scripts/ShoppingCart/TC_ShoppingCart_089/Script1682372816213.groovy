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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLpSlgift], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('0PDPPage/Colour1_PDP'), 0)

boolean a = WebUI.verifyElementPresent(findTestObject('0PDPPage/Colour1_PDP'), FailureHandling.CONTINUE_ON_FAILURE)

if (a) {
    WebUI.click(findTestObject('0PDPPage/Colour1_PDP'), FailureHandling.STOP_ON_FAILURE)
}

boolean b = WebUI.verifyElementPresent(findTestObject('0PDPPage/Size1_PDP'), FailureHandling.CONTINUE_ON_FAILURE)

if (b) {
    WebUI.click(findTestObject('0PDPPage/Size1_PDP'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.click(findTestObject('0PDPPage/Bag_PDP'))

WebUI.verifyElementPresent(findTestObject('1vedant/cart/Product1_quantity1_cart'), 0)

WebUI.verifyElementClickable(findTestObject('1vedant/cart/product1_quantity_Add_cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1vedant/cart/product1_img_cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('1vedant/cart/product2_quantity_Add_cart'), 0)

WebUI.verifyElementNotPresent(findTestObject('1vedant/cart/Product2_remove_cart'), 0)

WebUI.verifyElementText(findTestObject('1vedant/cart/giftPrice1_cart'), '$001')

WebUI.verifyElementPresent(findTestObject('1vedant/cart/product1_name_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('1vedant/cart/giftWrapper_product1_cart'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/cart/SlGift_regaloFlag_cart'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/cart/product2_Name_Mybag_cart'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/cart/Gift_quantity_cart'), 0)

WebUI.verifyElementNotPresent(findTestObject('1vedant/cart/Product2_remove_cart'), 0)

WebUI.closeBrowser()

