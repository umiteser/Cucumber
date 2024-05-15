#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

#Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız.

  Feature: Citizenship Functionality

    Background:
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to citizenShip

    @Regression  #hata versin diye koyduk.
    Scenario: Create a citizenship with parameter
      When Create a citizenShip name as "umit14" shortcode as"umitKod14"
      Then Success message should be displayed

    Scenario: Create a citizenship with parameter
      When Create a citizenShip name as "umit14" shortcode as"umitKod14"
      Then Already exist message should be displayed

      Scenario: Delete citizenship
        When user delete name as "umit14"
        Then Success message should be displayed