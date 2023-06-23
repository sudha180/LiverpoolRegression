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

WebUI.callTestCase(findTestCase('CommonMethods/login_dtaqa'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/HP_to_veda_GR_detail_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/GR list page/Event_detail_page_GR/Event_GiftCard1_GR_detail'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('1vedant/GR list page/Event_detail_page_GR/product_button_comprar_ahora_POPup_GR_detail'), 
    0)

WebUI.click(findTestObject('1vedant/GR list page/Event_detail_page_GR/product_button_comprar_ahora_POPup_GR_detail'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('1vedant/GR list page/Event_detail_page_GR/Error_notAdded_Personel_purchase'), 
    0)

