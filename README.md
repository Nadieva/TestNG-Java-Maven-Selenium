# TestNG-Java-Maven-Selenium
Test on login the Verimi account #TestNG #Webdriver #Selenium

##Goal
Testing if logging on the Veremi account has been succesful

##Please follow the instruction (on the IDE Eclipse)
- install  "geckodriver.exe" locally in your computer (path mst be " C:\\geckodriver.exe ")
- create a verimi account on https://verimi.de/en
- insert  your Verimi credentials (change email and password values) in src\test\java\com\verimi\TestsMaven\VerimiTest.java
- Run this file as a TestNG Test

##Expected results:
A new browser page is opened.Another one is opened where credentials are entered and the login button is submitted automatically. 
Both windows are closed and successful authentication is asserted in the Eclipse console.

**Note: please make sure to have TestNG and Selenium installed
