Feature: Automatizar la funcionalidad de GanaMovil

  Background: Navegar a la pagina
    Given Abro el url


    @US-01
    Scenario: Verificar las funcionalidades de GanaMovil
      When Verifico que ingrese al portal "https://www.bg.com.bo/personas/"
      Then Ingreso al menu "GanaMóvil"
      Then Obtengo un listado de las funcionalidades de GanaMovil

      @US-02
      Scenario: Veriricar el listado de forma deinamica en la funcionalidad GanaMovil
        Then Ingreso al menu "GanaMóvil"
        When Obtengo un listado de las funcionalidades de forma dinamica
        |Intructivo de uso GanaMóvil|
        |Habilitación de GanaMóvil  |
        |Apertura de Cuenta|
        |Apertura de segunda Cuenta |
       |Modificación monto Transaccional|
        |Pagos QR                        |
        |Cobros QR                       |
        |Cobro de giros                  |
        |Envío de giros                  |
        |Activación de seguro para Tarjeta|
        |Renovación de Tarjeta de Débito  |
        |Solicitud de Tarjeta de Débito   |
        |Pago de Servicios                |

        @US-03
        Scenario: Obtengo listado donde se encuentra la funcionalidad Apertura de cuenta y su descriptcion
          Then




















