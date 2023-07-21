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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'nat'], FailureHandling.STOP_ON_FAILURE)

product1price = WebUI.getText(findTestObject('1vedant/PLP/product-1-DiscountPrice_PLP'))

product2price = WebUI.getText(findTestObject('1vedant/PLP/product-2-DiscountPrice_PLP'))

product3price = WebUI.getText(findTestObject('1vedant/PLP/product-3-DiscountPrice_PLP'))

WebUI.click(findTestObject('1vedant/PLP/Sortby_PLP'))

WebUI.click(findTestObject('1vedant/PLP/relevance_SortBy_PLP'))

productAprice = WebUI.getText(findTestObject('1vedant/PLP/product-1-DiscountPrice_PLP'))

productBprice = WebUI.getText(findTestObject('1vedant/PLP/product-2-DiscountPrice_PLP'))

productCprice = WebUI.getText(findTestObject('1vedant/PLP/product-3-DiscountPrice_PLP'))

if (product1price == productAprice) {
    println('checked1')
} else {
    FailureHandling.STOP_ON_FAILURE
}

if (product2price == productBprice) {
    println('checked2')
} else {
    WebUI.closeBrowser()
}

if (product3price == productCprice) {
    println('checked3')
} else {
    WebUI.closeBrowser()
}

WebUI.closeBrowser()

