
Feature: Dentist Reservation

	Background:
	 Given User opens the reservation window

  Scenario: User reserves with valid date, time, role and user
    When Enters valid date
    And Enters valid hour
    And Enters valid role
    And Enters valid user credentials
    And Presses the send button
    Then Sees a success message
    
    Scenario: User reserves without entering a date
    When Enters valid hour
    And Enters valid role
    And Enters valid user credentials
    And Presses the send button
    Then Sees a missing date message
    
    Scenario: User reserves time without email
    Given Open window for reserving time
    When Enter valid time
    And click reserve button
    Then see message missing some field
    
    
   Scenario: User reserves time without email and time
    Given Open window for reserving time
    When click reserve button
    Then see message missing some field
    
   Scenario: User reserves time with invalid email
    Given Open window for reserving time
    When Enter invalid user email 
    And Enter valid time
    And click reserve button
    Then see message invalid email 
    
    
    Scenario: User reserves without entering a time
    When Enters valid date
    And Enters valid role
    And Enters valid user credentials
    And Presses the send button
    Then Sees a missing hour message
    
    Scenario: User reserves without entering a role
    When Enters valid date
    And Enters valid hour
    And Enters valid user credentials
    And Presses the send button
    Then Sees a missing role message
    
    Scenario: User reserves without entering user credentials
    When Enters valid date
    And Enters valid hour
    And Enters valid role
    And Presses the send button
    Then Sees a missing user credentials message
    
    Scenario: User reserves without input data
    When Presses the send button
    Then Sees a missing input data message

    
