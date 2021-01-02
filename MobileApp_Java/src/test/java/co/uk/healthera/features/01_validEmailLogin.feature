Feature: Login

  Scenario Outline: Verify user can login via email

    Given user taps on 'Continue with email' button
    When enters "<email>" and taps 'Continue' button, enters "<password>" and taps 'Login' button
    And user taps on 'Medicines' nav tab
    And user taps on 'Profile' nav tab



    Examples:
      | email               | password |
      | gobitest18@test.com | Gobitest@18 |


