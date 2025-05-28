#encoding: utf-8
@001_Google
Feature: 001_Google


  @Google_RealizaPesquisa
  Scenario Outline: Validar pesquisa google
    Given acesso a pagina do google
    When realizo uma pesquisa <dado_pesquisa>
    Then valido o resultado da pesquisa

    Examples: 
      | dado_pesquisa  | 
      | "automação com selenium" |
      

