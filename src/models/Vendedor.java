package models;

import models.Funcionario;

public class Vendedor extends Funcionario {
    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularBonificacao() {
        return super.calcularBonificacao() + 500;
    }

    public double calculoComissao(double valorVendido){
        this.comissao = (valorVendido + 10)/100;
        return super.getSalario() + this.comissao;
    }
}
