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

WebUI.click(findTestObject('Object Repository/Login Google/Page_KODE/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Login Google/Page_Login ke KODE/button_google'))

WebUI.switchToWindowTitle('Masuk - Akun Google')

WebUI.setText(findTestObject('Login Google/Page_Masuk - Akun Google/input_kodeid_identifier'), 'harydewantoro@kode.id')

WebUI.click(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login Google/Page_Masuk - Akun Google/input_Terlalu sering gagal_password'), 
    'ni7IXepu1na8tM3UQRp1Bg==')

WebUI.focus(findTestObject('Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.click(findTestObject('Object Repository/Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setText(findTestObject('Object Repository/Login Google/Page_Masuk - Akun Google/input_G-_idvPin'), '720089')

WebUI.click(findTestObject('Object Repository/Login Google/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.switchToWindowTitle('Katalog Course - KODE')

WebUI.click(findTestObject('Object Repository/Login Google/Page_Katalog Course - KODE/div_hary'))

WebUI.click(findTestObject('Object Repository/Login Google/Page_Katalog Course - KODE/span_logout'))

