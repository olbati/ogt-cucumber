Feature: convert ones numbers

Scenario: The number 1
 Given I have supplied the arabic number 1
 When I ask for the roman numerals
 Then the result should be I


 Scenario: Convert  The number 2
  Given I have supplied the arabic number 2
  When I ask for the roman numerals
  Then the result should be II