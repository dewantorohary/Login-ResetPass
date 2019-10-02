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

WebUI.click(findTestObject('Login Google/Page_KODE/a_Masuk'))

WebUI.setText(findTestObject('KODE-LOGIN-BANGET/input_Alamat Email_email'), 'hary-test-prod-satu@kode.id')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('KODE-LOGIN-BANGET/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.click(findTestObject('KODE-LOGIN-BANGET/button_Masuk'))

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/div_hary'))

WebUI.click(findTestObject('Ubah Password/Page_Katalog Course - KODE/a_Pengaturan Akun'))

WebUI.delay(5)

WebUI.click(findTestObject('Status Berlangganan/Page_Subscription Page - KODE/span_Status Berlangganan'))

WebUI.delay(5)

WebUI.click(findTestObject('Status Berlangganan/Page_Subscription Page - KODE/button_Lihat Riwayat Pembayaran'))

WebUI.delay(5)

WebUI.click(findTestObject('Status Berlangganan/Page_Home - KODE/span_Kembali Ke Status Berlangganan'))

