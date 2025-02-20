
# Project Title

This is a project for a test in Selenium and Java. I included JUnit as the base to run the tests.

## Index

- Software used in the project.
- Project Object Model
- Explanation of the project
- Regards

## Software used in the project

We used specific versions for this project of the following software (it may be needed to upgrade the software version depeding on when you download the project and your google chrome version)

- Google chrome: Versión 133.0.6943.127 (Build oficial) (64 bits)
- Java SDK: java version "23.0.2" 2025-01-21
- Maven: Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
- Selenium (included atuomatically with Maven):

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.29.0</version>
        </dependency>
- JUnit:

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>RELEASE</version>
            <scope>compile</scope>
        </dependency>
- ChromeDriver: 133.0.6943.126

## Project Object Model

The design pattern used for this project was POM, and since its architecture divides the pages in classes, we try to ensure that we wont duplicate code, variables and locators can be called from anywhere and structure will be cleaner.

## Explanation of the project

Basically I have created the project with the design pattern mentioned before but I didnt create a folder for an specific functionality, neither dividing the pages, locators and external elements. All this due this is a short project.

I divided the project in 2 folders, the first one to encapsulate the pages and its probably tests for it. The second one was only to order the tests, and run them all in a simple class with JUnit and Selenium.

If you run it, you clearly will see how the test can pass or can fail.

## Regards

Thank you for your time, I know its not a big project or a huge description, but I really appreciate you took the time to read it and review it. Thank you!