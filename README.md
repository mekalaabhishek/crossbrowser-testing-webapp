# **Overview**

This is a cross-browser testing framework built using Java, Selenium WebDriver, and Maven. It is designed to facilitate automated testing of web applications across multiple browsers to ensure compatibility and functionality. The framework supports parallel execution of tests on different browsers and can be integrated with CI/CD pipelines.

**Features**

- **Cross-Browser Testing**: Test your web application across multiple browsers (Chrome, Firefox, Edge, Safari, etc.).
- **Parallel Execution**: Run tests in parallel to save time and resources.
- **Maven Integration**: Easily manage dependencies and plugins using Maven.
- **Page Object Model (POM)**: Organized structure for maintaining test cases.
- **Customizable Reports**: Generate detailed test reports using tools like TestNG and Extent.
- **CI/CD Integration**: Seamless integration with Jenkins, GitLab CI, and other CI/CD tools.

**Prerequisites**

Before setting up the project, ensure you have the following installed:

- Java JDK 8 or higher
- Apache Maven 3.6.0 or higher
- An IDE like IntelliJ IDEA, Eclipse, or VS Code
- Browsers like Chrome, Firefox, Edge installed on your machine

```bash
|--src/main/java
|  |--main
|  |  |--generic
|  |  |  |--basetest
|  |  |  |--Initilize pages
|  |  |  |--Java Mail
|  |  |  |--Listeners
|  |  |  |--screenrecorder
|  |  |  |--screenshot
|  |  |  |--webactionutil
|  |  |--pages
|  |  |  |--Signin_pagenew

|--src/test/java
| |--scripts
|  |  |--signin (testcases)
|--Reports
|--Test recordings
|--Crossbrowsertestingreport.html
|--pom.xml
|--testng.xml

```

**Setup Instructions**

1. **Clone the Repository**

```bash
git clone https://github.com/mekalaabhishek/crossbrowser-testing-webapp.git
cd cross-browser-testing-framework
```

1. **Install Dependencies**

```bash
mvn clean install
```

1. **Configure WebDrivers**

Ensure that the appropriate WebDriver dependencies (e.g., chromedriver, geckodriver) are placed in the pom.xml

1. **Running Tests**

make the changes according to the browser specified in baseclass and Run the tests using testing.xml

1. **Generating Reports**

Extent report will be generated accordingly and specify the path to be stored in baseclass

**License**

This project is licensed under the MIT License.
