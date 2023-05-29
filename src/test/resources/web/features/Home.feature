@Home
Feature: Home

  Background:

    Given el usuario ingresa a la URL
    And el usuario clickea Shop menu

  @Sliders
  Scenario: Verificacion de Sliders Exitosa

    When el usuario hace click en el botón del menu home
    Then el usuario verifica que hay solo tres sliders

  @Arrivals
  Scenario: Verificacion de que se visualizan tres arrivals Exitosa

    When el usuario hace click en el botón del menu home
    Then el usuario verifica que hay tres arrivals presentes

  @DescriptionArrivals
  Scenario Outline: Verificacion descripcion de libro Exitosa

    When el usuario hace click en el botón del menu home
    And el usuario hace click en cualquier imagen '<imagenNombre>' del libro
    And el usuario es redirigido a la pagina '<pagina>' para agregar el libro a la cesta
    Then el usuario visualiza la descripcion '<descripcion>' del libro

    Examples:
      | imagenNombre         | pagina               | descripcion      |
      | Selenium Ruby        | Selenium Ruby        | testing web      |
      | Thinking in HTML     | Thinking in HTML     | HTML practically |
      | Mastering JavaScript | Mastering JavaScript | JavaScript       |

  @ReviewArrivals

  Scenario Outline: Verificacion review de libro Exitosa

    When el usuario hace click en el botón del menu home
    And el usuario hace click en cualquier imagen '<imagenNombre>' del libro
    And el usuario es redirigido a la pagina '<pagina>' para agregar el libro a la cesta
    And el usuario hace click en review del libro
    Then el usuario visualiza la review '<reviews>' del libro

    Examples:
      | imagenNombre         | pagina               | reviews                                       |
      | Selenium Ruby        | Selenium Ruby        | Be the first to review “Selenium Ruby”        |
      | Thinking in HTML     | Thinking in HTML     | Be the first to review “Thinking in HTML”     |
      | Mastering JavaScript | Mastering JavaScript | Be the first to review “Mastering JavaScript” |











