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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/BIMA/button/Btn skip'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Garuda/button/Btn Lainnya'), 0)

Mobile.tap(findTestObject('BIMA/button/Btn Bima'), 0)

Mobile.tap(findTestObject('Object Repository/BIMA/button/Btn login bima'), 0)

Mobile.getText(findTestObject('BIMA/verify/title page login'), 0)

Mobile.swipe(0, 436, 0, 0)

Mobile.tap(findTestObject('Object Repository/BIMA/button/Field username'), 0)

Mobile.tap(findTestObject('BIMA/button/Btn inp username'), 0)

Mobile.setText(findTestObject(null), 'ahmadump@yahoo.co.id', 0)

Mobile.tap(findTestObject('BIMA/button/Field password'), 0)

Mobile.setText(findTestObject(null), '481965ah', 0)

Mobile.tap(findTestObject('BIMA/button/Btn login'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

