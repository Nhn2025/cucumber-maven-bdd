Feature: Facebook login page

  #no_param
  Scenario: Scenario have no parameter
    Given Open facebook application
    When Input to Username textbox
    And Input to Password textbox
    And Click to Submit button
    And Close application

  #param_mark
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with "nhu@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button
    And Close application

  #multiple_param
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username with "nhu@gmail.com" and Password with "123456"
    And Click to Submit button
    And Close application

  #datatable_step
  Scenario Outline: Creata newe Customer with email <Username>
    Given Open facebook application
    When Input to <Username> and <Password>
    Then Verify Address as <Address>
    And Click to Submit button
    And Close application

    Examples:
      | Username      | Password | City    | Address | Phone     |
      | nhu@gmail.com | 12345    | Ha Noi  | Le Loi  | 038868292 |