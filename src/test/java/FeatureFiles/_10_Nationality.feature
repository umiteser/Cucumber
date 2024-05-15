#Nationality menusunun kayıt ve silme özelliğini
#DataTable ile 5 fakrlı değer seti ile çalıştırınız.

Feature: Nationality multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality and Delete
    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name  |
      | umit1 |
      | umit2 |
      | umit3 |
      | umit4 |
      | umit5 |
