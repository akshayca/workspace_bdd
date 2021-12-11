Feature: Matrix
  Test my Leetcode coding Matrix challenges using BDD cucumber

  Scenario: A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
    
    Given an m x n matrix
    When the matrix is Toeplitz
    Then return true if the matrix is Toeplitz Otherwise return false