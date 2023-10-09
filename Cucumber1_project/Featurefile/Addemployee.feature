Feature: 
  As a Admin user validate Add employee with multiple data

  @addEmployee
  Scenario Outline: Validate Add Employee

    Given Launch url "http://orangehrm.qedgetech.com/" in a browser
    When Enter user as "Admin" in username
    And Enter pass as"Qedge123!@#" in password
    And Click login button
    And click pim
    And Click Add button
    And Enter fname "<FirstName>" in firstname textbox
    And Enter mname "<MiddleName>" in mname textbox
    And Enter lname "<LastName>" in last name textbox
    And Capture Eid BeforeAdding Employee
    And Click save button
    And capture Eid After Adding employee
    Then Valid empoyee id before and after
    Then Close browser

    Examples: 
      | FirstName   | MiddleName   | LastName      |
      | Testing167  | Selenium123  | TopMncJob14   |
      | Testing334  | Selenium1567 | TopMncJob7561 |
      | Testing1743 | Selenium8156 | TopMncJob9781 |
      | Testing1656 | Selenium8561 | TopMncJob9167 |
