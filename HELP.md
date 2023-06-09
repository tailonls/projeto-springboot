# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.tailon.projeto-springboot' is invalid and this project uses 'com.tailon.projetospringboot' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.12/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.12/maven-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.12/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.12/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)


## MÉTODOS HTTP:

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