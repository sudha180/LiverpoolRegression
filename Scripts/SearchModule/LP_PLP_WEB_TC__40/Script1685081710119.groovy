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

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'jeans'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 500)

'next page (2)'
WebUI.click(findTestObject('1vedant/PLP/pagenationClickable1_PLP'))

WebUI.delay(5)

def URL = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

System.out.println(URL)

'applied filtter'
def a = 'st=sort'

'applied search'
def b = 's=jeans'

'applied search'
def c = 'page-'

'contains search'
if (URL.contains(b)) {
    System.out.println('URL contains =jeans')
} else {
    System.out.println('URL doen\'t cotains =jeans')
}

'contains sort fillter'
if (URL.contains(a)) {
    System.out.println('URL contains st=sort')
} else {
    System.out.println('URL doen\'t cotains st=sort')
}

'contains pagenation'
if (URL.contains(c)) {
    System.out.println('URL contains page')
} else {
    System.out.println('URL doen\'t cotains page')
}

WebUI.closeBrowser()

