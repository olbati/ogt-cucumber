Feature: convert ones numbers

Scenario: The number 10
        Given I have supplied the arabic number 10
        When I ask for the roman numerals
        Then the result should be X

Scenario: Convert  The number 11
         Given I have supplied the arabic number 11
         When I ask for the roman numerals
         Then the result should be XI

Scenario: Convert  The number 14
        Given I have supplied the arabic number 14
         When I ask for the roman numerals
    Then the result should be XIV

Scenario: Convert  The number 15
        Given I have supplied the arabic number 15
        When I ask for the roman numerals
        Then the result should be XV

Scenario: Convert  The number 17
        Given I have supplied the arabic number 17
        When I ask for the roman numerals
        Then the result should be XVII

Scenario: Convert  The number 19
        Given I have supplied the arabic number 19
        When I ask for the roman numerals
        Then the result should be XIX

Scenario: Convert  The number 20
        Given I have supplied the arabic number 20
        When I ask for the roman numerals
        Then the result should be XX

Scenario: Convert  The number 40
        Given I have supplied the arabic number 40
        When I ask for the roman numerals
        Then the result should be XL

Scenario: Convert  The number 50
        Given I have supplied the arabic number 50
        When I ask for the roman numerals
        Then the result should be L

Scenario: Convert  The number 70
        Given I have supplied the arabic number 70
        When I ask for the roman numerals
        Then the result should be LXX

Scenario: Convert  The number 90
        Given I have supplied the arabic number 90
        When I ask for the roman numerals
        Then the result should be XC
