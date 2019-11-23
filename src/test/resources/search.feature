@SmokeTestCase
Feature:Wales user journey Feature
  As a person from Wales
  I need to know what help i can get with my NHS costs
  So that I can get the treatment i need

  Scenario: wales user journey with valid credential
    Given  I am a person from Wales
    When  I put my circumstances into the Checker tool
    Then  I should get a result of whether i will get help or not


