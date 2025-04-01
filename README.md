# Sistema de Controle Financeiro - Java POO

## Índice
1. [Visão Geral](#visão-geral)
2. [Estrutura de Pacotes](#estrutura-de-pacotes)
3. [Componentes Principais](#componentes-principais)
4. [Diagramas](#diagramas)
5. [Fluxos do Sistema](#fluxos-do-sistema)
6. [Próximas Etapas](#próximas-etapas)

---

## Visão Geral
Sistema desenvolvido em Java para gerenciamento financeiro pessoal com:

✅ **Programação Orientada a Objetos**  
✅ **Arquitetura em Camadas**  


---

## Estrutura de Pacotes

### Pacote Principal
`br.com.controlefinanceiro`  
- Classe de inicialização do sistema

### Modelo de Domínio
`br.com.controlefinanceiro.modelo`  
- Classes que representam as entidades do negócio

### Camada de Serviço
`br.com.controlefinanceiro.servico`  
- Implementação das regras de negócio

### Persistência de Dados
`br.com.controlefinanceiro.repositorio`  
- Comunicação com banco de dados

### Utilitários
`br.com.controlefinanceiro.util`  
- Ferramentas auxiliares

### Exceções
`br.com.controlefinanceiro.excecao`  
- Tratamento de erros customizados

---

## Componentes Principais

### Entidades do Sistema

| Entidade | Descrição |
|----------|-----------|
| `Transacao` | Classe abstrata base |
| `Despesa` | Movimentações de saída |
| `Receita` | Movimentações de entrada |
| `Categoria` | Classificação de transações |
| `Conta` | Contas bancárias/carteiras |
| `Usuario` | Dados do usuário |
| `MetaFinanceira` | Objetivos financeiros |

### Serviços

- **TransacaoService**: Gerencia fluxo de transações
- **RelatorioService**: Gera análises financeiras
- **MetaService**: Controla objetivos financeiros
- **UsuarioService**: Gerencia dados do usuário

---

## Diagramas

### Arquitetura em Camadas

```mermaid
flowchart LR
    A[Interface] --> B[Serviços]
    B --> C[Repositórios]
    C --> D[Banco de Dados]
