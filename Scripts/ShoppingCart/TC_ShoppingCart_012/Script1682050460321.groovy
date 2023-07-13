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

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.Softline], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('CartPage/ClosePopupButton_Cart'))

WebUI.click(findTestObject('0PDPPage/Bag_PDP'))

WebUI.verifyElementPresent(findTestObject('1vedant/cart/Product1_quantity1_cart'), 0)

total1 = WebUI.getText(findTestObject('1vedant/cart/product1_Subtotal_cart'), FailureHandling.STOP_ON_FAILURE)

totala = total1.replace('$', '')

grandtotal1 = WebUI.getText(findTestObject('1vedant/cart/Cart_total_cart'), FailureHandling.STOP_ON_FAILURE)

grandtotala = grandtotal1.replace('$', '')

WebUI.click(findTestObject('1vedant/cart/product1_quantity_Add_cart'))

WebUI.verifyElementPresent(findTestObject('1vedant/cart/Product1_quantity2_cart'), 0)

total2 = WebUI.getText(findTestObject('1vedant/cart/product1_Subtotal_cart'), FailureHandling.STOP_ON_FAILURE)

totalb = total2.replace('$', '')

grandtotal2 = WebUI.getText(findTestObject('1vedant/cart/Cart_total_cart'), FailureHandling.STOP_ON_FAILURE)

grandtotalb = grandtotal2.replace('$', '')

if (totala != totalb) {
    System.out.println('checked')
}

if (grandtotala != grandtotalb) {
    System.out.println('checked')
}

WebUI.closeBrowser()

