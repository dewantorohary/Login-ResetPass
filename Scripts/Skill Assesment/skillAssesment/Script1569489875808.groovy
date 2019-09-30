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

WebUI.setText(findTestObject('Page_Login ke KODE/input_Alamat Email_email'), 'hary-test-prod-satu@kode.id')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Page_Login ke KODE/input_Password_password'), 'mgeWl5n8VGmbUqAJZWuO2w==')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Login ke KODE/button_Masuk'))

WebUI.scrollToElement(findTestObject('skillAssesment/Page_Katalog Course - KODE/span_skill assessments'), 0)

WebUI.click(findTestObject('skillAssesment/Page_Katalog Course - KODE/span_Mulai Menyimpan Data dengan Database'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/span_ambil assessment'))

WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_ADEL key'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_ADEL key'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_ADELETE'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AEntity Relationship Design'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AFull'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AEntity Relationship Design'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AFull'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AHDEL'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AINSERT'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AL1R2'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AOffset'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_APersegi Panjang'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/div_ASelect  from nama_tabel'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_AUPDATE'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BAOF'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BFirst Normal Form'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BJOY'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BOne to One'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BPAUSE'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BRBD'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BRBD'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_Bredis-server'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_BTipe data numerik'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_CBegin In Rollback'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_CGET key value'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/div_CTrigger'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_submit jawaban'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('skillAssesment/Page_KODE/button_Lanjut'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_lihat hasil selengkapnya'))

WebUI.delay(5)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_ Kembali ke Skill Assessment'))

WebUI.delay(5)

WebUI.click(findTestObject('skillAssesment/Page_KODE/button_lihat history'))

