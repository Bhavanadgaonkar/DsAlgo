@tag
Feature: Tree Features
Background: The user is logged in to DS Algo portal

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal
When  The user enter valid username and password
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button
 Then The user is on the home page screen after logged in 
 
 Scenario: The user is directed to Tree Page
 Given: The user is on the home page after logged in
 When The user select Tree item from the drop down menu
 Then The user should be directed to Tree Page
 
 Scenario: The user is able to navigate to Overview of Trees page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Overview of Trees link
 Then The user should then be directed to Overview of Trees Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Overview of Trees after logged in
 When The user clicks Try Here button in Overview of Tree page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
  
 Scenario Outline: The user is able to run code in tryEditor
 Given: The user is in trees page having an tryEditor with a Run button to test the code
 When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         0 |
 
 Scenario Outline: The user is able to get the error message for invalid syantax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
 When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         1 |
 
 Scenario: The user is able to navigate to Terminologies Page
 Given: The user is in the Tree page after logged in
 When The user clicks Terminologies button
 Then The user should be directed to Terminologies Page
 
 Scenario: The user is able to navigate to Terminologies page having an tryEditor
 Given: The user is on the Terminologies page after logged in
 When The user clicks Try Here button in Terminologies page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
  
 Scenario Outline: The user is able to run code in tryEditor
 Given: The user is in trees page having an tryEditor with a Run button to test the code
 When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         2 |
 
 Scenario Outline: The user is able to get the error message for invalid syantax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
 When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         3 |
 
 Scenario: The user is able to navigate to Types of Trees Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Types of Trees button
 Then The user should be directed to Types of Trees Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the types of trees after logged in
 When The user clicks Try Here button in tree page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
 Given: The user is in trees page having an tryEditor with a Run button to test the code
 When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         4 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         5 |
 
 Scenario: The user is able to navigate to Tree Traversals Page
 Given: The user is on the Tree page after logged in
 When The user clicks Tree Traversals button
 Then The user should be directed to Tree Traversals Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the tree traversals after logged in
 When The user clicks Try Here button in tree page
 Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
 Given: The user is in trees page having an tryEditor with a Run button to test the code
 When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         6 |
 
 Scenario Outline: The user is able to get the error message for invalid syantax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         7 |
 
 Scenario: The user is able to navigate to Traversals illustration Page
 Given: The user is on the tree page after logged in
 When The user clicks on the Traversals Illustration button
 Then The user should be directed to Traversals Illustration Page
 
 Scenario: The user is able to navigate to a Page having an tryEditor
 Given: The user is on the traversals illustration page after logged in
 When The user clicks Try Here button in tree page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
 Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         8 |
 
 Scenario Outline: The user is able to get the error message for invalid syantax
Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber  | 
 |TreepythonCode |         9 |
 
 Scenario: The user is able to navigate to Binary trees Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Binary Trees button
 Then The user should be directed to Binary Trees Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the binary trees page after logged in
 When The user clicks Try Here button in tree page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
 Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         10 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         11 |
 
 Scenario: The user is able to navigate to Types of Binary trees Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the types of binary trees button
 Then The user should be directed to types of binary trees Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the types of binary trees page after logged in
 When The user clicks Try Here button in tree page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         12 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         13 |
 
 Scenario: The user is able to navigate to Implementation in Python Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Implementation in Python button
 Then The user should be directed to Implementation in Python of tree Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Implementation in Python after logged in
 When The user clicks Try Here button in a implementation in python page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         14 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         15 |
 
 Scenario: The user is able to navigate to binary tree traversals Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the binary tree traversals button
 Then The user should be directed to Binary Tree Traversals of tree Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Binary Tree Traversals after logged in
 When The user clicks Try Here button in a binary tree traversals page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         16 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         17 |
 
 Scenario: The user is able to navigate to Implementation of Binary Trees Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Implementation of Binary Trees button
 Then The user should be directed to the Implementation of Binary Trees of tree Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Implementation of Binary Trees after logged in
 When The user clicks Try Here button in a Implementation of binary trees page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         18 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         19 |
 
 Scenario: The user is able to navigate to Applications of Binary Trees Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Applications of Binary trees button
 Then The user should be directed to the Applications of Binary trees of tree Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Applications of Binary Trees page after logged in
 When The user clicks Try Here button in a Applications of binary trees page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         20 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         21 |
 
 Scenario: The user is able to navigate to Binary Search Trees Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Binary Search Trees button
 Then The user should be directed to the Binary Search Trees of tree Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Binary Search Trees after logged in
 When The user clicks Try Here button in a Binary Search Trees page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         22 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         23 |
 
 Scenario: The user is able to navigate to Implementation of BST Page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Implementation Of BST button
 Then The user should be directed to the Implementation Of BST of tree Page
 
 Scenario: The user is able to navigate to a page having an tryEditor
 Given: The user is on the Implementation Of BST after logged in
 When The user clicks Try Here button in a Implementation of BST page
  Then The user should be redirected to a page having an tryEditor with a Run button to test the tree code
 
 Scenario Outline: The user is able to run code in tryEditor
  Given: The user is in trees page having an tryEditor with a Run button to test the code
  When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
 And The user clicks on Run button after Entering valid python code in trees tryEditor
 Then The user should be presented with Run output for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         24 |
 
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given: The user is in trees page having an tryEditor with a Run button to test the code
When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
 And The user clicks on Run button after Entering invalid python code in trees tryEditor
 Then The user should get the error message for trees
 
 Examples: 
 |Sheetname      |RowNumber   | 
 |TreepythonCode |         25 |
 
 Scenario: The user validating Practice Questions page
 Given: The user is on the Tree page after logged in
 When The user clicks on the Overview of Trees link on the tree page
 And The user clicks on the Practice Questions in Overview of Trees
 Then The user should be redirected to Practice Questions of tree page
 
 