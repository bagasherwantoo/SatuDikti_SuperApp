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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-release-sprint13-v.3.apk', true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Skipp Landing Page'), 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Lainnya'), 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Modul Ijazah LN'), 0)

Mobile.swipe(100, 500, 100, 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Card Pencarian PTLN'), 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Field Asal Negara PTLN'), 0)

Mobile.setText(findTestObject('Object Repository/Ijazah LN/Cari asal negara PTLN'), 'Malaysia', 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Negara Malaysia'), 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Button Cari PTLN'), 0)

Mobile.tap(findTestObject('Object Repository/Ijazah LN/Field masukan nama ptln'), 0)

Mobile.setText(findTestObject('Ijazah LN/Cari PTLN'), 'kuala lumpur', 0)

Mobile.tap(findTestObject('Ijazah LN/University of Kuala Lumpur'), 0)

Mobile.tap(findTestObject('Ijazah LN/Button Cari PTLN (2)'), 0)

Mobile.tap(findTestObject('Ijazah LN/Lihat Detail University of kuala lumpur'), 0)

Mobile.verifyElementExist(findTestObject('Ijazah LN/Verify/Halaman Detail University of Kuala Lumpur'), 0)

