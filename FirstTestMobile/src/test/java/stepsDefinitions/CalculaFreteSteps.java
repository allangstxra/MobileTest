package stepsDefinitions;

import core.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileBy;

public class CalculaFreteSteps extends DriverFactory {

    @Dado("que o usuario abre o aplicado preco e prazo")
    public void que_o_usuario_abre_o_aplicado_preco_e_prazo() {

    }

    @Dado("clica no botao novo calculo")
    public void clica_no_botao_novo_calculo() throws InterruptedException {
        Thread.sleep(5000);
        getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/textview_texto")).click();
    }

    @Dado("digitar o cep no campo cep de origem")
    public void digitar_o_cep_no_campo_cep_de_origem() {
       getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori")).sendKeys("11538050");
    }

    @Dado("digitar o cep no campo cep de destino")
    public void digitar_o_cep_no_campo_cep_de_destino() {
        getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/txt_cep_dest")).sendKeys("04615000");
    }

    @Quando("clicar no botao proximo passo")
    public void clicar_no_botao_proximo_passo() {
        getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/button_prox")).click();
    }

    @Entao("o app exibe a pagina de formato da embalagem")
    public void o_app_exibe_a_pagina_de_formato_da_embalagem() throws InterruptedException{
        Thread.sleep(5000);
        getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/imgCaixa"));
        getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/imgCarta"));
        getDRIVER().findElement(MobileBy.id("br.com.correios.calculaprecoprazo:id/imgCilindro"));
    }

}
