Feature: Strings
  Test my Leetcode coding string challenges using BDD cucumber

  Scenario Outline: Find the length of the longest substring without repeating characters
    
    Given I have longest substring length calculator
    When I use the string "<str>" to calculate
    Then The result should be "<answer>"

  Examples:
      | str      | answer |
      | abcabcbb | 3      |
      | bbbbb    | 1      |
      | pwwkew   | 3      |

