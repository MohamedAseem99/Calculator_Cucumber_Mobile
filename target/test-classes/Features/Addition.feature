Feature: Addition of Numbers

  @Sanity
  Scenario Outline: Addition of Two whole numbers
    Given Verify app is Launched
    And Enter First number <number1>
    And Enter Operator as "+"
    And Enter Second number <number2>
    When Operator is given as "="
    Then Result should be calculated and assertion was done with <number1> and <number2>

    Examples: 
      | number1 | number2 |
      | "19"    | "27"    |
      | "25"    | "77"    |
