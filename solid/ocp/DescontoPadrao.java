
package solid.ocp;

public class DescontoPadrao implements Desconto {
    public void aplicar(double valor) {
        System.out.println("Desconto padrão: " + (valor * 0.1));
    }
}
