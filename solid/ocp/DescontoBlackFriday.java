
package solid.ocp;

public class DescontoBlackFriday implements Desconto {
    public void aplicar(double valor) {
        System.out.println("Aplicando desconto Black Friday: " + (valor * 0.3));
    }
}
