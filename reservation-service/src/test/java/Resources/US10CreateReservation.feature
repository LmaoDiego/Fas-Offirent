Feature: Como usuario necesito realizar una reserva de una oficinna en la aplicacion
         para que esta se encuentre a mi disposicion por un plazo de tiempo
  Scenario:  S1
  Usuario realiza intencion de reserva exitosamente
    Given Usuario esta interesado en la oficina y desea realizar una reserva
    When el usuario envie la intencion de confirmacion de reserva de oficina
    Then el sistema guardara la intencion de confirmacion de reserva para ser posteriormente aceptada

  Scenario:  S2
  Usuario realiza intencion de reserva de una publicacion de oficina que ha concluido
    Given el usuario desea realizar una reserva
    And y quiere grabar la intencion de confirmacion de reserva de una oficina
    And la publicacion ya ha concluido
    When se envie la intencion de confirmacion de reservas de oficina
    Then el sistema retornara un mensaje de error diciendo que esta oficina ya no se encuentra disponible

  Scenario:  S3
  Usuario intenta realizar una intencion de reserva sobre su propia oficina
    Given el usuario desea realizar una reserva
    And quiere grabar la intencion de confirmacion de reserva de una oficina
    And la publicacion/oficina pertenece a el
    When se envie la intencion de confirmacion de reservas de oficina
    Then el sistema retornara un mensaje de error dicinedo qe no puede alquilar su propia oficina