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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qafms.assa.id/adm-cp/user/login')

WebUI.setText(findTestObject('Object Repository/assa/Page_Login - ASSA Fleet Management System/input_Selamat Datang_username'), 
    'pdi123')

WebUI.setEncryptedText(findTestObject('Object Repository/assa/Page_Login - ASSA Fleet Management System/input_Selamat Datang_password'), 
    'kdeMiAHP5Lk=')

WebUI.click(findTestObject('Object Repository/assa/Page_Login - ASSA Fleet Management System/button_Login'))

WebUI.maximizeWindow()

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/span_Stock Kendaraan'))

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan ASSA (Active)'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan ASSA (Inactive)'))

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/span_No Ref GR'))

WebUI.setText(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/input_No Polisi_search'), 
    'B-1152-URP')

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/div_Search'))

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/div_No Ref GR                              _269a48'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan B2B dan B2C'))

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Pengiriman Kendaraan'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Antrian Permintaan Pengiriman'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Monitoring Pengiriman'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_History Pengiriman'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan Keluar                    _25a325'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/span_Penarikan Kendaraan'))

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Antrian Permintaan Penarikan'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Monitoring Penarikan'))

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_History Penarikan'))

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Kendaraan GS'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Antrian Permintaan GS'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Monitoring Penggunaan GS'))

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Inventory'))

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Sparepart'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_List Inventory'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/assa/Page_Dashboard - ASSA Fleet Management System/a_Log                            Penggunaan_7845b9'))

WebUI.delay(240)

