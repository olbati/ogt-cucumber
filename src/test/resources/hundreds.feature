Feature: convert ones numbers

Scenario: The number 100
        Given I have supplied the arabic number 100
        When I ask for the roman numerals
        Then the result should be C

Scenario: Convert  The number 101
         Given I have supplied the arabic number 101
         When I ask for the roman numerals
         Then the result should be CI

Scenario: Convert  The number 114
        Given I have supplied the arabic number 114
         When I ask for the roman numerals
    Then the result should be CXIV

Scenario: Convert  The number 150
        Given I have supplied the arabic number 150
        When I ask for the roman numerals
        Then the result should be CL

Scenario: Convert  The number  300
        Given I have supplied the arabic number 300
        When I ask for the roman numerals
        Then the result should be CCC

Scenario: Convert  The number 400
        Given I have supplied the arabic number 400
        When I ask for the roman numerals
        Then the result should be CD

Scenario: Convert  The number 500
        Given I have supplied the arabic number 500
        When I ask for the roman numerals
        Then the result should be D

Scenario: Convert  The number 40
        Given I have supplied the arabic number 40
        When I ask for the roman numerals
        Then the result should be XL

Scenario: Convert  The number 600
        Given I have supplied the arabic number 600
        When I ask for the roman numerals
        Then the result should be DC

Scenario: Convert  The number 850
        Given I have supplied the arabic number 850
        When I ask for the roman numerals
        Then the result should be DCCCL

Scenario: Convert  The number 900
        Given I have supplied the arabic number 900
        When I ask for the roman numerals
        Then the result should be CM
