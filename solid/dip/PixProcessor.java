
package solid.dip;

public class PixProcessor implements ProcessadorPagamento {
    public void processar(double valor) {
        System.out.println("Processando pagamento via PIX: R$" + valor);
    }
}
