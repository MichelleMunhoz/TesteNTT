package teste.um;

import org.junit.Test;
import teste.um.Cliente;
import teste.um.Conta;
import teste.um.RecargaService;
import teste.um.Telefone;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecargaTest {


  @Test
  public void recargaTest() {
    RecargaService service = new RecargaService();

    int valorRecarga = 300;
    Telefone tel = new Telefone("37669123",1000);
    Conta conta = new Conta(tel.getSaldo());
    Cliente cliente = new Cliente("Michelle",tel ,conta);

    Cliente result = service.recarga(cliente.getConta().getSaldo(), valorRecarga );

    assertEquals(700, result.getConta().getSaldo());
  }

  @Test
  public void recargaTestFail() {
    RecargaService service = new RecargaService();

    int valorRecarga = 300;
    Telefone tel = new Telefone("37669123",1000);
    Conta conta = new Conta(tel.getSaldo());
    Cliente cliente = new Cliente("Michelle",tel ,conta);

    Cliente result = service.recarga(cliente.getConta().getSaldo(), valorRecarga );
    isFalse(conta.getSaldo(), result);

    assertEquals(700, result.getConta().getSaldo());
    assertFalse(isFalse(conta.getSaldo(),result));
  }

  private static boolean isFalse(int saldo, Cliente result) {
    if(!result.equals(saldo)){
      return false;
    }
    return true;
  }

}
