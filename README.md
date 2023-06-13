# projeto-springboot

Projeto Springboot criado para estudos pessoais.

### Ferramentas utilizadas:
- Docker para windows
- IntelliJ
- Mysql
___

### SQL:
- **DML** (Data Manipulation Language): para representar o conjunto de instruções da linguagem SQL para manipular os dados (**INSERT, UPDATE e DELETE**).
- **DDL** (Data Definition Language): conjunto de instruções e comandos para definição de dados (**CREATE, ALTER e DROP**).
- **DCL** (Data Control Language): instruções para controlar as permissões de acesso e uso aos objetos do banco de dados (**GRANT e REVOKE**).
- **DQL** (Data Query Language): comando que realiza consultas no SGBD (**SELECT**).
- **DTL/TCL** (Data Transaction Language/Transaction Control Language): envolve gerenciamento e controle de transações (**BEGIN/SET TRANSACTION, COMMIT, ROLLBACK, SAVEPOINT**)

___
### Comandos docker utilizados:

    docker-compose up (subir container)
    docker-compose up (remove container, mas o volume continua)
    docker ps (listar apenas containers de pé)
    docker ps -a (listar todos os containers)
    ctrl C (parar o conteiner)
    

## Métodos HTTP:

### GET:

Obtém os dados de um recurso;

Requisita a representação de um recurso específico; e
Requisições utilizando esse método devem retornar apenas dados.

### HEAD:

É similar ao GET, mas utilizado apenas para se obter os cabeçalhos de resposta, sem os dados em si; e
Requisita uma resposta de forma idêntica ao método GET, porém sem conter o corpo da resposta.

### POST:

Criar um novo recurso;

É utilizado para submeter uma entidade a um recurso específico;
Frequentemente causando uma mudança no estado do recurso ou efeitos colaterais no servidor.

### PUT:

Cria um novo recurso, igual ao método post; e
Mas substitui uma representação do recurso de destino com os novos dados se o recurso já existe;
Tanto POST quanto PUT podem ser usados para criação de um recurso, mas o PUT é mais usado para alteração de dados de um recurso.

### DELETE:

Remove um recurso específico.

### CONNECT:

Estabelece um túnel para o servidor identificado pelo recurso de destino; e
Pode ser utilizado para acessar websites que usam SSL (HTTPS).

### OPTIONS:

É usado para descrever as opções de comunicação com o recurso de destino;
Obtém quais manipulações podem ser realizadas em um determinado recurso.

### TRACE:

Executa um teste de chamada loop-back junto com o caminho para o recurso de destino; e
Ecoa a requisição recebida.

### PATCH:

É utilizado para aplicar modificações parciais em um recurso.

___
## Tipos de métodos:

#### Métodos seguros:
Um método seguro não altera o estado do servidor, ou seja, leva a uma operação de somente leitura.

- GET, HEAD e OPTIONS

#### Métodos idempotentes:
É um método em que uma requisição idêntica pode ser feita uma ou mais vezes, em sequência, com o mesmo efeito, enquanto deixa o servidor no mesmo estado.

- GET, HEAD, OPTIONS, PUT, DELETE e TRACE

#### Métodos cacheavéis:
Uma resposta cacheável é uma resposta HTTP que pode ser armazenada em cache, para ser recuperada e usada posteriormente, salvando uma nova solicitação no servidor.

- GET, HEAD e POST (Mas somente se houver informações atualizadas)