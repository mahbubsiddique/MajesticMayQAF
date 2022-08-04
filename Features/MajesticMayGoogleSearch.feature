@googleSearch @smokeTest
Feature: google search

@googleSearchSimple
Scenario Outline: simple search

Given I am on the google homepage
When I enter search "<term>"
And I click on google search button
Then I receive relevant results

Examples:
|term								|
|Quality Assurance	|
|Software Testing		|