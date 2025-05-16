
package solid;

import solid.srp.*;
import solid.ocp.*;
import solid.lsp.*;
import solid.isp.*;
import solid.dip.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Exemplos SOLID:");
        
        // SRP
        new PedidoService().processarPedido(new Pedido());
        new EmailService().enviarConfirmacao();
        
        // OCP
        new DescontoPadrao().aplicar(100);
        new DescontoBlackFriday().aplicar(100);
        
        // LSP
        Ave pato = new Pato();
        pato.voar(); // OK
        
        // ISP
        new TelefoneBasicoImpl().ligar();
        new SmartphoneAvancado().tirarFoto();
        
        // DIP
        new PagamentoService(new PixProcessor()).pagar(50);
    }
}
