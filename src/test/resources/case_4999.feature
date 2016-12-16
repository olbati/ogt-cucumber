Feature: convert 4999


 Scenario: Convert  The number 4999
         Given I have supplied the arabic number 4999
         When I ask for the roman numerals
         Then the result should be MMMMCMXCIX
