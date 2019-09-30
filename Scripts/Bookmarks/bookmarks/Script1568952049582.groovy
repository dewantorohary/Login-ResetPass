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

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Page_Login ke KODE/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/i_Enrico Lukman_f3 pointer far fa-bookmark css-18tch9h'))

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/div_hary'))

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/a_Bookmark Saya'))

WebUI.click(findTestObject('Bookmarks/Page_Bookmarks Saya - KODE/i_Enrico Lukman_f3 pointer fa fa-bookmark css-1bvkbs5'))

WebUI.click(findTestObject('Bookmarks/Page_Katalog Course - KODE/div_hary'))

WebUI.click(findTestObject('Login Facebook(new)/Page_Katalog Course - KODE/span_logout'))

