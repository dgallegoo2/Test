#Autor: Daniel Estiven Gallego
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Rose wants to learn automation at the Academy Choucair
    | strUser    | strPassword    |
    | 1026154371 | Choucair2020*  |
    When she search for the course on the Choucair Academy platform
    | strCourse                               |
    | Prueba Técnica - Analista Bancolombia   |
    Then she finds the course called
    | strCourse                               |
    | Prueba Técnica - Analista Bancolombia   |
