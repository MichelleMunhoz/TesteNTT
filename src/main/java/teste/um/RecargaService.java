package teste.um;

public class RecargaService {

  public Cliente recarga(int saldo, int valorRecarga) {
    Telefone tel = new Telefone("37669123", 1000);
    Conta conta = new Conta(1000);
    Cliente cliente = new Cliente("Michelle", tel, conta);

    int saldoCliente = cliente.getConta().getSaldo();

   int debitoContaRecarga = saldoCliente - valorRecarga;

   Conta saldoContaAtualizado = new Conta(debitoContaRecarga);

    Cliente updateCliente = new Cliente(cliente.getNome(), cliente.getTelefone(), cliente.getConta());
    updateCliente.setConta(saldoContaAtualizado);
    System.out.println(updateCliente);
    return updateCliente ;
  }
}
