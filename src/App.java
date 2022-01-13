package src;

import src.model.ContaBancaria;
import src.model.ContaPoupanca;
import src.utils.DataUtil;
import src.model.ContaCorrente;

public class App {

    public static void main(String[] args) {
        System.out.println("criando nosso banco digital");
        System.out.println();

        ContaCorrente  conta = new ContaCorrente("0001","7542",5, 100.0);

        System.out.println("saldo atual de R$"+conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("saldo atual de R$"+conta.getSaldo());
        System.out.println();


        var saque = conta.sacar(150.0);
        System.out.println("saldo atual de R$"+ conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001","7543",6, 200.0);

        conta2.transferir(100.00, conta);
        System.out.println("Saldo conta destino de R$ "+ conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$"+conta.getSaldo());
        System.out.println();

        System.out.println(conta2.getDataAbertura());

        /**
         DataUtil util = new DataUtil();
        var f1 = util.ConverterDateParaDataEHora(conta2.getDataAbertura());
        var f2 = util.ConverterDateParaData(conta2.getDataAbertura());
        var f3 = util.ConverterDateParaHora(conta2.getDataAbertura());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        **/
        
        var f1 = DataUtil.ConverterDateParaDataEHora(conta2.getDataAbertura());
        var f2 = DataUtil.ConverterDateParaData(conta2.getDataAbertura());
        var f3 = DataUtil.ConverterDateParaHora(conta2.getDataAbertura());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        }
        
    }
    