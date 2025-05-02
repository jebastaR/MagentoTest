# 🧪 Magento Sign-Up Flow Automation (BDD Cucumber Framework)

This repository contains an automated test framework using **Selenium WebDriver**, **Cucumber (BDD)**, and **Java** to test the **Sign-Up flow** on [Magento's Demo Site](https://magento.softwaretestingboard.com/).

---

## 📌 Tech Stack

- **Java**
- **Selenium WebDriver**
- **Cucumber (Gherkin syntax)**
- **JUnit/TestNG**
- **Page Object Model (POM)**
- **Maven**
- **GIT**

---

## 🚀 Features

- BDD framework using **Cucumber** for readable, maintainable test scenarios
- Automated test coverage for **user sign-up flow**
- Uses **Page Object Model** to separate test logic from UI structure
- **Reusable components** and clean code structure
- Easy test execution via **Maven commands**
- Sample **test reports** and **screenshots on failure** (optional if added)

---

## 🔧 Prerequisites

- Java (JDK 8+)
- Maven
- IDE (Eclipse/IntelliJ)
- ChromeDriver (compatible with your Chrome version)

---

## 📂 Project Structure

```plaintext
├── src
│   ├── main
│   │   └── java
│   │       └── pageObjects/         # Page classes
│   ├── test
│   │   └── java
│   │       ├── stepDefinitions/     # Step definitions for Cucumber
│   │       └── runners/             # Cucumber test runner
│   └── resources
│       └── features/                # .feature files
│       └── config.properties        # Configuration (optional)
├── pom.xml
├── README.md
