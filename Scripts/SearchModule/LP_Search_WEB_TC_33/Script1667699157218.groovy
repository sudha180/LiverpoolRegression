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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1SRP page/a_Ordenar por'))

WebUI.click(findTestObject('Object Repository/1SRP page/button_Menor precio_srp'))

firstProductPrice_srp = WebUI.getText(findTestObject('Object Repository/1SRP page/firstProductPrice_srp'))

secondProductPrice_srp = WebUI.getText(findTestObject('Object Repository/1SRP page/secondProductPrice_srp'))

'secondProductPrice_srp' >= 'firstProductPrice_srp'

WebUI.click(findTestObject('1vedant/PLP/Sortby_PLP'))

WebUI.click(findTestObject('1vedant/PLP/HighToLowPriceSortby_PLP'))

firstProductPrice_srp = WebUI.getText(findTestObject('1vedant/PLP/product1_cardPrice_PLP'))

secondProductPrice_srp = WebUI.getText(findTestObject('1vedant/PLP/product2_cardPrice_PLP'))

'secondProductPrice_srp' <= 'firstProductPrice_srp'

WebUI.closeBrowser()

