Feature: Need to get the order id

  Scenario: need to book hotel rooms
    Given goto the hotel url
    When entering user credentials
    And entering the dates
    Then rooms to be booked
