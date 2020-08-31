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

Mobile.startApplication('C:\\Users\\benja\\Downloads\\app-0.0.103-dev-202008281110.apk', true)

Mobile.tap(findTestObject('Mobile_test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Mobile_test/android.widget.Button0 - GET STARTED'), 0)

Mobile.tap(findTestObject('Mobile_test/Register'), 0)

Mobile.setText(findTestObject('Mobile_test/android.widget.EditText0 - Enter Your Name'), 'Benjamin', 0)

Mobile.tap(findTestObject('Mobile_test/android.widget.EditText0 - Date of Birth'), 0)

Mobile.tap(findTestObject('Mobile_test/android.view.View0 - 4'), 0)

Mobile.tap(findTestObject('Mobile_test/android.widget.Button0 - OK'), 0)

Mobile.setText(findTestObject('Mobile_test/android.widget.EditText0 - usermail.com'), 'test123@gmail.com', 0)

WebUI.delay(5)

Mobile.setEncryptedText(findTestObject('Mobile_test/android.widget.EditText0 - Password (1)'), 'TCdEHGtpZOAOScmyNwFgOw==', 
    0)

WebUI.delay(5)

Mobile.setEncryptedText(findTestObject('Mobile_test/android.widget.EditText0 - Password (2)'), 'TCdEHGtpZOAOScmyNwFgOw==', 
    0)

Mobile.tap(findTestObject('Mobile_test/android.widget.Button0 - MaleLaki-laki'), 0)

Mobile.tap(findTestObject('Mobile_test/android.widget.CheckBox0'), 0)

Mobile.tap(findTestObject('Mobile_test/android.widget.Button0 - Register'), 0)

WebUI.setText(findTestObject('Mobile_test/TypeNumber'), '96375')

WebUI.delay(10)

Mobile.tap(findTestObject('Mobile_test/android.widget.Button0 - CONTINUE'), 0)

Mobile.closeApplication()

