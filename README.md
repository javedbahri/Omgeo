# Omgeo
Test Automation


Command to execute the automation tests through Maven.
-----------------------------------------
mvn verify -Dwebdriver.base.url=http://www.omgeo.com/ -Dserenity.browser.width=1366 -DSerenity.browser.height=1024


Frameworks used for automation
------------------------------
1) Selenium
2) JBehave
3) Serenity
4) PageObject


Methodology
-------------------
Behaviour Driven Development (BDD)


Instructions:
-------------
1) The automation tests/scenarios shall be run with the  above mvn command, or by running the AcceptanceTestSuite.java with JUnit
2) The project may also be integrated with Jenkins on the server


Story file
----------
There are three scenarios in the /src/test/resources/stories/about_omegeo/AboutOmegeo.story
Each scenario is mapped to a method in /src/test/java/com/omgeo/bdd/steps/NavigationSteps.java


Report
------
Serenity produces a very nice and graphic reports located:
/omgeo/target/site/serenity

Browser
------------------------
FireFox is selected for this test:
Serenity manages the browser life cycle and closing the resources

