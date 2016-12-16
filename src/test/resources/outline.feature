Feature: many example


 Scenario Outline: Convert number from the list
   Given the arabic number <arabicNumber>
    When I ask for the romans numerals
   Then the roman rumber should be <romanNumber>

   Examples:
        | arabicNumber | romanNumber   |
        |    4999 |  MMMMCMXCIX    |
        |    500 |  D  |
        |    100 |  C  |
        |    3001 |  MMMI  |