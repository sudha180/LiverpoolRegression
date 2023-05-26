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

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda')

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

WebUI.verifyElementPresent(findTestObject('HomePageShubhum/primaryBanner_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/secondaryBanner_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/secondaryBanner_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/carousel1_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/carousel1_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/footer_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/footer_hp'), 0)

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/span_Iniciar sesin_hp'))

WebUI.verifyElementPresent(findTestObject('DemoObjects/HomePage/span_Iniciar sesin_hp'), 0)

WebUI.acceptAlert()

WebUI.setText(findTestObject('HomePageShubhum/input_Correo electrnico_username_login'), 'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('HomePageShubhum/input_Contrasea_password_login'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/button_Iniciar sesin_login'))

WebUI.click(findTestObject('DemoObjects/HomePage/button_Iniciar sesin_login'))

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

WebUI.verifyElementPresent(findTestObject('DemoObjects/CLPPage/a_Ver todo_clp'), 0)

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

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Marcas_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Marcas_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Precios_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Precios_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/div_Tamao_plp'), 0)

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

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/productImage2_plp'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/productPrice_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/productPrice_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/listView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/listView_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/gridView_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/gridView_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/button_Relevancia_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Relevancia_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Lo Ms Nuevo_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/button_Lo Ms Nuevo_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Mayor precio_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/button_Mayor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Menor precio_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/button_Menor precio_plp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/button_Calificaciones_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/button_Calificaciones_plp'))

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

not_run: WebUI.click(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'), 0)

WebUI.click(findTestObject('DemoObjects/PLPPage/a_Limpiar Filtros_plp'))

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/a_Limpiar Filtros_plp'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/carousel_plp'))

WebUI.click(findTestObject('DemoObjects/PLPPage/productImage2_plp'))

not_run: WebUI.click(findTestObject('PLPPage/productImage2_plp'))

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/breadCrumb_pdp'), 0)

WebUI.click(findTestObject('DemoObjects/PDPPage/breadCrumb_pdp'))

not_run: WebUI.verifyElementPresent(findTestObject('PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('DemoObjects/PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/productImage_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/productName_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/quantity_pdp'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('PDPPage/DiscountPriceprice_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/p_Cdigo de Producto_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/p_Ver ms promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'), 0)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('PDPPage/selectSize1'))

WebUI.scrollToElement(findTestObject('PDPPage/quantity_pdp'), 0)

WebUI.click(findTestObject('PDPPage/selectSize1'))

WebUI.delay(3)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/carousels_pdp'))

not_run: WebUI.click(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.scrollToElement(findTestObject('PDPPage/quantity_pdp'), 0)

WebUI.click(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.click(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/myBagImageProduct_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/totalPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Eliminar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprarahora_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprar_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_SeguirComprando_cart'), 0)

WebUI.click(findTestObject('CartPage/button_Comprar_cart'))

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/promotionSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Cupones_opc'), 0)

WebUI.click(findTestObject('checkoutpage/label_Cambiar_payment_opc'))

WebUI.click(findTestObject('checkoutpage/button_Efectivo y Transferencias_payment_opc'))

not_run: WebUI.click(findTestObject('checkoutpage/button_Continuar_payment_opc'))

WebUI.click(findTestObject('checkoutpage/button_Continuar_payment_opc'))

WebUI.delay(4)

WebUI.click(findTestObject('checkoutpage/button_Finalizar compra_opc'))

WebUI.delay(3)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation'), 0)

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

