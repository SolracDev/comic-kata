Feature: Comic Reminder
  A client should be able create reminders for his favourite comics.
  A client should be able check the upcoming releases of his favourite comics for the current month

  Scenario: Add Reminder
    Given a client creates a reminder for "Spider-Man"
    And a reminder for "Daredevil"
    When he lists his reminders
    Then he would see
    """
    List Of Reminders
    Spider-man
    Daredevil
    """

  Scenario: Check Upcoming releases without setting reminders
    Given a marvel API witch returns the list of comics for the next month
    When he checks the upcoming releases of his favourite comics
    Then he would see an exception


  Scenario: Check Upcoming releases
    Given a marvel API witch returns the list of comics for the next month
    And a reminder for "Spider-Man"
    And a reminder for "Daredevil"
    When he checks the upcoming releases of his favourite comics
    Then he would see
    """
    Name                              | On Sale Date  | Print Price

    The Amazing Spider-Man (2015) #5" | 2015-12-23    | 3.99
    Daredevil (2015) #2               | 2015-12-23    | 3.99

    Total Price: 7.98
    """


  Scenario: Check Upcoming releases with a slow API
    Given a marvel API witch returns the list of comics for the next month but is slow
    And a reminder for "Spider-Man"
    And a reminder for "Daredevil"
    When he checks the upcoming releases of his favourite comics
    Then he would see an error in less than 4 seconds