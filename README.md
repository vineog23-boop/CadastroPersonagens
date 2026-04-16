<h1 align="center">🥷 Ninja Missions API</h1>
<p align="center">
  API backend desenvolvida com Spring Boot para estudo de CRUD, relacionamentos entre entidades e migrations com Flyway
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring_Boot-3.4.3-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot 3.4.3"/>
  <img src="https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring" alt="Spring Data JPA"/>
  <img src="https://img.shields.io/badge/Spring_Web-228B22?style=for-the-badge" alt="Spring Web"/>
  <img src="https://img.shields.io/badge/H2-09476B?style=for-the-badge" alt="H2"/>
  <img src="https://img.shields.io/badge/Flyway-CC0200?style=for-the-badge&logo=flyway&logoColor=white" alt="Flyway"/>
  <img src="https://img.shields.io/badge/Lombok-8B0000?style=for-the-badge" alt="Lombok"/>
</p>

---

## 📌 Sobre o projeto

A **Ninja Missions API** é um projeto de estudo voltado à prática de desenvolvimento backend com Java e Spring Boot.

O projeto trabalha conceitos importantes para evolução em backend, com destaque para **CRUD**, **relacionamentos entre entidades**, **persistência com JPA** e **versionamento de banco com Flyway**.

---

## ✅ Funcionalidades estudadas

- Cadastro e listagem de ninjas
- Cadastro e listagem de missões
- Relacionamento entre ninjas e missões
- Estrutura de transferência de dados entre camadas
- Migrations com Flyway

---

## 🧱 Stack utilizada

- **Java 21**
- **Spring Boot 3.4.3**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database**
- **Flyway**
- **Lombok**

---

## 🏛️ Conceitos aplicados

- Arquitetura em camadas
- JPA e relacionamento entre entidades
- Organização voltada à manutenção e clareza
- Banco H2 para desenvolvimento local
- Migrations com Flyway

---

## ⚙️ Configuração local

O projeto está configurado para usar **H2** com parâmetros vindos de variáveis de ambiente.

### Exemplo no terminal Linux/macOS
```bash
export DATABASE_URL=jdbc:h2:mem:cadastro_ninjas
export DATABASE_USERNAME=admin
export DATABASE_PASSWORD=admin
```

### Exemplo no PowerShell
```powershell
$env:DATABASE_URL="jdbc:h2:mem:cadastro_ninjas"
$env:DATABASE_USERNAME="admin"
$env:DATABASE_PASSWORD="admin"
```

---

## ▶️ Como executar

```bash
git clone https://github.com/vineog23-boop/ninja-missions-api.git
cd ninja-missions-api
mvn clean install
mvn spring-boot:run
```

**Acesso local**
- Aplicação: http://localhost:8080
- Console H2: http://localhost:8080/h2-console

---

## 🚧 Status

Projeto de estudo em evolução, com foco em consolidar fundamentos de Spring Boot e persistência de dados.

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Oliveira Gonçalves** como parte dos estudos em Java backend.
