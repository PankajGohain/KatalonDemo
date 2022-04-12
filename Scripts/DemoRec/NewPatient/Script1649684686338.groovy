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

WebUI.navigateToUrl('https://djenga.zapprx.com/clinician/#/login')

WebUI.setText(findTestObject('Object Repository/Page_AccelRx/input_Email_login-page-email-input'), 'doctor.james@max.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_AccelRx/input_Password_login-page-password-input'), 'uRBLTXtClxEADLJv4DemlQ==')

WebUI.click(findTestObject('Object Repository/Page_AccelRx/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/svg_Life Max Hospital_add-patient-icon'))

WebUI.setText(findTestObject('Object Repository/Page_AccelRx/input__first_name'), 'Timi')

WebUI.setText(findTestObject('Object Repository/Page_AccelRx/input__last_name'), 'Sam')

WebUI.click(findTestObject('Object Repository/Page_AccelRx/svg__MuiSvgIcon-root-281'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/h6_2022'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/div_2016'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/path'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/path'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/path'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/path'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/path'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/p_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AccelRx/select_MaleFemale'), 'M', true)

WebUI.setText(findTestObject('Object Repository/Page_AccelRx/input_MRN_emr_id'), 'MRN876GG')

WebUI.setText(findTestObject('Object Repository/Page_AccelRx/input_SSN_ssn'), '567-88-5566')

WebUI.click(findTestObject('Object Repository/Page_AccelRx/div_First NameLast NameDate of BirthGenderM_fdeee5'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/path_1'))

WebUI.click(findTestObject('Object Repository/Page_AccelRx/span_Log Out'))

WebUI.closeBrowser()

