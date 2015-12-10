Feature: Comic Reminder
  A client should be able create reminders for his favourite comics.
  A client should be able check the upcoming releases of his favourite comics for the current month

  Scenario: Add Reminder
    Given a user who creates a reminder for "Spider-Man"
    And a reminder for "Daredevil"
    When the user lists his reminders
    Then the user would see
    """
    List Of Reminders
    Spider-man
    Daredevil
    """

  Scenario: Check Upcoming releases without setting reminders
    Given that no reminder has been added
    When the user checks the upcoming releases of his favourite comics
    Then the user would see an exception


  Scenario: Check Upcoming releases
    Given a marvel API witch returns the list of comics for the next month
    And a reminder for "Spider-Man"
    And a reminder for "Daredevil"
    When the user checks the upcoming releases of his favourite comics
    Then the user would see
    """
    Name                              | On Sale Date  | Print Price

    The Amazing Spider-Man (2015) #5" | 2015-12-23    | 3.99
    Daredevil (2015) #2               | 2015-12-23    | 3.99

    Total Price: 7.98
    """


  Scenario: Check Upcoming releases with a slow API
    Given a slow marvel API
    And a reminder for "Spider-Man"
    And a reminder for "Daredevil"
    When the user checks the upcoming releases of his favourite comics
    Then the user would see an error whether the response time is high than 4 seconds