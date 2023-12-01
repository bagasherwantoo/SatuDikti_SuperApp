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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-release_sprint4.apk', true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Selancar PAK/Skip Landing Page'), 0)

Mobile.tap(findTestObject('Selancar PAK/Lainnya'), 0)

Mobile.tap(findTestObject('Selancar PAK/Modul Selancar PAK'), 0)

Mobile.tap(findTestObject('Object Repository/Selancar PAK/Button Login'), 0)

Mobile.tap(findTestObject('Object Repository/Selancar PAK/Username atau Email'), 0)

Mobile.setText(findTestObject('Selancar PAK/Username atau Email'), 'ahmadump@yahoo.co.id', 0)

Mobile.tap(findTestObject('Object Repository/Selancar PAK/Password'), 0)

Mobile.setText(findTestObject('Selancar PAK/Password'), '481965ah', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Selancar PAK/Button Login 2'), 0)

Mobile.tap(findTestObject('Object Repository/Selancar PAK/Button Setuju'), 0)

Mobile.verifyElementExist(findTestObject('Selancar PAK/Verify/Halaman Selancar PAK (Setelah login)'), 0)

