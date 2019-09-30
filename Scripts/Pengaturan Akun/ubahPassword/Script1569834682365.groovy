import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kode.id/')

WebUI.click(findTestObject('Login Facebook(new)/Page_KODE - Cara Mudah Belajar Online Bersama KODE/a_Masuk'))

WebUI.setText(findTestObject('Page_Login ke KODE/input_Alamat Email_email'), 'hary-test-prod-satu@kode.id')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Page_Login ke KODE/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Login ke KODE/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/div_hary'))

WebUI.click(findTestObject('Ubah Password/Page_Katalog Course - KODE/a_Pengaturan Akun'))

WebUI.click(findTestObject('Ubah Password/Page_Profil Saya - KODE/span_Ubah Password'))

WebUI.setEncryptedText(findTestObject('Ubah Password/Page_Ubah Password - KODE/input_Password Lama_oldPassword'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Ubah Password/Page_Ubah Password - KODE/input_Password Baru_newPassword'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Ubah Password/Page_Ubah Password - KODE/input_Konfirmasi Password Baru_confNewPassword'), 
    'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(3)

WebUI.click(findTestObject('Ubah Password/Page_Ubah Password - KODE/button_Simpan Perubahan'))

