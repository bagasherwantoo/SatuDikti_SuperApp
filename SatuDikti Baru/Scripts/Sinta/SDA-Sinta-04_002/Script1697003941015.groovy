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

Mobile.tap(findTestObject('Object Repository/Sinta/Skip Landing Page'), 0)

Mobile.tap(findTestObject('Object Repository/Sinta/Lainnya'), 0)

Mobile.tap(findTestObject('Object Repository/Sinta/Modul Sinta'), 0)

Mobile.swipe(1000, 500, 500, 0)

Mobile.tap(findTestObject('Object Repository/Sinta/Card Affiliattions'), 0)

Mobile.tap(findTestObject('Object Repository/Sinta/Button cari affiliations'), 0)

Mobile.setText(findTestObject('Sinta/Button cari affiliations'), 'Gunadarma\\n', 0)

Mobile.tap(findTestObject('Object Repository/Sinta/Affiliations Gunadarma'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Sinta/Informasi affiliation gunadarma'), 0)

