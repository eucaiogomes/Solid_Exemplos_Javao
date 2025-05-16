# 🧱 Projeto SOLID em Java - Exemplos Práticos

![Java](https://img.shields.io/badge/Java-17+-blue?logo=java)
![SOLID](https://img.shields.io/badge/SOLID-Principles-green)
![Maven](https://img.shields.io/badge/Maven-3.6+-orange?logo=apache-maven)

Demonstração prática dos 5 princípios SOLID com implementações em Java puro.

## 📋 Índice
- [Princípios Implementados](#-princípios-implementados)
- [Como Executar](#-como-executar)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Exemplos de Código](#-exemplos-de-código)
- [Contribuição](#-contribuição)
- [Licença](#-licença)

## 🧩 Princípios Implementados

| Princípio               | Descrição                                                                 |
|-------------------------|--------------------------------------------------------------------------|
| **Single Responsibility** | Cada classe com uma única responsabilidade                                |
| **Open/Closed**          | Aberto para extensão, fechado para modificação                           |
| **Liskov Substitution**  | Classes derivadas substituíveis por suas classes base                    |
| **Interface Segregation**| Múltiplas interfaces específicas ao invés de uma geral                   |
| **Dependency Inversion** | Depender de abstrações, não de implementações                           |

## 🚀 Como Executar

### Pré-requisitos
- JDK 17+
- Maven 3.6+

### Passo a passo
```bash
# 1. Clone o projeto
git clone https://github.com/seu-usuario/solid-java-example.git

# 2. Navegue até o diretório
cd solid-java-example

# 3. Compile e execute
mvn clean install
mvn exec:java -Dexec.mainClass="solid.Main"
