# Estrutura de Pacotes e Classes do ThunderFit

## 📦 Pacote Principal: `com.thunderfit.academia`

### 📁 Subpacote: `model` (Classes de Domínio/Entidades)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `Usuario` | Classe Abstrata | Classe base para usuários do sistema |
| `Aluno` | Classe Concreta | Extende `Usuario`, adiciona dados específicos de alunos (IMC, frequência) |
| `Instrutor` | Classe Concreta | Extende `Usuario`, adiciona especializações e turmas |
| `Administrador` | Classe Concreta | Extende `Usuario`, gerencia permissões |
| `Plano` | Classe Concreta | Representa planos de assinatura (mensal, trimestral) |
| `Turma` | Classe Concreta | Agrupa alunos e instrutores com horários específicos |
| `Aula` | Classe Concreta | Registro de aulas ministradas |
| `Equipamento` | Classe Concreta | Cadastro de equipamentos da academia |
| `Manutencao` | Classe Concreta | Histórico de manutenções de equipamentos |

### 📁 Subpacote: `repository` (Repositórios - Padrão DAO)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `AlunoRepository` | Interface | Operações CRUD para alunos |
| `PlanoRepository` | Interface | Operações CRUD para planos |
| `AulaRepository` | Interface | Operações CRUD para aulas |
| `EquipamentoRepository` | Interface | Operações CRUD para equipamentos |

### 📁 Subpacote: `service` (Lógica de Negócio)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `GestaoAlunosService` | Classe Concreta | Gerencia cadastro e histórico de alunos |
| `FinanceiroService` | Classe Concreta | Processa pagamentos e mensalidades |
| `AgendamentoService` | Classe Concreta | Gerencia agendamento de aulas |
| `RelatorioService` | Classe Concreta | Gera relatórios e estatísticas |

### 📁 Subpacote: `controller` (Camada de Apresentação)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `AlunoController` | Classe Concreta | Endpoints para gestão de alunos |
| `PagamentoController` | Classe Concreta | Endpoints para transações financeiras |
| `AulaController` | Classe Concreta | Endpoints para agendamento de aulas |
| `RelatorioController` | Classe Concreta | Endpoints para geração de relatórios |

### 📁 Subpacote: `dto` (Objetos de Transferência)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `AlunoDTO` | Record | Representação simplificada de aluno para API |
| `PagamentoDTO` | Record | Dados para processamento de pagamentos |
| `AulaAgendamentoDTO` | Record | Dados para agendamento de aulas |

### 📁 Subpacote: `exception` (Tratamento de Erros)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `AlunoNaoEncontradoException` | Classe Concreta | Erro quando aluno não existe |
| `PagamentoRecusadoException` | Classe Concreta | Erro em transações financeiras |
| `ConflitoAgendamentoException` | Classe Concreta | Erro em agendamentos conflitantes |

### 📁 Subpacote: `config` (Configurações)
| Classe | Tipo | Descrição |
|--------|------|-----------|
| `SecurityConfig` | Classe Concreta | Configurações de autenticação/autorização |
| `MongoConfig` | Classe Concreta | Configuração do banco de dados |
| `SwaggerConfig` | Classe Concreta | Configuração da documentação da API |

## Diagrama Simplificado

```mermaid
classDiagram
    direction BT
    
    class Usuario {
        <<Abstract>>
        +String nome
        +String cpf
        +String email
    }
    
    class Aluno {
        +Double altura
        +Double peso
        +calcularIMC()
    }
    
    class Instrutor {
        +String especializacao
        +List~Turma~ turmas
    }
    
    class Plano {
        +String tipo
        +Double valor
        +LocalDate vigencia
    }
    
    class Aula {
        +String nome
        +LocalDateTime horario
        +registrarPresenca()
    }
    
    class GestaoAlunosService {
        +cadastrarAluno()
        +buscarAlunoPorCpf()
    }
    
    Usuario <|-- Aluno
    Usuario <|-- Instrutor
    Aluno "1" *-- "1" Plano
    Instrutor "1" *-- "*" Aula
