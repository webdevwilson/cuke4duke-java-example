Feature: Example of a feature file
  As some aspiring cuke4duke user
  I want an example of how it works
  So that I can easily setup my project to use it

  Scenario: A simple passing scenario
    Given the letter 'A'
    When I check the letter
    Then the letter should be 'A'

  @wip
  Scenario: A simple failing scenario
    Given the letter 'A'
    When I check the letter
    Then the letter should be 'B'

  Scenario: A scenario with a table
    Given the following letters:
      |A    |B    |C    |
    When I check the letters
    Then the letters should contain 'A'
     And the letters should contain 'B'
     And the letters should contain 'C'
     And the letters should not contain 'D'

  Scenario Outline: A simple scenario outline
    Given the letter '<the letter>'
    When I check the letter
    Then the letter should be '<the letter>'

  Examples: A few letters
    |the letter   |
    |A            |
    |B            |
    |C            |