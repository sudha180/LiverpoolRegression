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

<<<<<<< HEAD
WebUI.click(findTestObject('0PDPPage/ratingButton_PDP'))

WebUI.mouseOver(findTestObject('0PDPPage/mouseover3star_PDP'))

WebUI.click(findTestObject('0PDPPage/mouseover3star_PDP'))

WebUI.setText(findTestObject('0PDPPage/ratingView_PDP'), 'good product')

WebUI.setText(findTestObject('0PDPPage/ratingTextArea_PDP'), 'like the product money worth')

WebUI.click(findTestObject('0PDPPage/SubmitReview_PDP'))

WebUI.verifyElementText(findTestObject('0PDPPage/reviewSubmitedText_PDP'), 'Gracias por compartir tu opinión.')
=======
WebUI.click(findTestObject('1vedant/PDP/ratingButton_PDP'))

WebUI.mouseOver(findTestObject('1vedant/PDP/mouseover3star_PDP'))

WebUI.click(findTestObject('1vedant/PDP/mouseover3star_PDP'))

WebUI.setText(findTestObject('1PDP page/ratingView_PDP'), 'good product')

WebUI.setText(findTestObject('1vedant/PDP/ratingTextArea_PDP'), 'like the product money worth')

WebUI.click(findTestObject('1vedant/PDP/SubmitReview_PDP'))

WebUI.verifyElementText(findTestObject('1vedant/PDP/reviewSubmitedText_PDP'), 'Gracias por compartir tu opinión.')
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

