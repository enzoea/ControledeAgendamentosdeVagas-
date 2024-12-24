# Teste Prático - Desenvolvedor Java

## Descrição do Projeto
Este é um sistema desenvolvido em Java com o objetivo de criar um ambiente para gerenciar agendamentos, solicitantes e vagas. Utilizamos as melhores práticas de desenvolvimento, incluindo o padrão de arquitetura em camadas, que promove uma clara separação de responsabilidades entre os componentes do sistema.

O projeto foi estruturado para ser simples de entender e extensível, com suporte a interfaces web para gerenciar os dados. No entanto, devido ao prazo limitado, algumas funcionalidades permanecem incompletas ou apresentam erros que precisam ser resolvidos.

---

## Estrutura do Projeto
A seguir, explicamos a estrutura das pastas e arquivos do projeto:

### Diretório `src/main/java`
- **`com.teste.pratico.beans`**
  - Contém os "Managed Beans", que fazem a integração entre a camada de apresentação (JSF) e as camadas de serviço e modelo. Exemplo:
    - `AgendamentoBean.java`: Gerencia as operações de agendamentos.
    - `SolicitanteBean.java`: Gerencia os solicitantes.
    - `VagaBean.java`: Gerencia as vagas.

- **`com.teste.pratico.controller`**
  - Contém os controladores REST. Esses arquivos são responsáveis por expor APIs para interagir com o backend. Exemplo:
    - `AgendamentoController.java`
    - `SolicitanteController.java`
    - `VagaController.java`

- **`com.teste.pratico.dto`**
  - Contém os objetos de transferência de dados (DTO), usados para transportar dados entre diferentes camadas do sistema.

- **`com.teste.pratico.model`**
  - Define as entidades que representam as tabelas do banco de dados. Exemplo:
    - `Agendamento.java`
    - `Solicitante.java`
    - `Vaga.java`

- **`com.teste.pratico.repository`**
  - Repositórios que fazem a interação direta com o banco de dados, utilizando Spring Data JPA.

- **`com.teste.pratico.service`**
  - Camada de serviço que contém as regras de negócio e gerencia a lógica do sistema.

- **`com.teste.pratico.config`**
  - Arquivos de configuração, como o `WebConfig.java`, que configura o suporte a JSF e outras dependências do projeto.

---

### Diretório `src/main/resources`
- **`META-INF/resources`**
  - Contém as páginas JSF usadas como interface para interagir com o sistema.
    - `index.xhtml`: Página inicial.
    - `cadastro-agendamentos.xhtml`: Cadastro de agendamentos.
    - `consulta-agendamentos.xhtml`: Consulta de agendamentos.
    - `cadastro-solicitantes.xhtml`: Cadastro de solicitantes.
    - `cadastro-vagas.xhtml`: Cadastro de vagas.

- **`application.properties`**
  - Contém configurações do sistema, como a URL do banco de dados e outras configurações do Spring Boot.

- **`database/`**
  - Contém o banco de dados H2 utilizado pelo sistema.

---

## Funcionalidades
1. **Gerenciamento de Agendamentos:**
   - Cadastro e consulta de agendamentos com informações detalhadas.

2. **Gerenciamento de Solicitantes:**
   - Cadastro de novos solicitantes e gerenciamento de dados.

3. **Gerenciamento de Vagas:**
   - Cadastro e consulta de vagas disponíveis.

4. **Arquitetura em camadas:**
   - Organização clara do projeto para facilitar a manutenção e expansão.

---

## Como Executar o Projeto

### Requisitos
- **Java:** Versão 17 ou superior.
- **Maven:** Versão 3.6 ou superior.
- **IDE:** IntelliJ IDEA, Eclipse ou qualquer outra IDE compatível com projetos Maven.

### Passo a Passo
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd nome-do-repositorio
   ```

3. Compile e instale as dependências:
   ```bash
   mvn clean install
   ```

4. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

5. Abra o navegador e acesse a URL:
   ```
   http://localhost:9292
   ```

---

## Problemas Conhecidos e Próximos Passos

### Problemas
1. **Erros de Resolução de Beans:** Alguns beans não estão sendo corretamente injetados.
2. **Erros no Banco de Dados:** Algumas operações não persistem os dados no banco.
3. **Inconsistência nas Interfaces:** Algumas páginas JSF apresentam erros de resolução de expressões.

### Próximos Passos
1. **Corrigir a Injeção de Beans:** Verificar as anotações `@ManagedBean` e `@SessionScoped` para garantir que os beans sejam detectados corretamente.
2. **Ajustar Configurações do Banco:** Revisar a configuração do `application.properties` para garantir a conexão com o banco de dados H2.
3. **Melhorar a Interface:** Resolver erros de expressões EL (Expression Language) e garantir que todos os formulários JSF funcionem corretamente.
4. **Documentar o Código:** Adicionar mais comentários ao código para facilitar a compreensão.
5. **Escrever Testes:** Criar testes unitários para as classes de serviço e controladores.

---

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

---

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).

