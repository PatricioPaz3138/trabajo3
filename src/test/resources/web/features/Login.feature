@Login
Feature: Login

  Background:
    Given el usuario ingresa a la URL
    And el usuario hace click en el boton My Account

  @LoginExitoso
  Scenario Outline: Inicio de sesion Exitoso

    Given el usuario ingresa usuario <usuario> y contraseña <contrasenia>
    When el usuario hace click en el boton login
    Then el usuario inicia sesion correctamente
    Examples:
      | usuario                     | contrasenia    |
      | patricio_paz_16@hotmail.com | Patricio3138!! |

  @LoginFallido
  Scenario Outline: Inicio de sesion Fallido

    Given el usuario ingresa usuario <usuario> y contraseña <contrasenia>
    And el usuario hace click en el boton login
    Then el usuario visualiza un mensaje <mensaje> de error
    Examples:
      | usuario                     | contrasenia    | mensaje                  |
      | Patricio3233                | 12345          | not registered           |
      | patricio_paz_16@hotmail.com |                | Password is required.    |
      |                             | Patricio3138!! | Username is required.    |
      |                             |                | Username is required.    |
      | pATRICIO_PAZ_16@HOTMAIL.COM | pATrICiO3138!! | the password you entered |

  @CierreDeSesion
  Scenario Outline: Cierre de sesion Exitoso

    Given el usuario ingresa usuario <usuario> y contraseña <contrasenia>
    When el usuario hace click en el boton login
    And el usuario inicia sesion correctamente
    And el usuario hace click en cerrar sesion
    And el usuario vuelve atras en la pagina
    Then el usuario no debe estar logeado
    Examples:
      | usuario                     | contrasenia    |
      | patricio_paz_16@hotmail.com | Patricio3138!! |




