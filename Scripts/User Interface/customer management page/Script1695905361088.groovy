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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/img_Hello,_style-people'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_IDUsername'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Prieds Technology/input_IDUsername_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Master'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Management'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/button_Download  expand_more'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/button_Search'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/div_Customer ID'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/div_Customer List'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/div_Customer Name'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/div_Customer Register'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/div_Customer Register Import'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/div_Items per page 50 1  50 of 199'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/kolom'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/kolom2'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/th_Actions'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/th_Customer Email'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/th_Customer ID'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/th_Customer Name'))

WebUI.verifyElementVisible(findTestObject('cust management/Page_Prieds Technology/th_PIC'))

