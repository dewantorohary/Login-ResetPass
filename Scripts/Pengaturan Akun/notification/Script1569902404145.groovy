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

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('KODE-LOGIN-BANGET/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.click(findTestObject('KODE-LOGIN-BANGET/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/div_hary'))

WebUI.delay(3)

WebUI.click(findTestObject('Ubah Password/Page_Katalog Course - KODE/a_Pengaturan Akun'))

WebUI.delay(5)

WebUI.click(findTestObject('notifikasi/Page_Subscription Page - KODE/span_Atur Notifikasi'))

WebUI.delay(3)

WebUI.click(findTestObject('notifikasi/Page_Pengaturan Notifikasi - KODE/div_Promosi kelas baru yang direkomendasikan untuk kamu_outline-0 css-jgdgyw'))

WebUI.delay(3)

WebUI.click(findTestObject('notifikasi/Page_Pengaturan Notifikasi - KODE/Page_Pengaturan Notifikasi - KODE/div_Pemberitahuan update kelas dari instruktur_outline-0 css-jgdgyw'))

WebUI.delay(3)

WebUI.click(findTestObject('notifikasi/Page_Pengaturan Notifikasi - KODE/Page_Pengaturan Notifikasi - KODE/div_Pengingat kelas yang telah diambil_outline-0 css-jgdgyw'))

WebUI.delay(3)

WebUI.click(findTestObject('notifikasi/Page_Pengaturan Notifikasi - KODE/Page_Pengaturan Notifikasi - KODE/div_Pengumuman fitur baru di platform_outline-0 css-jgdgyw'))

