
package solid.isp;

public class SmartphoneAvancado implements TelefoneBasico, CameraAvancada {
    public void ligar() {
        System.out.println("Ligando com smartphone...");
    }
    public void tirarFoto() {
        System.out.println("Tirando foto com câmera avançada...");
    }
}
