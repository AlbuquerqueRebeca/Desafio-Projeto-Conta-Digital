# Desafio-Projeto-Conta-Digital

# Desafio proposto pelo curso Developer Java da DIO.
 ### Desafio: 
  Considere o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), que possuem funcionalidades de depósito, saque e transferência (entre contas da mesma instituição).” Dentro dessas funcionalidades, é necessário implementar uma solução orientada a objetos em Java, que inclua os conceitos de abstração, herança, polimorfismo e encapsulamento.

- Além das funcionalidades solicitadas, adicionei algumas outras, como: nome do titular, número da conta, agência e saldo.
-  Também incluí interatividade do usuário nos métodos de inserção do nome do cliente, número da conta e agência, permitindo que ele insira seus próprios dados por meio da classe Scanner.

- O desafio atende às diretrizes solicitadas:

### Abstração : 
 Criei uma classe Conta que representa uma conta bancária genérica com atributos como numero, agencia, nomeCliente e saldo. Isso é uma boa abstração de uma conta bancária.

### Herança:
As duas classes, ContaPoupanca e ContaCorrente, que herdam da classe Conta. 

### Polimorfismo:
O método fazerTransferencia aceita um objeto Conta como argumento, o que significa que ele pode aceitar qualquer objeto que seja uma instância de Conta ou de qualquer subclasse de Conta. 

### Encapsulamento:
Declarei os atributos como private e forneci métodos públicos para manipulá-los.

