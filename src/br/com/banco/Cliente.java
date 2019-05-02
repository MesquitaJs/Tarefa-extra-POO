package br.com.banco;

public class Cliente implements Ativos {
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;

    public Cliente(String primeiroNome, String ultimoNome, String cpf) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
    }

    public String toString() {
        return "Cliente: "  +this.primeiroNome+ " " +this.ultimoNome+ " - CPF: " +this.cpf;
    }

    public void ativos(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, SeguroDeVida seguroVida) {
        Object [] currentAtivos = new Object[3];
        currentAtivos[0]=contaCorrente;
        currentAtivos[1]=contaPoupanca;
        currentAtivos[2]=seguroVida;
        for (int i = 0; i < 3; i++) {
            if(currentAtivos[i] instanceof Tributavel){
                System.out.println(((Tributavel) currentAtivos[i]).getTipo() + " - Imposto devido: " + ((Tributavel) currentAtivos[i]).getValorImposto());
            } else {
                System.out.println(((Conta) currentAtivos[i]).getTipo() + ": Ativo não é tributável.");
            }
        }
        return;
    }

}
