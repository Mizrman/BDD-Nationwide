@auto
Feature: autoquote validation

  Scenario: autoquote test
    Given User navigate to homepage
    When User select Auto insurance
    And User input zipcode
    And User click on Start your quote
    Then User will be in AboutYou page
    When User input first name
    And User input middle initial
    And User input last name
    Then User select suffix name
    And User able to complete their info

  @newsteps
  Scenario: autoquote page steps
    When Homepage steps done
    Then Aboutyou page steps done

  @data-driven
  Scenario Outline: data driven approach for BDD
    When Homepage steps done <zip> 
    Then Aboutyou page steps done
#how can I run two parameters value of zipcode and dropdown on line 23?
    Examples: 
      | zip     |
      | '11042' |
      | '11372' |
      | '11375' |
