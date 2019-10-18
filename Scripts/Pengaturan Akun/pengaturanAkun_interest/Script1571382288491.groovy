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

WebUI.navigateToUrl('kode.id')

WebUI.click(findTestObject('Login Facebook(new)/Page_KODE - Cara Mudah Belajar Online Bersama KODE/a_Masuk'))

WebUI.setText(findTestObject('KODE-LOGIN-BANGET/input_Alamat Email_email'), 'hary-test-prod-satu@kode.id')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('KODE-LOGIN-BANGET/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(5)

WebUI.click(findTestObject('KODE-LOGIN-BANGET/button_Masuk'))

WebUI.delay(5)

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/div_hary'))

WebUI.delay(5)

WebUI.click(findTestObject('Ubah Password/Page_Katalog Course - KODE/a_Pengaturan Akun'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('PengaturanAkun_interest/Page_Profil Saya - KODE/span_Bidang mana yang kamu minati'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('PengaturanAkun_interest/Page_Profil Saya - KODE/button_marketing'))

WebUI.delay(3)

WebUI.click(findTestObject('PengaturanAkun_interest/Page_Profil Saya - KODE/button_development'))

WebUI.delay(3)

WebUI.click(findTestObject('PengaturanAkun_interest/Page_Profil Saya - KODE/button_Simpan Perubahan'))

WebUI.delay(8)

WebUI.click(findTestObject('home/Page_Katalog Course - KODE/a_home'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('PengaturanAkun_interest/Page_Home - KODE/span_Karena kamu menyukai Development'), 
    0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('PengaturanAkun_interest/Page_Home - KODE/span_Karena kamu menyukai Personal Development'), 
    0)

