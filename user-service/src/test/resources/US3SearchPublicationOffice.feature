Feature: Como usuario necesito buscar una publicacion de oficina en la aplicacion para poder ver
         su detalle y decidir si deseo alquilarla o no
  Scenario:  S1
  Usuario busca una oficina por un rango de precio
    Given el usuario se encuentra buscando una publicacion de oficina
    And el usuario especifica un rango de precio deseado
    When el usuario envie la intencion de busqueda
    Then el sistema retornara un listado de oficinas con precio dentro del rango puesto