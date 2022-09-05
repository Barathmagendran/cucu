#Author: your.email@your.domain.com
Feature: Google map API
  I want to use this template for my feature file

  Scenario: Add new location
    Given User want add my payload
    When User submit "Post" API
    Then User want to assert the status code is 200
