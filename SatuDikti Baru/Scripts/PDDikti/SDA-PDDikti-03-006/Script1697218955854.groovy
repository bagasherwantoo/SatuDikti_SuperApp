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

Mobile.tap(findTestObject('PDDikti/Skip Landing Page'), 0)

Mobile.tap(findTestObject('PDDikti/Lainnya'), 0)

Mobile.tap(findTestObject('PDDikti/Modul PDDikti'), 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Filter'), 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Kategori Pencarian'), 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Kategori Data Prodi'), 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Filed Nama Prodi'), 0)

Mobile.setText(findTestObject('PDDikti/Cari Nama Prodi (Data Prodi)'), 'Sistem Informasi\\n', 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Jenjang'), 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Jenjang S1'), 0)

Mobile.tap(findTestObject('Object Repository/PDDikti/Field PT (Data Prodi) (1)'), 0)

Mobile.setText(findTestObject('Object Repository/PDDikti/Cari PT (Data Prodi)'), 'Universitas Multimedia Nusantara Jakarta\\n', 
    0)

Mobile.tap(findTestObject('Object Repository/PDDikti/UMNJ (Data Prodi)'), 0)

Mobile.tap(findTestObject('PDDikti/Button Cari'), 0)

Mobile.verifyElementExist(findTestObject('PDDikti/Verify/Card Sistem Informasi UMNJ'), 0)

