#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

Feature: Citizen Functionality

  @SmokeTest @Regression
  Scenario: Create a citizenship

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to citizenShip
    When Create a citizenShip
    Then Success message should be displayed