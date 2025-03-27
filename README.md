# Selenium Test Automation for DemoWebShop

## 📌 Project Overview
This project aims to automate the test cases for the DemoWebShop application using **Selenium WebDriver**, **Java**, and **JUnit**. The test scenarios are designed based on the **user stories** provided in the documentation.

## 🔧 Technologies Used
- **Java** (Test Automation Language)
- **Selenium WebDriver** (Browser Automation)
- **JUnit** (Test Framework)
- **Maven** (Dependency Management)
- **IntelliJ IDEA** (IDE)
- **GitHub** (Version Control)

## 📜 User Stories Covered
The following user stories are automated:
1. **User Registration**
2. **Negative Registration Scenarios**
3. **Login & Logout**
4. **Negative Login Scenarios**
5. **Ordering Products**
6. **Survey Response**
7. **Coupon & Gift Card Validation**
8. **Order History Download**

## 📂 Project Structure
```
📦 SeleniumDemoWebShop
 ┣ 📂 src
 ┃ ┣ 📂 testCases
 ┃ ┃ ┣ 📝 RegisterTest.java
 ┃ ┃ ┣ 📝 LoginTest.java
 ┃ ┃ ┣ 📝 OrderTest.java
 ┃ ┃ ┗ 📝 NegativeScenariosTest.java
 ┃ ┣ 📂 utilities
 ┃ ┃ ┣ 📝 WebDriverManager.java
 ┃ ┃ ┣ 📝 ConfigReader.java
 ┃ ┃ ┗ 📝 TestBase.java
 ┣ 📜 pom.xml (Maven dependencies)
 ┣ 📜 junit.xml (JUnit Configuration)
 ┗ 📜 README.md (Project Documentation)
```

## 🚀 Installation & Setup
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/AtillaTorosAvci/DemoWebShop.git
   ```
2. **Open the Project in IntelliJ IDEA.**
3. **Install Dependencies:**
   ```sh
   mvn clean install
   ```
4. **Run Tests Using JUnit:**
   ```sh
   mvn test
   ```

## 🧪 Running the Tests
- Run test cases individually in IntelliJ IDEA.
- Alternatively, execute tests using the Maven command:
  ```sh
  mvn test
  ```

## 📄 Reporting
- Test execution results are stored in the `test-output` folder.
- HTML reports can be accessed under `test-output/index.html`.

## 🛠 Configuration
Modify the `config.properties` file to set the required parameters such as:
```
baseURL = https://demowebshop.tricentis.com/
browser = Chrome
username = atillapractice@hotmail.com
password = GreenCard123
```

## 🏗️ Future Improvements
- Implement CI/CD pipeline with **GitHub Actions**.
- Enhance reporting with **Extent Reports**.
- Add **Page Object Model (POM)** for better maintainability.

## 📌 Contributors
- **[Atilla Toros Avcı](https://github.com/AtillaTorosAvci)** 
- **[Barış Saydam](https://github.com/BarisSaydam)**
- **[Erdem Özkan](https://github.com/ErdemOzkann)**
- **[Ömer Boncuk](https://github.com/palanque92)**
- **[Diyar ölmez](https://github.com/diyarolmezz)**
- **[Ebubekir Duvarcı](https://github.com/Ebubekir2025)**
- **[Gamze Batmaz](https://github.com/GAMZE3845/)**
---

**📌 Note:** This project is for educational and testing purposes only.
