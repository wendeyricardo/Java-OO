package src.model;

import java.util.InputMismatchException;

public class ContaBancaria {

    //#region atributos
    private String agencia;

    private String conta;

    private Integer digito;

    private Double saldo;   

    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    //#endregion 

    //#region construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }
    //#endregion

    //#region getters e setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }
    //#endregion
    
    //#region metodos
    public void depositar(Double valor){

        // verifica se o valor de deposito é menor que o valor minimo
        //se for não pode aconcer deposito
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de deposito é R$"+ VALOR_MINIMO_DEPOSITO);
        }

        //efetua o deposito somando o valor ao saldo
        this.saldo += valor;
    }

    public Double sacar(Double valor){

        // verifica se o valor é maior que a o saldo da conta
        //se for manda mensagem de saldo insuficiente
        if(valor> this.saldo){
            throw new InputMismatchException("O salvo é insuficiente");
        }

        // aqui removemos o valor de saque do saldo atual
        this.saldo -= valor;

        //retorna o valor sacado ao usuario
        return valor;
    }
    //#endregion
}
