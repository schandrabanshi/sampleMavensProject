Feature: selendroid test app home page .
  Verify application start page and enter your text. Click on display text button and verify the displayed text.

  @home
  Scenario Outline: Enter text and click on displayed text button and verify it.
    Given Home page is opened for selendroid test app
    Then I want to enter text <text>
    Then click on Displayed text view button
    Then Validate the displayed text

    Examples: 
      | firstname   |
      | Saroj Kumar |