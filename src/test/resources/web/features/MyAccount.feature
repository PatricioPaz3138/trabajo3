@MyAccount
Feature: MyAccount

  Background:
    Given el usuario ingresa a la URL
    When el usuario hace click en el boton My Account

  @DetailsAccount
  Scenario Outline: Verificacion detalles de la Cuenta Exitoso

    Given el usuario ingresa usuario <usuario> y contraseña <contrasenia>
    When el usuario hace click en el boton login
    And el usuario ha iniciado sesion correctamente
    When el usuario hace click en detalles de la cuenta
    Then el usuario visualiza los detalles de su cuenta

    Examples:
      | usuario                     | contrasenia    |
      | patricio_paz_16@hotmail.com | Patricio3138!! |

  @LogOutAccount
  Scenario Outline: Verificacion cierre de sesion de la Cuenta exitoso

    Given el usuario ingresa usuario <usuario> y contraseña <contrasenia>
    When el usuario hace click en el boton login
    And el usuario ha iniciado sesion correctamente
    When el usuario clickea en cerrar sesion
    Then el usuario no debe estar logeado
    Examples:
      | usuario                     | contrasenia    |
      | patricio_paz_16@hotmail.com | Patricio3138!! |
