# TestNG-Java-Maven-Selenium
Test on login the Verimi account #TestNG #Webdriver #Selenium

## Goal
Testing if logging on the Veremi account has been succesful


## Tehnologies used:
- geockodiver (https://github.com/mozilla/geckodriver/releases/tag/v0.24.0)
- Oracle JDK v1.8.0
- Apache Maven v3.6.1
- Firefox v68.0.1
- Eclipse Java EE Photon Release 4.8.0

## Please follow the instruction 
- install  "geckodriver.exe" locally in your computer. It must be saved in an executable location, for example" C://geckodriver.exe"
- create a verimi account on https://verimi.de/en
- insert  your Verimi credentials (change email and password values) in TestNG-Java-Maven-Selenium/Verimi/TestsMaven/src/test/java/com/verimi/TestsMaven/VerimiTest.java
- Run this file as a TestNG Test (on the IDE Eclipse)

## Expected results:
A new browser page is opened.Another one is opened where credentials are entered and the login button is submitted automatically. 
Both windows are closed and successful authentication is asserted in the Eclipse console.

** Note: please make sure to have the "Maven Integration for Eclipse (Luna) 1.5.0" and "TestNg for Eclipse" plug-ins installed correctly
