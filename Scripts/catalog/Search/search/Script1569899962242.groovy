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

WebUI.setText(findTestObject('KODE-LOGIN-BANGET/input_Alamat Email_email'), 'hary-test-prod-satu@kode.id')

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('KODE-LOGIN-BANGET/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(3)

WebUI.click(findTestObject('KODE-LOGIN-BANGET/button_Masuk'))

WebUI.setText(findTestObject('search/Page_Katalog Course - KODE/input_catalog_css-s6jaux'), 'nodejs')

WebUI.sendKeys(findTestObject('search/Page_Katalog Course - KODE/input_catalog_css-s6jaux'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('search/Page_Katalog Course - KODE/span_NodeJS Tingkat Pemula'))

