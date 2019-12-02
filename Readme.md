# O que foi utilizado:

```
Java 11
Gradle
IntelliJ - idea
```

# O quanto foi feito:
Não consegui terminar todo o exercício, porém ele roda e tem as seguintes funcionalidades:

```
Lê todos os arquivos dentro do diretório padrão HOMEPATH/data/in;
Coloca o arquivo de saída em HOMEPATH/data/out.
 No arquivo de saída os dados que possui são: 
• Quantidade de clientes no arquivo de entrada 
• Quantidade de vendedores no arquivo de entrada 
```
```PS: Talvez tenha que executar duas vezes a main para o projeto rodar :)```

# O que foi pensado a nível técnico:

1. Primeiramente eu comecei pegando somente um arquivo, lendo ele e pegando somente quantos cliente tinham e juntamente com isso implementei alguns testes.
2. Segundamente, após isso tentei uma versão separando mais os métodos em classe:
As classes:
```
Services:
FileManager - responsável por pegar os arquivos e gerencia-los;
ProcessFile - responsável pelo processamento dos arquivos, ou seja, ler eles e gerar o relátorio no arquivo de saída;
SellDataFactory - responsável por verificar dos dados quantos eram clientes e quantos eram vendedores.

Domains:
Customer
Salesman
```
3. Implementei a Classe Customer, e mais adiante, a Classe Salesman
4. Consegui printar no arquivo de saída quantos vendedores e cliente.
5. Infelizmente nao tive tempo para implementar o resto dos requisitos no arquivo de saída, mas eu pensava em criar uma classe venda, para assim ter seus dados referentes.
