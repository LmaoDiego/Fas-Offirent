

Feature: Como usuario quiero buscar oficinas por departamentos
  Scenario:  S1
  Usuario busca oficinas por distritos segun departamentos exitosamente
    Given el usuario esta buscando distritos por departamentos
    And quiera buscar el distrito si pertenece en el departamento
    When se confirme la intencion de busqueda por distritos
    Then el sistema retornara un mensaje de error "dicho distrito no pertenece a el departamento seleccionado"

  Scenario:  S2
  Usuario busca oficinas por distritos que no pertenecen a el departamento seleccionado
    Given el usuario esta buscando distritos por departamentos
    And quiera buscar el distrito que no pertezca al departamento selecionado
    When se confirme la intencion de busqueda por distritos
    Then el sistema retornara la lista de distritos por departamento seleccionado
