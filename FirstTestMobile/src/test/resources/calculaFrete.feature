#language: pt

  Funcionalidade: Calcula Frete

    Eu como usuário do app dos correios
    Desejo saber o frete
    Para poder ter ciencia sobre o valor

      Cenario: Validar exibicao da pagina de formato
      Dado que o usuario abre o aplicado preco e prazo
      E clica no botao novo calculo
      E digitar o cep no campo cep de origem
      E digitar o cep no campo cep de destino
      Quando clicar no botao proximo passo
      Entao o app exibe a pagina de formato da embalagem