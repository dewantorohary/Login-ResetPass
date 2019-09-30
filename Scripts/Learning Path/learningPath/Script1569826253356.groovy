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

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Page_Login ke KODE/input_Password_password'), 'mgeWl5n8VGlyGxwBW71nHw==')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Login ke KODE/button_Masuk'))

WebUI.scrollToElement(findTestObject('Learning Path/Page_Katalog Course - KODE/span_learning paths'), 0)

WebUI.click(findTestObject('Learning Path/Page_Katalog Course - KODE/span_Belajar React'))

WebUI.click(findTestObject('Learning Path/Page_Belajar React - KODE/span_Membuat Single Page Application dengan React'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/div_Tentang Instruktur'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/Page_Membuat/Page_Membuat Single Page/div_Buffering_absolute outline'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/Page_Membuat/Page_Membuat Single Page/Page_Membuat Single Page Application/button_Riza Fahmi'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/Page_Membuat/Page_Membuat Single Page/div_Buffering_absolute outline'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/Page_Membuat/Page_Membuat Single Page/Page_Membuat Single/button_Riza FahmiCurriculum'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/div_APeralatan shooting film'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_submit jawaban'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_Lanjut'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/div_APeralatan shooting film'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_submit jawaban'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_Lanjut'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/div_APeralatan shooting film'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_submit jawaban'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_Lanjut'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/div_APeralatan shooting film'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_submit jawaban'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_Lanjut'))

WebUI.delay(2)

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_selanjutnya'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/span_ulasan'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_berikan ulasan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/div_bagaimana penilaian anda dalam kelas ini_flex flex-row justify-center align-center'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/Page_Membuat Single Page/div_bagaimana penilaian anda dalam kelas ini_ma1 css-vi20e9'))

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/textarea_berikan komentar anda untuk kelas ini_feedback'))

WebUI.setText(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/textarea_berikan komentar anda untuk kelas ini_feedback'), 
    'Sangat membantu untuk pemula seperti saya thx !!')

WebUI.click(findTestObject('Learning Path/Page_Membuat Single Page Application dengan React - Classroom - KODE/button_submit review'))

