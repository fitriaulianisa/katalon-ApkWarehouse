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

// --- START TEST CASE ---
WebUI.openBrowser('')

WebUI.navigateToUrl('https://services.pusri.dev/sso/login?redirect_to=aHR0cHM6Ly93YXJlaG91c2UucHVzcmkuZGV2L2Rhc2hib2FyZC9sb2dpbmNlay5waHA=')

// Klik field username
WebUI.click(findTestObject('Object Repository/FieldKosong/Page_SSO - Pupuk Sriwidjaja Palembang/input_Username_form-control'))

// Klik tombol login tanpa isi username & password
WebUI.click(findTestObject('Object Repository/FieldKosong/Page_SSO - Pupuk Sriwidjaja Palembang/button_Password_btn btn-primary w-100 mb-4 _39f754'))

// --- VALIDASI ALERT POPUP ---
try {
    // Tunggu sebentar agar alert muncul
    WebUI.delay(2)

    // Ambil teks dari alert
    String actualText = WebUI.getAlertText()
    String expectedText = "Login Failed"

    // Verifikasi teks alert sesuai harapan
    WebUI.verifyMatch(actualText, expectedText, false)
    println("✅ Validasi berhasil: Teks pop-up sesuai dengan yang diharapkan.")

    // Tutup alert dengan klik OK
    WebUI.acceptAlert()

} catch (Exception e) {
    // Kalau alert tidak muncul
    println("❌ Test Gagal: Pop-up 'Login Failed' tidak ditemukan.")
    WebUI.verifyMatch("Pop-up tidak ada", "Pop-up 'Login Failed'", false)
}

// Tutup browser
WebUI.closeBrowser()
// --- END TEST CASE ---
