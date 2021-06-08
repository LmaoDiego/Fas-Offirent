

Feature: Como usuario proovedor necesito crear una publicacion   para que las personas interesadas en alguiler
         puedan visualizarla y contactar conmigo
  Scenario:  S1
    Usuario proveedor intenta realizar una publicacion sin tener oficinas registradas
    Given el usuario se encuentra creando una publicacion
    And el usuario no tiene oficinas creadas
    When se envie la intencion de crear publicacion
    Then el sistema retornara un mensaje diciendo que necesitas tener al menos una oficina para poder realizar la publicacion

  Scenario: S2
    Creacion de publicacion con duracion mayor a un mes de un usuario no premium
    Given el usuario se encuentra creando una publicacion
    And se especifica una duracion de la publicacion mayor a un mes
    When se confirme la intencion de crear la publicacion
    Then el sistema retornara un mensaje diciendo que los usuarios no premium no pueden crear publicaciones con duracion mayor a un mes

  Scenario: S3
    Creacion de publicacion con duracion mayor a un mes de un usuario premium
    Given el usuario se encuentra creando una publicacion
    And se especifica una duracion de la publicacion mayor a un mes
    When se confirme la intencion de crear la publicacion
    Then el sistemas creara la publicacion exitosamente