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

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.maximizeWindow()

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : 'UN85@digisprint.com', ('password') : 'Un85@12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

'gift item\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpWithSingleVariantWith2Gifts], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product1_PLP'), FailureHandling.OPTIONAL)

<<<<<<< HEAD
WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))
=======
WebUI.click(findTestObject('1vedant/PDP/AddToCart_PDP'))
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

WebUI.callTestCase(findTestCase('CommonMethods/Check_gift_product_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

'digital item flag\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.digitalP], FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
WebUI.verifyElementPresent(findTestObject('0PDPPage/digital_item_flag_PDP'), 0)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))
=======
WebUI.verifyElementPresent(findTestObject('1vedant/PDP/digital_item_flag_PDP'), 0)

WebUI.click(findTestObject('1vedant/PDP/AddToCart_PDP'))
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

'market place '
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : '1030531937'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product1_PLP'), FailureHandling.OPTIONAL)

<<<<<<< HEAD
WebUI.verifyElementPresent(findTestObject('0PDPPage/marketPlase_sellerBY_link_PDP'), 0)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))
=======
WebUI.verifyElementPresent(findTestObject('1vedant/PDP/marketPlase_sellerBY_link_PDP'), 0)

WebUI.click(findTestObject('1vedant/PDP/AddToCart_PDP'))
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'can'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_highTOlow_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_lowTOhigh_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'ropa'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/facet(liverpool)_CheckBox_selected_check_PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PLP/product3_PLP'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('CommonMethods/UpdateQuantity_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.callTestCase(findTestCase('CommonMethods/Submit_Rating_PDP'), [:], FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('pdp/ProductImage_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

<<<<<<< HEAD
not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)
=======
not_run: WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Quantity(plus)_PDP'), 0)
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/carousels_pdp'))

not_run: WebUI.click(findTestObject('pdp/button_Agregar a mi bolsa_pdp'))

<<<<<<< HEAD
WebUI.click(findTestObject('0PDPPage/close_PDP'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('0PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))
=======
WebUI.click(findTestObject('1vedant/PDP/close_PDP'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('1vedant/PDP/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('1vedant/PDP/AddToCart_PDP'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('1vedant/PDP/AddToCart_PDP'))
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

<<<<<<< HEAD
WebUI.verifyElementPresent(findTestObject('0PDPPage/digital_item_flag_PDP'), 0)
=======
WebUI.verifyElementPresent(findTestObject('1vedant/PDP/digital_item_flag_PDP'), 0)
>>>>>>> bc85b8815ae9694cac79b07d6b44e4bbf5442283

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/Regalo_flag_OPC2'), 0)

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/myBagImageProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/totalPrice_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Eliminar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprarahora_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprar_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_SeguirComprando_cart'), 0)

WebUI.click(findTestObject('DemoObjects/CartPage/button_Comprar_cart'))

WebUI.waitForAlert(0)

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/promotionSection_opc'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Cupones_opc'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/cardSelect_card1_CO1'), [:], FailureHandling.STOP_ON_FAILURE)

'would show if the login user has a default card'
WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/CardLast4Digit_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/CheckOut(CO)/card_pink_radiobutton_OPC'), 0)

not_run: WebUI.click(findTestObject('1vedant/CheckOut(CO)/final_confirm_order_button_OPC'))

not_run: WebUI.click(findTestObject('DemoObjects/checkoutpage1/button_Continuar_payment_opc'))

WebUI.delay(4)

WebUI.click(findTestObject('DemoObjects/checkoutpage1/button_Finalizar compra_opc'))

WebUI.delay(5)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/gracias por comprar_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

CardOrder = WebUI.getText(findTestObject('Confirmation_page/PaypalOrderNumber_ConfirmationPage'))

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.closeBrowser()

