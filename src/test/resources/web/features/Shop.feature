@Shop
Feature: Shop

  @ReadMore
  Scenario Outline: Verificacion boton Read More
    Given el usuario ingresa a la URL
    When el usuario clickea Shop menu
    And el usuario hace click en el boton readMore del libro <libro>
    Then el usuario no puede comprar el libro por qué está agotado <mensaje>
    Examples:
      | libro                            | mensaje      |
      | Android Quick Start Guide        | Out of stock |
      | Functional Programming in JS     | Out of stock |


  @SORTING
  Scenario: Verificacion Ordenar por Novedad
    Given el usuario ingresa a la URL
    When el usuario clickea Shop menu
    And el usuario hace click en 'Sort by newness'
    Then el usuario visualiza los productos de esa categoria



