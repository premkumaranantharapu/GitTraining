#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

Feature: Test Google

@Sanity
Scenario Outline: Testing google launch

Given The FaceBook website is launched
When Login screen is visible enter as "<uname>" and "<pwd>"
Then click login

Examples:
|uname|pwd| 
|abcd| abcd|
|efg| efg|

@Regression2
Scenario Outline: Testing google launch2

Given The FaceBook website is launched2
When Login screen2 is visible enter as "<uname>" and "<pwd>"
Then click login2

Examples:
|uname|pwd| 
|abcd| abcd|
|efg| efg|

@Regression3
Scenario Outline: Testing google launch3

Given The FaceBook website is launched3
When Login screen3 is visible enter as "<uname>" and "<pwd>"
Then click login3

Examples:
|uname|pwd| 
|abcd| abcd|
|efg| efg|