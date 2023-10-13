@tag
Feature: Linked List Features
Background: The user is logged in to DS Algo portal

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal
When  The user enter valid username and password
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button
 Then The user is on the home page screen after logged in 
 
 Scenario: User navigated to linked list page
 Given: The user is in the Home page after logged in to the portal
 When The user selecting linkedlist item from the drop down menu
 Then The user should be directed to Linked List  Page
 
 Scenario: User navigated to Introduction page
 Given: The user is in the Linked List  page after logged in
 When The user clicks Introduction link
 Then The user should be directed to Introduction of Linked List Page
 
 Scenario: User navigated to tryEditor page with Run button from Introduction page
 Given: The user is on the Introduction after logged in
 When The user clicks Try Here button in the introduction page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the code
 
 Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
 Given: The user is in a try here page having  tryEditor with a Run button to  test for Introduction page
 When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         0 |
 
 Scenario Outline: The user getting error message with invalid python code for Introduction page
 Given: The user is in a try here page having  tryEditor with a Run button to test for Introduction page
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> 
 And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         1 |
 
 Scenario: User navigated to creating linked list page
 Given: The user is in the Linked List  page after logged in
 When The user clicks the Creating a Linked List button
 Then The user should be directed to Creating Linked List Page
 
 Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
 Given: The user is on the Creating a Linked List after logged in
 When The user clicks Try Here button in the creating linked list page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the Linked List
 
 Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         2 |
 
 Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         3 |
 
 Scenario: User navigated to Types of linked list page
 Given: The user is in the Linked List  page after logged in
 When The user clicks the Types of Linked List button
 Then The user should be directed to Types of Linked List Page
 
 Scenario: User navigated to tryEditor page with Run button from Types of Linked List
 Given: The user is on the Types of Linked list after logged in
 When The user clicks Try Here button in the types of linked list page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the code
 
 Scenario Outline: The user run the code in tryEditor with valid input for Types of Linked List
 Given: The user is in a try here page having  tryEditor with a Run button to test 
 When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         4 |
 
 Scenario Outline: The user getting error message with invalid python code for Types of Linked List
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         5 |
 
 Scenario: user navigated to Implementation linked list in python page
 Given: The user is in the Linked List  page after logged in
 When The user clicks the Implement Linked List in Python button
 Then The user should be directed to Implement Linked List in Python Page
 
 Scenario: User navigated to tryEditor page with Run button from Implement Linked List
 Given: The user is on the Implement Linked List in Python after logged in
 When The user clicks Try Here button in the implemented linked list in python page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the code
 
 Scenario Outline: The user run the code in tryEditor with valid input for Implement Linked List in Python page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         6 |
 
 Scenario Outline: The user getting error message with invalid python code for Implement Linked List in Python page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         7 |
 
 Scenario: user navigated to Traversal page
 Given: The user is in the Linked List  page after logged in
 When The user clicks the Traversal button
 Then The user should be directed to Traversal Page
 
 Scenario: User navigated to tryEditor page with Run button from Traversal page
 Given: The user is on the Traversal after logged in
 When The user clicks Try Here button in the traversal page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the code
 
 Scenario Outline: The user run the code in tryEditor with valid input for Traversal page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When  The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         8 |
 
 Scenario Outline:  The user getting error message with invalid python code for Traversal page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         9 |
 
 Scenario: user navigated to Insertion page
 Given: The user is in the Linked List  page after logged in
 When The user clicks the Insertion button
 Then The user should be directed to Insertion Page
 
 Scenario: User navigated to tryEditor page with Run button from Insertion page
 Given:  The user is on the Insertion after logged in
 When The user clicks Try Here button in the Insertion page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the code
 
 Scenario Outline: The user run the code in tryEditor with valid input for Insertion page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When  The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         10 |
 
 Scenario Outline: The user getting error message with invalid python code for Insertion page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         11 |
 
 Scenario: user navigated to Deletion page
 Given: The user is in the Linked List  page after logged in
 When The user clicks the Deletion button
 Then The user should be directed to Deletion Page
 
 Scenario: User navigated to tryEditor page with Run button from Deletion page
 Given: The user is on the Deletion after logged in
 When The user clicks Try Here button in the Deletion page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the code
 
 Scenario Outline: The user run the code in tryEditor with valid input for Deletion page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When  The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And user click on Run button to run the code
 Then The user should be presented with the Run output for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         12 |
 
 Scenario Outline: The user getting error message with invalid python code for Deletion page
 Given: The user is in a try here page having  tryEditor with a Run button to test
 When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> 
 And user click on Run button to run the code
 Then The user should be presented with the error message for the executed code
  Examples: 
      | Sheetname  | RowNumber |
      | LLpythonCode |         13 |
 
 Scenario: The user validating Practice Questions page
 Given: The user is in the Linked List page after logged in
 When The user clicks Introduction link from the linked list page
 And The user clicks on the Practice Questions
 Then The user should be directed to Practice Questions of Linked List Page
 
 