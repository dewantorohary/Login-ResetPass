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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kode.id/')

WebUI.click(findTestObject('Login Google/Page_KODE/a_Masuk'))

WebUI.click(findTestObject('Object Repository/fogot password/Page_Login ke KODE/button_Saya Lupa Password'))

WebUI.setText(findTestObject('Object Repository/fogot password/Page_Reset Password - KODE/input_Alamat Email_email'), 'hary-test-prod-satu@kode.id')

WebUI.click(findTestObject('Object Repository/fogot password/Page_Reset Password - KODE/button_Minta Setel Ulang Password'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mail.google.com')

WebUI.setText(findTestObject('Object Repository/fogot password/Page_Gmail/input_Lanjutkan ke Gmail_identifier'), 'harydewantoro@kode.id')

WebUI.click(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Login Google/Page_Masuk - Akun Google/input_Terlalu sering gagal_password'), 'ni7IXepu1na8tM3UQRp1Bg==')

WebUI.click(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setText(findTestObject('Object Repository/fogot password/Page_Gmail/input_G-_idvPin'), '081680')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Gmail/span_Berikutnya'))

WebUI.setText(findTestObject('Object Repository/fogot password/Page_Inbox (491) - harydewantorokodeid - Hacktiv8 Mail/input_Search_q'), 
    'support')

WebUI.sendKeys(findTestObject('fogot password/Page_Inbox (491) - harydewantorokodeid - Hacktiv8 Mail/input_Search_q'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/fogot password/Page_Search results - harydewantorokodeid - Hacktiv8 Mail/div_support'))

WebUI.click(findTestObject('Object Repository/fogot password/Page_Buka E-mail ini untuk ganti Password - harydewantorokodeid - Hacktiv8 Mail/a_Reset Password'))

WebUI.switchToWindowTitle('Reset Password - KODE')

WebUI.setEncryptedText(findTestObject('Object Repository/fogot password/Page_Reset Password - KODE/input_Password Baru_newPassword'), 
    'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/fogot password/Page_Reset Password - KODE/input_Konfirmasi Password Baru_confirmNewPassword'), 
    'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.click(findTestObject('Object Repository/fogot password/Page_Reset Password - KODE/button_Kirimkan'))

