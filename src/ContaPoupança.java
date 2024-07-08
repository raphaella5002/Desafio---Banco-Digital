public class ContaPoupança extends Conta {

    public ContaPoupança (Cliente cliente){
        super(cliente);
    }


    public void imprimirExtrato(){
        System.out.println("=== Imprimir Extrato Conta Poupança ===");
        imprimirInfosComuns();
  }


}
