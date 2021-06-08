Feature: Como usuario necesita poder adquirir una suscripcion premium para obtener mejores beneficios
  Scenario:  S1
  Usuario no premium se convierte a usuario premium por primera vez
    Given el usuario no es premium
    And el usuario ha realizado el pago y coordinado con un administrador
    When el administrador envie la actualizacion de estado de cuenta a premium para dicho usuario
    Then el sistema retornara registrada suscripcion premium para el usuario

  Scenario:  S2
  Pago de cuenta premitum exitoso
    Given el usuario desea pagar una suscripcion premium
    And los datos de su tarjeta sean validos
    When se confirme la intencion de adquirir suscripcion premium
    Then el sistema retornara un mensaje de "el pago ha sido exitoso"
