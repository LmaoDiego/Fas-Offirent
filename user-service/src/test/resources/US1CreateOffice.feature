
  Feature: Como usuario provedor necesito crear una oficina para realizar publicaciones de esta misma
    Scenario:  S1
      Usuario no premium intenta crear mas de una oficina
      Given Usuario esta creando una oficina
      And el usuario no es premium
      When se confirme la intencion de crear oficiona
      Then el sistema retornara un mensaje de error si cuenta con una oficina

    Scenario:  S2
      Creacion de oficina sin descripcion
      Given Usuario esta creando una oficina
      And no escribe una descripcion de al menos de 200 caracteres
      When se confirme la intencion de crear oficiona
      Then el sistema retornara un mensaje de error diciendo que debe poner en la descripcion un minimo de 200 caracteres

    Scenario:  S3
      Creacion exitosa de oficina
      Given Usuario esta creando una oficina
      And detalla los datos pedidos en el formulario correctamente
      When se confirme la intencion de crear oficiona
      Then el sistema creara correctamente la oficina y mostrara un mensaje de "oficina creada"