public class main {
    public static void main(String[] args) {

        Cliente Raphaella = new Cliente();
        Raphaella.setNome ("Raphaella");
        
        Cliente Cintia = new Cliente();
        Cintia.setNome("Cintia");

        Conta cc = new ContaCorrente(Raphaella);
        Conta poupanca = new ContaCorrente(Cintia);

        cc.depositar(160.0);
        cc.transferir(46.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

    
}
