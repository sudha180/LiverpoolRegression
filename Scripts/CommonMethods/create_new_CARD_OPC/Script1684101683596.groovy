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

WebUI.click(findTestObject('1vedant/CheckOut(CO)/paymentMethod_change_OPC'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('1vedant/CheckOut(CO)/Payment_Method_Card_OPC'), FailureHandling.OPTIONAL)

'to set card as default card\r\n'
WebUI.click(findTestObject('1vedant/CheckOut(CO)/addnewcard_Popup_OPC'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/newCardNumber_OPC'), '4343434311111111')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/EnterCardAlias_OPC'), 'sharma')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/enterCardName_OPC'), 'vedant')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/enterCardExpire_OPC'), '12/24')

WebUI.setText(findTestObject('1vedant/CheckOut(CO)/enterCardCVV_OPC'), '123')

WebUI.click(findTestObject('1vedant/Page_/continueButton_cardPOPup_CO1'))

WebUI.delay(4)

WebUI.callTestCase(findTestCase('CommonMethods/close any pop up'), [:], FailureHandling.OPTIONAL)

