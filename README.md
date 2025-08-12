🛒 E-Commerce Automation Test Suite
This project is a simple automation test suite developed using Java and Selenium WebDriver. It simulates user interaction with a basic e-commerce flow — from logging in to checking out — with additional UI interaction like taking screenshots and operating the hamburger menu.


✅ Features Covered
The automated test cases in this project perform the following actions:

🔐 Login Form – Automates user login functionality.

🛍️ Select Item – Selects products from the list.

➕ Add to Cart – Adds selected items to the shopping cart.

💳 Checkout/Order – Completes the order process.

📸 Take Screenshot – Captures the current screen for validation/debugging.

🏠 Back to Home – Navigates back to the homepage.

🍔 Open Hamburger Menu – Interacts with hamburger menu.

❌ Close Hamburger Menu – Closes the menu after interaction.




🛠️ Technologies Used
Java (JDK 8+)

Selenium WebDriver

JUnit/TestNG (Optional, if used for test execution)

Maven/Gradle (Optional, if used for dependency management)






🚀 Getting Started
Prerequisites
Java installed (java -version)

Selenium JARs added to classpath or use Maven/Gradle

ChromeDriver or other browser driver installed and path set






Running the Tests

1.) Clone this repository:


git clone https://github.com/yourusername/ecommerce-automation.git

cd ecommerce-automation

2.) Compile and run using your IDE or command line:

javac -cp ".;path/to/selenium-jars/*" your/package/structure/*.java


java -cp ".;path/to/selenium-jars/*" your.package.structure.YourMainTestClass

📸 Screenshots

Screenshots captured during execution are saved in the /screenshots folder (create this folder if not present).





