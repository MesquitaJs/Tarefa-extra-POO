package app;
import br.com.banco.*;

public class App {
	public static void main(String[] args) {
		
        Cliente cliente1 = new Cliente("Julio", "Mesquita", "123.456.789-10");

        ContaCorrente contaCorrente = new ContaCorrente(cliente1, 1357, "UFF", "30/04/2019");
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente1, 2468, "UFF", "30/04/2019");
        SeguroDeVida SegurodeVida = new SeguroDeVida(cliente1, 1010, 2000);
        
        contaCorrente.depositar(2000);
        contaPoupanca.depositar(2000);
        
        //parte 1
        
        Tributavel tributoContaCorrente = contaCorrente;
        Tributavel tributoSegurodeVida = SegurodeVida;
        
        System.out.println(tributoContaCorrente.getTitular());
        System.out.println(tributoContaCorrente.getTipo()+" - "+"Valor do imposto: "+tributoContaCorrente.getValorImposto());
        System.out.println("");
        System.out.println(tributoSegurodeVida.getTitular());
        System.out.println(tributoSegurodeVida.getTipo()+" - "+"Valor do imposto: "+tributoSegurodeVida.getValorImposto());
        System.out.println("");
        
        //parte 2
        
        System.out.println(cliente1.toString());
        cliente1.ativos(contaCorrente, contaPoupanca, SegurodeVida);

       // System.out.println("Saldo futuro para conta corrente: " + contaCorrente.calcularSaldoFuturo(5));
       //System.out.println("Saldo futuro para conta poupanca: " + contaPoupanca.calcularSaldoFuturo(5));

	}

}
