package com.example.simuladorfin;

public class Sacre {
    //SACRE/SAC → a amortização é constante, mas a prestação vai diminuindo com o tempo.
    public static double calcParcela(double valor, double juros, int prazo, int numParcela){
        double amortizacao = valor / prazo;
        double saldoDevedor = valor - (numParcela - 1) * amortizacao;  //parcela é o numero da parcela
        double jurosParcela = saldoDevedor * juros/100;
        return amortizacao+jurosParcela;
    }
}
