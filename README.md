![banner](https://github.com/lasuccubuss/renascimento-da-torre/blob/master/assets/img.png?raw=true)
```markdown
# 🌌 Renascimento da Torre

![Java](https://img.shields.io/badge/Java-17-red)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-green)
![Projeto Pessoal](https://img.shields.io/badge/feito%20com-alma%20e%20dor-8a2be2)
![Status](https://img.shields.io/badge/status-em%20constru%C3%A7%C3%A3o-purple)

<img src="https://github.com/lasuccubuss/renascimento-da-torre/raw/main/src/main/resources/static/banner.jpg" alt="Renascimento da Torre Banner" style="width: 100%; border-radius: 10px;" />

Um projeto pessoal com alma, código e intuição.

Este é um sistema simples e simbólico para registrar e consultar tiragens de tarot — desenvolvido com Java + Spring Boot no back-end e uma interface HTML prática no front-end. Tudo feito com propósito, sensibilidade e um toque de renascimento.

---

## 🔮 Funcionalidades

- Criar novas tiragens com:
  - Título
  - Data
  - Pergunta
  - Cartas tiradas
  - Categoria (ex: Amor, Trabalho...)
  - Reflexão pessoal
- Listar todas as tiragens
- Editar a reflexão de uma tiragem
- Deletar tiragens
- Buscar tiragens por:
  - Carta
  - Palavra-chave na reflexão
  - Categoria
- Interface web integrada via HTML puro
- Banco de dados H2 (volátil/local)

---

## 💻 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Maven
- H2 Database (modo file)
- HTML5 + JavaScript básico

---

## 📁 Como rodar

1. Clone o projeto:
```bash
git clone https://github.com/lasuccubuss/renascimento-da-torre.git
cd renascimento-da-torre
```

2. Rode o projeto com Maven:
```bash
mvn spring-boot:run
```

3. Acesse a interface:
```
http://localhost:8080
```

---

## ✨ Interface HTML

O projeto conta com um `index.html` que permite:
- Criar novas tiragens
- Filtrar por carta, categoria ou palavra
- Editar reflexões diretamente pela interface
- Ocultar e mostrar tiragens com um clique

A vibe é dark, introspectiva e funcional — porque código também é alma 💜

### 🎬 Interface em ação

<img src="https://github.com/lasuccubuss/renascimento-da-torre/raw/main/src/main/resources/static/demo.gif" alt="Demonstração da interface Renascimento da Torre" style="border-radius: 10px;" />

---

## 📦 Estrutura do Projeto

```bash
renascimento-da-torre
├── src/main/java/com/exemplo/torre
│   ├── controller/TiragemController.java
│   ├── model/Tiragem.java
│   ├── repository/TiragemRepository.java
│   ├── service/TiragemService.java
│   └── RenascimentoDaTorreApplication.java
├── src/main/resources
│   ├── application.properties
│   └── static/index.html
└── pom.xml
```

---

## 🖤 Sobre a autora

Esse projeto foi criado por **Susana Garcia** — desenvolvedora em processo de reconstrução, que transforma dor em código, e intuição em lógica. 💻✨

> "Quando tudo desmoronou, eu renasci linha por linha."

GitHub: [@lasuccubuss](https://github.com/lasuccubuss)
LinkedIn: [linkedin.com/in/susana-garcia-593781326](https://linkedin.com/in/susana-garcia-593781326)

---

## 🗼 Licença

Este projeto é pessoal, mas se conectar contigo — sinta-se livre para estudar, usar ou adaptar com sensibilidade.
```

