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

WebUI.setText(findTestObject('Object Repository/assa1/Page_Login - ASSA Fleet Management System/input_Selamat Datang_username'), 
    'pdi123')

WebUI.setEncryptedText(findTestObject('Object Repository/assa1/Page_Login - ASSA Fleet Management System/input_Selamat Datang_password'), 
    'kdeMiAHP5Lk=')

WebUI.click(findTestObject('Object Repository/assa1/Page_Login - ASSA Fleet Management System/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/span_Stock Kendaraan'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan ASSA (Active)'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/button_Export Data'))

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Filter dengan pencarian_export_filter_0fc074'), 
    '2018')

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/button_Download'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/img_Filter Data Kendaraan_img-fluid'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan ASSA (Inactive)'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/button_Export Data'))

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Filter dengan pencarian_export_filter_f0dcb9'), 
    '04-08-2014')

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/button_Download'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/img_Filter Data Kendaraan_img-fluid'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan B2B dan B2C'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/button_Create New'))

WebUI.delay(3)

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Unit Bisnis'))

WebUI.delay(3)

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Kode Konsumen'))

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Nomor                                _62834e'), 
    'B-522-AUL')

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Jenis Kendaraan'))

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Merk'))

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Tipe'))

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Kapasitas Mesin'))

WebUI.click(findTestObject('assa1/Page_Dashboard - ASSA Fleet Management System/Pilih Transmisi'))

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Warna_warna'), 
    'White')

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/span_Pilih Tahun Pembuatan'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Tanggal                              _8c7cec'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/th_July 2020'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/th_'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/span_Jul'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/td_10'))

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Nomor                                _887b05'), 
    'ABCDEFG123456780')

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_Nomor                                _eff715'), 
    'M4NT4P53K4L11')

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/span_Pilih Bahan Bakar'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/span_Pilih Periode Service'))

WebUI.setText(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/input_KM Saat                              _293500'), 
    '2000')

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/button_Save'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/a_List Kendaraan B2B dan B2C'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/a_Rekonsil GR Unit'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/img_Filter Data Kendaraan_img-fluid'))

WebUI.click(findTestObject('Object Repository/assa1/Page_Dashboard - ASSA Fleet Management System/img_Bali_img-fluid'))

WebUI.closeBrowser()

