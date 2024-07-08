public class main extends Cliente{
    public static void main(String[] args) {

        //lista cliente
        Cliente Raphaella = new Cliente();
        Raphaella.setNome ("Raphaella");
        
        Cliente Cintia = new Cliente();
        Cintia.setNome("Cintia");

        Cliente Fernando = new Cliente();
        Fernando.setNome("Fernando");

        Cliente Marcio = new Cliente();
        Marcio.setNome("Marcio");


        Conta cc = new ContaCorrente(Raphaella);
        Conta poupanca = new ContaCorrente(Marcio);

        cc.depositar(160.0);
        cc.transferir(46.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

    
}
