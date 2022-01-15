package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
        
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("**********************************");        
        System.out.println("******** EXTRATO POUPANÇA ********");        
        System.out.println("**********************************");
        System.out.println();

        System.out.println("gerado em: "+DataUtil.ConverterDateParaDataEHora(new Date()));
        System.out.println();

        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao);            
        }
        
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("**********************************");

        
    }
    
}
