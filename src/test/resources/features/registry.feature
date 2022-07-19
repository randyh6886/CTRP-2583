Feature: Verify NCI-2018 Registry search results
  Scenario: Search registry for NCI-2018
    Given I click on trials menu option
    When I type NCI-2018 in trial search input box
    Then I type registry into search by submission box
    Then I click on Registry
    Then I click on Search
    Then I assert search results matches search results
