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

Mobile.tap(findTestObject('Tracer Study/Skip Landing Page'), 0)

Mobile.tap(findTestObject('Object Repository/Tracer Study/Lainnya'), 0)

Mobile.tap(findTestObject('Object Repository/Tracer Study/Modul Tracer Study'), 0)

Mobile.tap(findTestObject('Object Repository/Tracer Study/Statistik'), 0)

Mobile.tap(findTestObject('Object Repository/Tracer Study/Perguruan Tinggi'), 0)

Mobile.setText(findTestObject('Object Repository/Tracer Study/Cari Perguruan Tinggi'), 'Universitas Trunojoyo\\n', 0)

Mobile.tap(findTestObject('Tracer Study/Universitas Trunojoyo'), 0)

Mobile.tap(findTestObject('Tracer Study/Button Cari'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(1000, 1500, 0, 1500)

Mobile.verifyElementExist(findTestObject('Tracer Study/Verify/Data keselarasan vertikal Univ Trunojoyo'), 0)

