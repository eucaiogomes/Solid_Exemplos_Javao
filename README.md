# 📚 Projeto Demonstração SOLID em Java

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![SOLID](https://img.shields.io/badge/Princípios-SOLID-green)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

Projeto de exemplo demonstrando os 5 princípios SOLID com implementações práticas em Java.

## 🧩 Princípios Implementados

### 1. Single Responsibility Principle (SRP)
```java
// Cada classe tem apenas uma responsabilidade
public class PedidoService {
    public void processarPedido(Pedido pedido) {
        // Lógica exclusiva de processamento
    }
}

public class EmailService {
    public void enviarConfirmacao() {
        // Lógica exclusiva de e-mail
    }
}
