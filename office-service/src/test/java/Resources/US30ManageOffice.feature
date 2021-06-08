Feature: Como usuario proveedor necesito editar los datos de una oficiona para que la informacion
         en las publicaciones se encuentre actualizada
  Scenario:  S1
  Usuario intenta editar una oficina mientras esta en alquiler
    Given el usuario se desea actualizar los datos de una oficina y especifica nuevos datos para esta
    And la oficina se encuentra alquilada
    When se confirme la intencion de editar oficina
    Then el sistema retornara un mensaje diciendo que la informacion de la oficina no se puede ser modificada porque esta siendo alquilada

  Scenario:  S2
  Usuario edita los datos de una oficiona exitosamente
    Given el usuario se desea actualizar los datos de una oficina y especifica nuevos datos para esta
    And la oficina no se encuentra alquilada
    When se confirme la intencion de editar oficina
    Then el sistema guardara los cambios realizados sobre la oficina

