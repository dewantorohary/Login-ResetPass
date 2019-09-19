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

WebUI.click(findTestObject('Object Repository/Sign Up/Page_KODE/Masuk'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login ke KODE/Daftar Disini'))

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/input_firstName'), 'hary')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/input_lastName'), 'test prod lima')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/input_email'), 'hary-test-prod-lima@kode.id')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/Password'), 'mgeWl5n8VGmbUqAJZWuO2w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/Confirm'), 'mgeWl5n8VGmbUqAJZWuO2w==')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/Daftar'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Daftar ke KODE/Ya'))

WebUI.openBrowser('')

WebUI.navigateToUrl('www.gmail.com')

WebUI.setText(findTestObject('Login Google/Page_Masuk - Akun Google/input_kodeid_identifier'), 'harydewantoro@kode.id')

WebUI.click(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Login Google/Page_Masuk - Akun Google/input_Terlalu sering gagal_password'), 'ni7IXepu1na8tM3UQRp1Bg==')

WebUI.click(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setText(findTestObject('Login Google/Page_Masuk - Akun Google/input_G-_idvPin'), '473816')

WebUI.click(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.click(findTestObject('Sign Up/Page_Inbox (485) - harydewantorokodeid/input_Search_q'))

WebUI.setText(findTestObject('Sign Up/Page_Inbox (485) - harydewantorokodeid/span_support'), 'support')

WebUI.click(findTestObject('Sign Up/Page_Selamat datang di KODE semua bisa belajar - harydewantorokodeid - Hacktiv8 Mail/a_Verifikasi Email'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kode.id/verify-email?clientId=72l5a02jk6rcff7q6htjtr1tri&userName=harytestprodlimakodeid&code=718800&region=ap-southeast-1&email=hary-test-prod-lima@kode.id')

WebUI.click(findTestObject('Sign Up/Page_Selamat datang di KODE semua bisa belajar - harydewantorokodeid - Hacktiv8 Mail/a_Verifikasi Email'))

