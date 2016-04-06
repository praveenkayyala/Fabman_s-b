Feature: New supplier adding


  In order to Create a  new supplier
  As a Admin
  I want to Add new supplier
  So that i can get more supplies
  sudhakar
//testing
  Background:
    Given I am navigavitive to the Narmans web page
    And I enter the username and password

  @newsupplier
  Scenario: Adding New supplier to the Fabmans

    When I goto supplier and enter the details
    Then I am check new supplier
    And  I am logout my account

#  @newquality
  #    Scenario: Create a new queality
  #      Given I am goto quality management and create new quality
  #      When I enter the details of quality and cloth percentage
  #      Then I am search and view and edit quality
@newbuyer
  Scenario: Adding new buyers to the Fabmans
    Given I am goto buyers and enter the details
    When I am check new buyers
    Then I am logout my accounts


