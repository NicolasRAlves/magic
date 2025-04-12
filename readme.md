# ✨ Magic — Jogo de Poções Mágicas em Java

Um projeto desenvolvido com foco em reforçar os pilares da Programação Orientada a Objetos, aplicando conceitos como **herança, abstração, composição e polimorfismo** de forma prática e divertida.

Aqui, você assume o papel de um aprendiz de mago 🧙‍♂️ que precisa combinar ingredientes para criar poções com efeitos variados — algumas incríveis, outras... nem tanto.

![Tela do Sistema](docs/screen.jpeg)

---

## 🔧 Sobre o Projeto

Esse repositório contém minha implementação pessoal de um desafio proposto em sala de aula.  
A proposta era clara: sair da teoria e aplicar POO de verdade em um sistema com lógica de negócio, usando interfaces, enums e modelagem orientada a objetos.

Trabalhei a estrutura, comportamento e integração entre as classes `Pocao`, `Ingrediente` e suas variações específicas, além de organizar a lógica de avaliação do resultado final com base nos efeitos acumulados.

---

## 🚀 Funcionalidades

- Mistura dinâmica de ingredientes com diferentes efeitos
- Avaliação final da poção com base em regras de negócio
- Interface visual com interação via drag & drop
- Separação clara entre `model`, `controller` e `service`

---

## 🧩 Estrutura de Lógica

- `Ingrediente` — classe abstrata base
- `Misturavel` — interface que define o comportamento de mistura
- `Pocao` — classe que representa o estado da poção
- Ingredientes específicos como `Mandagora`, `FlorDoSono`, `RaizApodrecida`, `OrvalhoEncantado` e `RaizApodrecida`.

Cada classe segue uma responsabilidade única e colabora com o restante do sistema por meio de composição e interface.

---

## 💻 Como executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/NicolasRAlves/magic.git
   ```

2. Abra no IntelliJ ou outro IDE com suporte a Spring Boot

3. Rode a aplicação no App.java

4. Acesse no navegador: http://localhost:8080

---

## 🙏 Agradecimento

Este projeto foi desenvolvido como parte de um desafio proposto em sala de aula pelo professor **João Carlos Lima** ([joaocarloslima](https://github.com/joaocarloslima)).  
A proposta foi criativa e permitiu explorar conceitos importantes de Java de maneira prática e envolvente.  
Agradeço pela oportunidade de aplicar o que foi ensinado de forma concreta e desafiadora.

---
