import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

String randomText = RandomStringUtils.randomNumeric(3)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Prieds Technology/input_IDUsername_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Master'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Management'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Register'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Remark_createcustomer-customerregiste_e3ba5d'), 
    (('08.' + randomText) + '.554.2-123.') + randomText)

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/img_concat(id(, , -img-snackbar, , ))_-img-_6a7c1a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Mohon Isi Customer ID Terlebih Dahulu'))

WebUI.closeBrowser()

