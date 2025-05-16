
package solid.dip;

public class PagamentoService {
    private final ProcessadorPagamento processor;
    
    public PagamentoService(ProcessadorPagamento processor) {
        this.processor = processor;
    }
    
    public void pagar(double valor) {
        processor.processar(valor);
    }
}
