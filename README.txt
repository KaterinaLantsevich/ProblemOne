STEP 1: Navigate to the Project Directory

Open the command line or terminal and navigate to the project's directory.

STEP 2: Build the Project

Execute the following command to build the project and compile the source code:  mvn clean compile

This command will download the project dependencies and compile the Java source code.

STEP 3: Run the Main Application

To execute the main application, use the following command:

mvn exec:java -Dexec.mainClass="org.example.Main"

This will run the Main class, and you should see the output on the console.

STEP 4: Run the Tests

To execute the tests, use the following command:

mvn test

Maven will execute the JUnit tests defined in the ProblemOneTest class and display the test results on the console.