package src.model;

import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {

    //#region atributos
    private String agencia;

    private String conta;

    private Integer digito;

    private Double saldo;  
    
    private Date dataAbertura;

    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    //#endregion 

    //#region construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
    }
    //#endregion

    //#region getters e setters
    public Date getDataAbertura() {
        return dataAbertura;
    }
    
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

    //#region
    public void transferir(Double valor, ContaBancaria contaDestino){

        //efetua um saque na conta atual
        this.sacar(valor);
        
        //efetua o deposito na conta de destino
        contaDestino.depositar(valor);
    }
    //#endregion
}
