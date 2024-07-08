public interface IConta {
    
//Em uma interface não é necessário colocar public no método

     void sacar(Double valor);

     void depositar (Double valor);
    
     void transferir(Double valor, Conta contaDestino);

     void imprimirExtrato ();
     
}

