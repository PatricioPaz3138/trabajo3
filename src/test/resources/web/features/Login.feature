@Login
Feature: Login

  Background:
    Given el usuario ingresa a la URL
    And el usuario hace click en el boton My Account

  @LoginExitoso
  Scenario: Inicio de sesion Exitoso

    Given el usuario ingresa usuario y contraseña validos
    When el usuario hace click en el boton login
    Then el usuario inicia sesion correctamente

  @LoginFallido
  Scenario Outline: Inicio de sesion Fallido

    Given el usuario ingresa <ingreso> usuario <usuario> y contraseña <contrasenia> invalidos
    And el usuario hace click en el boton login
    Then el usuario visualiza un mensaje <mensaje> de error
    Examples:
      | ingreso                             | usuario                     | contrasenia    | mensaje               |
      | contraseña Y Usuario Incorrecto     | Patricio3233                | 12345          | not registered        |
      | usuario Correcto Y Contraseña Vacia | patricio_paz_16@hotmail.com |                | Password is required. |
      | usuarioVacio Y Contraseña Correcta  |                             | Patricio3138!! | Username is required. |
      | contraseña Y UsuarioVacios          |                             |                | Username is required. |





