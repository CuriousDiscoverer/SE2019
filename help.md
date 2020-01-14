# How to do..

Useful: https://www.w3schools.com/java/java_data_types.asp

## (1) Maven project

1 - Open Netbeans

2 - File -> New Project -> Maven -> WebApplication

3 - Insert project name ect.

4 - Java version: 7

## AX-WS Web Services (SOAP)

ref: https://netbeans.org/kb/docs/websvc/jax-ws.html

First of all do (1) then:

1 - Right-click the "ProjectName" node and choose New > Web Service.
2 - Name the web service (ex: name: CalculatorWS and type org.me.calculator in Package). Leave Create Web Service from Scratch selected.

If you are creating a Java EE project on GlassFish or WebLogic, select Implement Web Service as a Stateless Session Bean. 

3 - Click Finish. The Projects window displays the structure of the new web service and the source code is shown in the editor area.

###  Adding an Operation to the Web Service (AX-WS Web Services)

1 - Find the web service's node in the Projects window. 

2 - Right-click that node. A context menu opens.

3 - Click Add Operation in either the visual designer or the context menu. The Add Operation dialog opens.

4 - In the upper part of the Add Operation dialog box, type "NameOperation" in Name and type int in the Return Type drop-down list (if you want to return an integer value).

5 - In the lower part of the Add Operation dialog box, click Add and create a parameter of type "int" or whatever, named "x" or whatever.

6 - Click Add again and create another parameter if required or needed.

7 - Click OK at the bottom of the Add Operation dialog box. You return to the editor.

8 - Remove the default hello operation, either by deleting the hello() method in the source code or by selecting the hello operation in the visual designer and clicking Remove Operation. 

9 - Write the desired code

### Deploy and test

If you are using the Tomcat Web Server, there is no test client. You can only run the project and see if the Tomcat Web Services page opens.

In this case, before you run the project, you need to make the web service the entry point to your application. To make the web service the entry point to your application, right-click the project node and choose Properties.

Open the Run properties and type /NameWebService (Specific Name of web service created) in the Relative URL field. Click OK.

To run the project, right-click the project node again and select Run.

(also click on "run project" green arrow)

### Client in Java

1 - Choose File > New Project (Ctrl-Shift-N on Linux and Windows, ⌘-Shift-N on MacOS). Select Java Application from the Java category. Name the project CalculatorWS_Client_Application. Leave Create Main Class selected and accept all other default settings. Click Finish.

2 - Right-click the CalculatorWS_Client_Application node and choose New > Web Service Client. The New Web Service Client wizard opens.

3 - Select Project as the WSDL source. Click Browse. Browse to the CalculatorWS web service in the CalculatorWSApplication project. When you have selected the web service, click OK.

4 - Do not select a package name. Leave this field empty.

5- Leave the other settings at default and click Finish.

The Projects window displays the new web service client, with a node for the add method that you created:
