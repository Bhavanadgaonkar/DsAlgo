@tag
Feature: Stack Features
Background: The user is logged in to DS Algo portal

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal
When  The user enter valid username and password
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button
 Then The user is on the home page screen after logged in 
 
Scenario:The user is directed to Stack Page
Given: The user is on the home page after logged in
When The user select stack item from the drop down menu
Then The user should be directed to Stack Page

Scenario: The user is able to navigate to Operations in Stack page
Given: The user is on the Stack page after logged in
When The user clicks on the Operations in Stack link
Then The user should then be directed to Operations in Stack Page

Scenario: The user is able to navigate to a page having an tryEditor
Given: The user is on the Operations in Stack page after logged in
When The user clicks Try Here button in stack page
Then The user should be redirected to a page having an tryEditor with a Run button to test the Stack page code

Scenario Outline: The user is able to run code in tryEditor
Given: The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets input from excel sheet "<Sheetname>" and <RowNumber>
And The user clicks on Run button after Entering valid python code in stack tryEditor
Then The user should be presented with Run output for the code

Examples: 
          |Sheetname        |RowNumber  | 
          |StackpythonCode |         0 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given: The user is in stack page having an tryEditor with a Run button to test
When The user gets invalid input from excel sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor 
Then The user should get the error message for the code

Examples: 
          | Sheetname       | RowNumber | 
          | StackpythonCode |         1 |


Scenario: The user is able to navigate to Implementation Page
Given: The user is on the Stack page after logged in
When The user clicks on the Implementation link
Then The user should then be directed to Implementation Page

Scenario: The user is able to navigate to Implementation page having an tryeditor
Given: The user is on the Stack Implementation page after logged in
When The user clicks Try Here button in stack Implementation page
Then The user should be redirected to a page having an tryEditor with a Run button to test the Implementation page

Scenario Outline: The user is able to run code in tryEditor
Given: The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets input from excel sheet "<Sheetname>" and <RowNumber>
And The user clicks on Run button after Entering valid python code in stack tryEditor
Then The user should be presented with Run output for the code

Examples: 
|Sheetname        |RowNumber| 
| StackpythonCode |       2 |

Scenario Outline: The user is able to get the error message for invalid syntax
Given: The user is in stack page having an tryEditor with a Run button to test
When The user gets invalid input from excel sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message for the code

Examples: 
|Sheetname       |RowNumber| 
|StackpythonCode |       3 |


Scenario: The user is able to navigate to Applications in stack Page
Given: The user is on the Stackpage after logged in
When The user clicks on the Applications button
Then The user should be directed to Applications Page

Scenario: The user is able to navigate to Applications page having an tryEditor
Given: The user is on the Applications stack page after logged in
When The user clicks Try Here button in stack Applications page
Then The user should be redirected to a page having an tryEditor with a Run button to test the stack code

Scenario Outline: The user is able to run code in tryEditor
Given: The user is in the Stack page after having an tryEditor with a Run button to test
When The user gets input from excel sheet "<Sheetname>" and <RowNumber>
And The user clicks on Run button after Entering valid python code in stack tryEditor
Then The user should be presented with Run output for the code

Examples: 
|Sheetname       |RowNumber| 
|StackpythonCode |       4 |


Scenario Outline: The user is able to get the error message for invalid syntax
Given: The user is in stack page having an tryEditor with a Run button to test
When The user gets invalid input from excel sheet "<Sheetname>" and <RowNumber> 
And The user clicks on Run button after Entering invalid python code in stack tryEditor
Then The user should get the error message for the code
Examples: 
|Sheetname       |RowNumber| 
|StackpythonCode |       5 |

Scenario: The user is able to navigate to Practice Questions in stack Page
Given: The user is on the Stack page after logged in
When The user clicks on the Practice Questions button
Then The user should be redirected to Practice Questions page

