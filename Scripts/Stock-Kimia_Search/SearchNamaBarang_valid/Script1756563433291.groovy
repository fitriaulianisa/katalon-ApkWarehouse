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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://services.pusri.dev/sso/login?redirect_to=aHR0cHM6Ly93YXJlaG91c2UucHVzcmkuZGV2L2Rhc2hib2FyZC9sb2dpbmNlay5waHA=')

WebUI.click(findTestObject('Object Repository/Stock-kimia_Search/Page_SSO - Pupuk Sriwidjaja Palembang/input_Username_form-control'))

WebUI.setText(findTestObject('Object Repository/Stock-kimia_Search/Page_SSO - Pupuk Sriwidjaja Palembang/input_Username_form-control_1'), 
    '2401320001')

WebUI.setEncryptedText(findTestObject('Object Repository/Stock-kimia_Search/Page_SSO - Pupuk Sriwidjaja Palembang/input_Password_form-control'), 
    'Sx4i0DcUYKjTtKZLXv+mJA==')

WebUI.click(findTestObject('Object Repository/Stock-kimia_Search/Page_SSO - Pupuk Sriwidjaja Palembang/button_Password_btn btn-primary w-100 mb-4 _39f754'))

WebUI.click(findTestObject('Object Repository/Stock-kimia_Search/Page_Warehouse Pusri/a_MENU_pc-link'))

WebUI.click(findTestObject('Object Repository/Stock-kimia_Search/Page_Warehouse Pusri/a_Stock_pc-link'))

WebUI.setText(findTestObject('Object Repository/Stock-kimia_Search/Page_Warehouse Pusri/input_Permintaan_searchInput'), 
    'INHIBITOR,CORROSION:N-3236')

WebUI.closeBrowser()

