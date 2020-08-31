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

WebUI.navigateToUrl('https://cdms-dev.jba.co.id/wp-admin/login?site=bike&redirect_to=%2Fwp-admin%2F')

WebUI.setText(findTestObject('Object Repository/JBATest/Page_JBA Indonesia  Log In/input_Username_user_login'), 'syslgk')

WebUI.setEncryptedText(findTestObject('Object Repository/JBATest/Page_JBA Indonesia  Log In/input_Password_user_pass'), 
    'kdeMiAHP5Lk=')

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_Home  JBA Indonesia/a_Cars'))

WebUI.click(findTestObject('Object Repository/JBATest/Page_Home  JBA Indonesia/a_Cars_1'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/b'))

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/input_keyword_search'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Customers'))

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Customers_1'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Sellers'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Payment Seller'))

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/input_keyword_search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/select_Select a location    JAKARTA - Jalan_0ecd08'), 
    '11', true)

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Auction'))

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Auction_1'))

WebUI.delay(240)

WebUI.click(findTestObject('JBATest/Page_Home  JBA Indonesia/Deposit'))

WebUI.delay(300)

WebUI.click(findTestObject('JBATest/Page_Home  JBA Indonesia/Dealer Deposit'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Sales Summary'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Payment'))

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/a_Payment List'))

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/input_keyword_search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/select_Select a location    JAKARTA - Jalan_0ecd08'), 
    '11', true)

WebUI.delay(240)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/input_keyword_search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/select_Select an auction    11072020 setpri_641a2f'), 
    '2285', true)

WebUI.click(findTestObject('Object Repository/JBATest/Page_ JBA Indonesia/input_keyword_search'))

WebUI.delay(240)

WebUI.click(findTestObject('JBATest/Page_Home  JBA Indonesia/a_Cars'))

WebUI.click(findTestObject('JBATest/Page_Home  JBA Indonesia/a_Cars_1'))

WebUI.delay(300)

