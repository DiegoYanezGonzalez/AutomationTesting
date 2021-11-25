
Feature: Test different actions on a dropdown page.

    Scenario: As a Test Engineer, I try out different actions on a sandbox page.
     Given I navigate to the dropdown page
        And select a value from the dropdown 


Scenario: As a Test Engineer, I want to retrieve the value of a static table.
    Given I navigate to the static table
        Then I can return the value I wanted


Scenario: As a Test Engineer, I want to retrieve the value of a static table is displayed.
    Given I navigate to the static table
        Then I can validate the table is displayed

@Test
Scenario: As a Test Engineer, I want to validate that a text is present inside the list.
        Given I navigate to the list page
        When I search the list
        Then I can find the text in the list