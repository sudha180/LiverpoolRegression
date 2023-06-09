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
import customkeywords.myKeywords as myKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dtaqa.liverpool.com.mx/tienda')

WebUI.maximizeWindow()

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/Logo_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/Logo_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/searchTextbox_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/searchTextbox_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/a_Mis Compras_hp'))

WebUI.verifyElementPresent(findTestObject('1HomePage/a_Mis Compras_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/span_Iniciar sesin_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/bagIcon_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/multiSites_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/multiSites_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/span_Categoras_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Categoras_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/primaryBanner_hp'))

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/primaryBanner_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/secondaryBanner_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/secondaryBanner_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/carousel1_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/carousel1_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/footer_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/footer_hp'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : 'UN85@digisprint.com', ('password') : 'Un85@12345'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/span_Iniciar sesin_hp'))

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/button_Iniciar sesin_login'))

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/span_Categoras_hp'))

WebUI.click(findTestObject('DemoObjects/HomePage/span_Categoras_hp'))

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/l1Category_hp'))

WebUI.click(findTestObject('HomePageShubhum/L1Category_HP'))

WebUI.delay(3)

not_run: WebUI.verifyElementPresent(findTestObject('BLPPage/breadCrumb_blp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/BLPPage/breadCrumb_blp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('BLPPage/l2Category_blp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/BLPPage/l2Category_blp'), 0)

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.click(findTestObject('BLPPage/l2Category_blp'))

WebUI.click(findTestObject('DemoObjects/BLPPage/l2Category_blp'))

not_run: WebUI.verifyElementPresent(findTestObject('CLPPage/breadCrumb_clp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/breadCrumb_clp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CLPPage/a_Ver todo_clp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CLPPage/l3Category_clp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/l3Category_clp'), 0)

WebUI.click(findTestObject('DemoObjects/CLPPage/l3Category_clp'))

not_run: WebUI.click(findTestObject('CLPPage/l3Category_clp'))

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/breadCrumb_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/breadCrumb_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Categoras_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Categoras_plp'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Marcas_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Precios_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Tamao_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Vendido por_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Vendido por_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/label_Color_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/label_Color_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/label_Descuentos_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/label_Descuentos_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/productImage2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/listView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/gridView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Relevancia_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Lo Ms Nuevo_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Mayor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Menor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Calificaciones_plp'), 0)

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

not_run: WebUI.click(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'), 0)

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/carousel_plp'))

WebUI.click(findTestObject('PLPPage/goToTop'))

WebUI.click(findTestObject('DemoObjects/PLPPage/productImage2_plp'))

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/ProductImage_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/p_Ver ms promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/button_Agregar a mi bolsa_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/h3_Opiniones del artculo_pdp'), 0)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

WebUI.scrollToElement(findTestObject('pdp/quantity_pdp'), 0)

WebUI.click(findTestObject('pdp/selectSize1'))

WebUI.delay(3)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/carousels_pdp'))

not_run: WebUI.click(findTestObject('pdp/button_Agregar a mi bolsa_pdp'))

WebUI.scrollToElement(findTestObject('pdp/quantity_pdp'), 0)

WebUI.click(findTestObject('pdp/button_Agregar a mi bolsa_pdp'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.click(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/myBagImageProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/totalPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Eliminar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprarahora_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_Comprar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/button_SeguirComprando_cart'), 0)

WebUI.click(findTestObject('DemoObjects/CartPage/button_Comprar_cart'))

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/promotionSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/checkoutpage/button_Cupones_opc'), 0)

WebUI.click(findTestObject('DemoObjects/checkoutpage/label_Cambiar_payment_opc'))

WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Efectivo y Transferencias_payment_opc'))

not_run: WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Continuar_payment_opc'))

WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Continuar_payment_opc'))

WebUI.delay(4)

WebUI.click(findTestObject('DemoObjects/checkoutpage/button_Finalizar compra_opc'))

WebUI.delay(3)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('DemoObjects/ConfirmationPage/gracias por comprar_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/div_Entrega estimada_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/legalInfo_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/referenceNumber_confirmation'), 0)

referenceNumber_confirmation = WebUI.getText(findTestObject('ConfirmationPage/referenceNumber_confirmation'))

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'))

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.setText(findTestObject('MisComprasPage/mainSearchbar_misCompras'), referenceNumber_confirmation)

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

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/referenceNumber_orderDetails'), 0)

WebUI.verifyTextPresent(referenceNumber_confirmation, false)

