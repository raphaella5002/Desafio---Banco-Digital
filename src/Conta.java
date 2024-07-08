public abstract class Conta implements IConta {

private static int SEQUENCIAL = 1;

protected static final int AGENCIA_PADRAO = 1;

    //atributos 

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //getters

    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    //implementações

    public void sacar (Double valor){
        saldo -= valor;
    }
    public void depositar (Double valor){
        saldo += valor;
    }
    public void transferir(Double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Títular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }


    


}
