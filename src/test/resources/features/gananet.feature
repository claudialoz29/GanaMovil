Feature: Acceso a la pagina web GanaNet


  Background: Navegar a la pagina
    Given Abro el url
    Then Hago click en Banca por Internet


    Scenario: Verifico el usuario y verifico el mensaje
      When Cuando seleciono el tipo de usuario Alias
      Then Ingreso el usuario "ALIAS"
      Then Hago click en verificar
      And Obtengo mensaje restrictivo del usuario


    Scenario Outline: Cuando selecciono Alias y Codigo de persona deberia ser de forma dinamica.
      When Cuando selecciono "<usuarios>" and "<value>"
      Then Hago click en verificar
      And Obtengo mensaje restrictivo
      Examples:
      |usuarios|           |value|
      |Alias |              |ALIAS|
      |Código de persona | |CODIGOPERSONA|





