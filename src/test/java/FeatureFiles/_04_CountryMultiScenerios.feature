Feature: Country Multi Scenario

  Background: #before senaryo    #ortak olanların hepsini bu kısma aldık
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country

  @Regression #hata versin diye koyduk
  Scenario: Create a Country
    When Create a country
    Then Success message should be displayed

  @Regression
  Scenario: Create a Country 2
    When Create a country name as "umtUlk12" code as "umtUlk12Kod"
    Then Success message should be displayed