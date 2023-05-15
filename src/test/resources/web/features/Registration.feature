@Registration
  Feature: Registration
    @RegistroExitoso
    Scenario: Registro Exitoso
      Given el usuario ingresa a la URL
      When el usuario hace click en el boton My Account
      And el usuario ingresa mail y contraseña de registro
      And el usuario hace click en el boton register
      Then el usuario se registra correctamente