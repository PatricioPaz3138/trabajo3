@Registration
Feature: Registration

  Background:
    Given el usuario ingresa a la URL
    When el usuario hace click en el boton My Account

  @RegistroExitoso
  Scenario Outline: Registro Exitoso

    Given el usuario ingresa mail <mail> y contraseña <contrasenia>
    When el usuario hace click en el boton register
    Then el usuario se registra correctamente
    Examples:
      | mail                      | contrasenia   |
      | pepito232@Crowdar2023.com | Pepito12345!! |

  @RegistroFallido
  Scenario Outline: Registro Fallido

    Given el usuario ingresa mail <mail> y contraseña <contrasenia>
    When el usuario hace click en el boton register
    Then el usuario visualiza un mensaje <mensaje> de error
    Examples:
      | mail            | contrasenia    | mensaje         |
      | Patricio1234@pe | PATRICIoo12345 | provide a valid |
      |                 | PATRICIoo12345 | provide a valid |
      |                 |                | provide a valid |


