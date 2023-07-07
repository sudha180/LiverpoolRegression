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

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [(GlobalVariable.username) : 'UN85@digisprint.com', (GlobalVariable.password) : 'Un85@12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'sofa'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product_Link_plp'))

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('pdp/ProductImage_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Quantity(plus)_PDP'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/carousels_pdp'))

not_run: WebUI.click(findTestObject('pdp/button_Agregar a mi bolsa_pdp'))

WebUI.click(findTestObject('1vedant/PDP/AddToCart_PDP'))

WebUI.delay(3)

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

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

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage1/promotionSection_opc'), 0)

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

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.setText(findTestObject('MisComprasPage/mainSearchbar_misCompras'), CardOrder)

WebUI.sendKeys(findTestObject('MisComprasPage/mainSearchbar_misCompras'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('MisComprasPage/breadCrumb_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MisComprasPage/aside_leftNavigation_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MisComprasPage/mainSearchbar_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MisComprasPage/span_Filtrar compras_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MisComprasPage/productName_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MisComprasPage/img_product__image_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MisComprasPage/button_Comprar nuevamente__misCompras'), 0)

WebUI.click(findTestObject('MisComprasPage/button_Ver detalle de compra_misCompras'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/h1_Detalle de compra_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/addressSection_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/paymentSection_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/productDetails_orderDetails'), 0)

