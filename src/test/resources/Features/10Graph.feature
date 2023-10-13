@tag
Feature: Graph Features
Background: The user is logged in to DS Algo portal

Scenario: The user is logged in to DS Algo portal
Given: The user is on Signin page of DS Algo portal
When  The user enter valid username and password
  		| username | password |
      | AnushaG  | Arthi1994|
 And The user click on login button
 Then The user is on the home page screen after logged in 
 
Scenario: The user is able to navigate to Graph Data Structure page
Given: The user is on the home page after logged in
When The user clicks the graph item from the drop down menu
Then The user should be redirected to Graph page

Scenario: The user is able to navigate to Graph page 
Given: The user is on the Graph Page
When The user clicks Graph link on Graph page
Then The user should be redirected to Graph from Graph page

Scenario: The user should be directed to editor page with run button to test python code
Given: The user navigates to Graph-Graph page
When The user clicks on Tryhere link on the Graph page
Then The user should be directed to Editor page with Run button from the Graph page

Scenario Outline: The user is able to run code in Editor for Graph page
Given: The user is in a page having an Editor with a Run button to test
When The user enters valid graph python code in Editor from sheet "<Sheetname>" and <RowNumber>
And clicks run button on the Graph editor page
Then The user is presented with the result after run button is clicked on the Graph editor page

Examples: 
 |Sheetname       |RowNumber  | 
 |GraphpythonCode |         0 |

Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
Given: The user is in a page having an Editor with a Run button to test
When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber> 
And clicks run button on the Graph editor page
Then The user gets an error message on the Graph editor page

Examples: 
 |Sheetname       |RowNumber  | 
 |GraphpythonCode |         1 |

Scenario: The user is able to navigate to graph page and click on Graph Representations link
Given: The user in editor page and navigates to the graph page
When The user clicks on Graph Representations link on the graph page
Then The user should be redirected to Graph Representations page

Scenario: The user should be directed to editor page with run button to test python code from Graph Representations page
Given: The user is in Graph Representations  page
When The user clicks on Tryhere link on graph representations page
Then The user navigates to Editor page with Run button from the graph representation page

Scenario Outline: The user is able to run code in Editor for Graph Representations page
Given: The user is in a page having an Editor with a Run button to test
When The user enters valid graph python code in Editor from sheet "<Sheetname>" and <RowNumber>
And clicks run button on the Graph editor page
Then The user is presented with the result after run button is clicked on the Graph editor page

Examples: 
 |Sheetname       |RowNumber  | 
 |GraphpythonCode |         2 |

Scenario Outline: The user is presented with error message for invalid code in Editor for Graph Representations page
Given: The user is in a page having an Editor with a Run button to test
When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber> 
And clicks run button on the Graph editor page
Then The user gets an error message on the Graph editor page

Examples: 
 |Sheetname       |RowNumber  | 
 |GraphpythonCode |         3 |

Scenario: The user is able to navigate to graph representations page and click on Practice Questions
Given: The user is in Editor page and navigates to graph representations page
When The user is in graph page and clicks graph representations link
And The user clicks on Practice Questions in graph representations page
Then The user is directed to graph Practice page

