import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://careerbuilder.vn/vi/jobseekers/login')

WebUI.setText(findTestObject('Object Repository/ApplyJob_Firefox/Page_ng nhp  qun l h s v vic lm  CareerBuilder.vn/input_hoc_username'), 
    'nganqccb@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ApplyJob_Firefox/Page_ng nhp  qun l h s v vic lm  CareerBuilder.vn/input_Vui lng nhp email_password'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_ng nhp  qun l h s v vic lm  CareerBuilder.vn/button_ng nhp'))

'Thay đổi công việc muốn Apply.'
WebUI.setText(findTestObject('Object Repository/ApplyJob_Firefox/Page_Tuyn dng  Tm kim vic lm nhanh  CareerB_c7310c/input_n ly thnh cng vi_keyword'), 
    'Test1')

WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_Tuyn dng  Tm kim vic lm nhanh  CareerB_c7310c/button_TM VIC NGAY'))

'HIện tại em Post job xong sẽ qua apply nên chỗ này chỉ mới lấy Job đầu tiên hiển thị khi search'
WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_Tm vic lm Test1  CareerBuilder.vn/a_Test1                                    _8a783d'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_Vic lm Test1 - Cng Ty C Phn ITFirst Pro/a_Np n ng Tuyn'))

WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_Np h s ng tuyn Test1/label_Upload h s H tr nh dng .doc, .docx, ._60c131'))

WebUI.click(findTestObject('ApplyJob_Firefox/Page_Np h s ng tuyn Test1/label_Chn t my tnh'))

'Upload test-photo.png to input_browse'
WebUI.uploadFile(findTestObject('ApplyJob_Firefox/Page_Np h s ng tuyn Test1/input_picture_as_pdf_uploadFile'), 'C:\\Users\\Admin\\Desktop\\An_3995245.pdf')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_Np h s ng tuyn Test1/button_Np ng Tuyn'))

WebUI.click(findTestObject('Object Repository/ApplyJob_Firefox/Page_Np n ng tuyn thnh cng/a_Xem cc cng vic  ng tuyn'))

