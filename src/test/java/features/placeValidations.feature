Feature: Validating Place API's

  Scenario: Validation if place is being Successfully added using AddPlacesAPI
    Given Add place payload
    When User calls "AddPlaceAPI" with POST http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"