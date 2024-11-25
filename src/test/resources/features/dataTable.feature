#login
Feature: DataTable feature

#datatable_step
  Scenario: Create new Customer with multiple credentials
    #Given Open facebook application
    When Input to Username and Password
      | Username        | Password |
      | nhu@gmail.com   | 1234     |
      | admin@gmail.com | 5678     |
    And Click to Submit button
    #And Close application

#datatable_scenario #data_driven_testing
  Scenario Outline: Data Table in Scenario
    #Given Open facebook application
    When Input to Username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
    #And Close application

      Examples:
        | Username      | Password |
        | nhu@gmail.com | 1234     |
        | han@gmail.com | 12345    |
        | tao@gmail.com | 12345    |
        | bin@gmail.com | 12345    |
        | lam@gmail.com | 12345    |