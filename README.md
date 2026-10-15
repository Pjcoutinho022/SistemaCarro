# 🚗 Simulador de Carro em Java (CLI)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)
![Bootcamp](https://img.shields.io/badge/Bootcamp-Ita%C3%BA%20Unibanco-orange?style=for-the-badge)

Projeto desenvolvido durante o módulo de **Fundamentos de Programação em Java** do **Bootcamp Itaú Unibanco - Java com Inteligência Artificial**. Trata-se de uma aplicação de console interativa que simula o funcionamento realista de um carro manual, aplicando regras lógicas de direção, controle de marcha e velocidade.

---

## 📌 Sobre o Projeto

O objetivo deste projeto foi criar um sistema capaz de simular as ações do condutor de um automóvel, garantindo a consistência das operações por meio de validações em tempo real. O condutor interage via terminal através de um menu de opções, onde cada ação afeta o estado interno do veículo.

### ⚙️ Funcionalidades e Regras de Negócio

- **Ligar o Veículo:** Só é permitido ligar o carro se ele estiver desligado e com o câmbio em ponto morto (**Neutro / Marcha 0**).
- **Desligar o Veículo:** O carro só pode ser desligado se estiver totalmente parado (**0 km/h**) e em **Neutro**.
- **Acelerar e Desacelerar:**
  - O carro acelera e desacelera de 2 em 2 km/h.
  - Velocidade máxima limitada a **120 km/h**.
  - **Relação Marcha x Velocidade:** Não é possível acelerar além do limite da marcha atual, nem reduzir abaixo do range sem antes reduzir a marcha correspondente:
    - **1ª Marcha:** 0 a 20 km/h
    - **2ª Marcha:** 20 a 40 km/h
    - **3ª Marcha:** 40 a 60 km/h
    - **4ª Marcha:** 60 a 80 km/h
    - **5ª Marcha:** 80 a 100 km/h
    - **6ª Marcha:** 100 a 120 km/h
- **Câmbio Sequencial de Marchas:**
  - Não é permitido pular marchas (as trocas devem ser estritamente de 1 em 1).
  - A troca só é aceita se a velocidade atual do carro for compatível com a nova marcha selecionada.
- **Manobras (Curvas):**
  - O carro só pode virar à esquerda ou à direita se estiver em movimento (**> 0 km/h**) e em velocidade segura (**até 40 km/h**).
- **Painel e Velocímetro:** Consulta a qualquer momento da velocidade atual no console.
- **Segurança ao Sair:** O sistema só permite encerrar o programa se o carro estiver devidamente desligado.

---

## 🧠 O que Aprendi

Durante o desenvolvimento deste projeto, pratiquei e consolidei os seguintes conceitos:

1. **Lógica de Programação e Estruturas de Decisão:**
   - Construção de fluxos condicionais complexos com `if / else` e `switch-case` encadeados.
   - Aplicação de operadores lógicos (`&&`, `||`) para validar múltiplas condições simultâneas (ex.: verificar se o carro está parado E em neutro antes de desligar).
   - Uso de laços de repetição (`while`) para manter o ciclo de execução contínuo até que a condição de saída seja satisfeita.

2. **Programação Orientada a Objetos (POO):**
   - **Separação de Responsabilidades:** Divisão do código em classes com papéis bem definidos (`MenuCarro` para interface, `FuncaoCarro` para o comportamento/modelo do carro e `Main` para a orquestração do fluxo).
   - **Encapsulamento:** Proteção do estado interno da velocidade através do modificador de acesso `private` e métodos de leitura (`getVelocidade()`).
   - **Criação e Invocação de Métodos:** Passagem de parâmetros e retorno de valores para atualização de estados.

3. **Interação com Usuário e Entrada de Dados:**
   - Leitura de dados via console com `java.util.Scanner`.
   - Comparação e tratamento de textos com `equalsIgnoreCase`.

4. **Modelagem de Regras do Mundo Real no Código:**
   - Transformação de restrições do mundo real (troca de marchas, limites de velocidade por marcha, segurança em curvas) em regras algorítmicas robustas.

---

## 📂 Estrutura de Arquivos

```text
SistemaCarro/
├── Projeto/
│   ├── src/
│   │   ├── Main.java         # Ponto de entrada, loop principal e validações de fluxo
│   │   ├── FuncaoCarro.java  # Lógica de funcionamento, velocidade e manobras do carro
│   │   └── MenuCarro.java    # Menus de opções exibidos no console
│   └── Projeto.iml
└── README.md
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Java JDK** (versão 17 ou superior recomendada) instalado na máquina.
- Terminal / Prompt de Comando ou uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code).

### Executando pelo Terminal

1. Clone o repositório ou baixe os arquivos:
   ```bash
   git clone <URL_DO_SEU_REPOSITORIO>
   ```

2. Acesse a pasta do código-fonte:
   ```bash
   cd SistemaCarro/Projeto/src
   ```

3. Compile as classes Java:
   ```bash
   javac *.java
   ```

4. Execute o programa:
   ```bash
   java Main
   ```

---

## 👨‍💻 Autor

Desenvolvido como parte do aprendizado prático no **Bootcamp Itaú Unibanco - Java com Inteligência Artificial**.
