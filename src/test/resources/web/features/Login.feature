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
      | usuario                     | contrasenia    | mensaje                                                                                                                              |
      | Patricio3233                | 12345          | Error: the username Patricio3233 is not registered on this site. If you are unsure of your username, try your email address instead. |
      | patricio_paz_16@hotmail.com |                | Error: Password is required.                                                                                                         |
      |                             | Patricio3138!! | Error: Username is required.                                                                                                         |
      |                             |                | Error: Username is required.                                                                                                         |
      | pATRICIO_PAZ_16@HOTMAIL.COM | pATrICiO3138!! | Error: the password you entered for the username pATRICIO_PAZ_16@HOTMAIL.COM is incorrect. Lost your password?                       |

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




