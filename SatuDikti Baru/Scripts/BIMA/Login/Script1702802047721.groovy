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

WebUI.callTestCase(findTestCase('StartApp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KamDek/button/Btn skip'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BIMA/button/Btn Nav Profil'), 0)

Mobile.tap(findTestObject('BIMA/button/Btn Login (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 350, 0, 0)

Mobile.scrollToText('PDDIKTI - Pangkalan Data Pendidikan Tinggi. Copyright 2023', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/BIMA/fild usrnm'), 0)

Mobile.setText(findTestObject('Object Repository/BIMA/input username'), 'ahmadump@yahoo.co.id', 0)

Mobile.tap(findTestObject('Object Repository/BIMA/fild Password'), 0)

Mobile.setText(findTestObject('Object Repository/BIMA/input password'), '481965ah', 0)

Mobile.tap(findTestObject('Object Repository/BIMA/btn Login'), 0)

Mobile.getText(findTestObject('BIMA/button/Atb HiAHMAD'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/btn Setuju'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('BIMA/button/Verify berhasil login'), 0)

