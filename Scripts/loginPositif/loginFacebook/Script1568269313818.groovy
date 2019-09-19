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

WebUI.click(findTestObject('Object Repository/Login Facebook(new)/Page_KODE - Cara Mudah Belajar Online Bersama KODE/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Login Facebook(new)/Page_Login ke KODE/button_facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/Login Facebook(new)/Page_Facebook/input_Email address'), 'harydewantoro@rocketmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Facebook(new)/Page_Facebook/input_Password_pass'), 'ni7IXepu1na8tM3UQRp1Bg==')

WebUI.click(findTestObject('Object Repository/Login Facebook(new)/Page_Facebook/input_Password_login'))

WebUI.switchToWindowTitle('Katalog Course - KODE')

WebUI.click(findTestObject('Object Repository/Login Facebook(new)/Page_Katalog Course - KODE/div_hary'))

WebUI.click(findTestObject('Object Repository/Login Facebook(new)/Page_Katalog Course - KODE/span_logout'))

