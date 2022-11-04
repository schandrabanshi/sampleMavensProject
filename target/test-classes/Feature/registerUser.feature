Feature: Register user to selendroid test app
  This scenario to Register user to selendroid test App after after clicking on show progress bar for a while.
	@mentee
  Scenario Outline: Register user after clicking on progress bar button to selendroid test app.
    Given User should be on home page of selendroid test app
    When Click on show progress bar button and wait
    Then Enter username <username>
    Then Enter email <email>
    Then Enter password <password>
    Then Enter name <name>
    Then Select i accept adds option
    Then Click on register user verify
    Then Click on register user submission   
    

    Examples: 
      | username| email | password | name |
      | Saroj | testSaroj@gmail.com | Admin123 | Saroj Kumar |
