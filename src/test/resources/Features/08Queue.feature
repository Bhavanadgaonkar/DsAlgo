@tag
Feature: Queue Features
Background: The user is logged in to DS Algo portal

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal
When  The user enter valid username and password
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button
 Then The user is on the home page screen after logged in 
 
 Scenario: The user is able to navigate to Queue Data Structure Page
 Given: The user is in the Home page 
 When The user clicks the Queue item from drop down menu
 Then The user should be directed to Queue Data Structure Page
 
 Scenario: The user is able to navigate to Implementation of Queue page
 Given: The user is in Queue Page
 When The user clicks on Implementation of queue  in Python link
 Then The user should be directed to Implementation of queue  in Python Page
 
 Scenario: The user should be directed to editor page with run button to test python code in queue
 Given: The user is in Implementation of queue  in Python Page
 When The user clicks on Try here link in Implementation of queue
 Then The user navigates to Editor page with Run button
 
 Scenario Outline: The user is able to run code in Editor for Implementation of queue page
 Given: The user is in a page having an Editor with a Run button to Test
 When The user enters valid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
 And clicks Run button in queue editor
 Then The user is presented with the result after Run button is clicked for the entered code
 Examples: 
 |Sheetname   |RowNumber  | 
 | QueuepythonCode |         0 |
 
 Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
 Given: The user is in a page having an Editor with a Run button to Test
 When The user enters invalid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
 And clicks Run button in queue editor
 Then The user gets an Error Message for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         1 |
 
 Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
 Given: The user is in Editor Page and navigates to Queue Page
 When The user clicks on Implementation using collections deque link
 Then The user should be redirected to Implementation using collections deque page
 
 Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page
 Given: The user in implementation using collections page
 When The user clicks on Tryhere link in implementation using collections page
 Then The user navigates to Editor page with Run button
 
 Scenario Outline: The user is able to run code in Editor for Implementation using collections page
 Given: The user is in a page having an Editor with a Run button to test
 When The user enters valid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
And clicks Run button in queue editor
 Then The user is presented with the result after Run button is clicked for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         2 |
 
 
 Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using collections page
 Given: The user is in a page having an Editor with a Run button to test
 When The user enters invalid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
 And clicks Run button in queue editor
 Then The user gets an Error Message for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         3 |
 
 
 Scenario: The user is able to navigate to queue page and click on Implementation using array link
 Given: The user in editor page and navigates to the Queue page
 When The user clicks on Implementation using array link
 Then The user should be redirected to Implementation using array page
 
 Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
 Given: The user in Implementation using array page
 When The user clicks on Tryhere link in Implementation using array page
 Then The user navigates to Editor page with Run button
 
 Scenario Outline: The user is able to run code in Editor for Implementation using array page
 Given: The user is in a page having an Editor with a Run button to test
 When The user enters valid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
 And clicks Run button in queue editor
 Then The user is presented with the result after Run button is clicked for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         4 |
 
 Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using array page
 Given: The user is in a page having an Editor with a Run button to test
 When The user enters invalid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
 And clicks Run button in queue editor
 Then The user gets an Error Message for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         5 |
 
 Scenario: The user is able to navigate to queue page and click on Queue Operations link
 Given: The user in Editor page and navigates to the Queue page
 When The user clicks on Queue Operations  link
 Then The user should be redirected to Queue Operations page
 
 Scenario: The user should be directed to editor page with run button to test python code
 Given: The user in Queue Operations page
 When The user clicks on Tryhere link in Queue Operations page
 Then The user navigates to Editor page with Run button
 
 Scenario Outline: The user is able to run code in Editor for Queue Operations page
 Given: The user is in a page having an Editor with a Run button to test
 When The user enters valid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber>  
 And clicks Run button in queue editor
 Then The user is presented with the result after Run button is clicked for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         6 |
 
 Scenario Outline: The user is presented with error message for invalid code in Editor
 Given: The user is in a page having an Editor with a Run button to test
 When The user enters invalid python code in Editor from the queue sheet "<Sheetname>" and <RowNumber> 
  And clicks Run button in queue editor
 Then The user gets an Error Message for the entered code
 Examples: 
 |Sheetname        |RowNumber  | 
 | QueuepythonCode |         7 |
 
 Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
 Given: The user is in Editor page and navigates to QueueOp page
 When The user clicks on Practice Questions in QueueOp page
 Then The user is directed to Practice  from QueueOp page
 
 