#Relatório-AWS

#Relatório de implementação de serviços AWS
```
Data: 28/08/2025
Empresa:Abstergo Industries 
Responsável: Eugênio Santana
```

##Introdução

Este relatório apresenta o processo de implementação de ferramentas na empresa Abstergo Industries realizado por Eugênio Santana. O objetivo do projeto foi elencar três serviços da AWS com a finalidade de realizar diminuição de custos imediatos.

##Descrição do projeto

Etapa 1: 

```
-[AWS Lambda] 
-[Elimina a necessidade de manter servidores sempre ligados para executar código (como microsserviços, processamento de dados ou automações).
Você paga apenas pelo tempo de execução do código, medido em milissegundos. Não há custos quando o código não está rodando, eliminando o custo de infraestrutura ociosa.
Dispensa a necessidade de equipes para gerenciar e fazer a manutenção de servidores.]

-[Pode ser usado para automatizar tarefas de rotina, como o processamento de pedidos após a venda, envio de e-mails de confirmação ou compactação de arquivos, a um custo muito baixo e sem gerenciamento de servidor.] 
```

Etapa 2: 

```
-[Amazon EC2 Spot Instances] 
-[É uma forma de comprar capacidade de computação subutilizada (máquinas virtuais) do Amazon EC2, oferecendo até 90% de desconto em comparação com o preço sob demanda.
Substitui o uso de instâncias de uso geral para cargas de trabalho que podem ser interrompidas e reiniciadas sem problemas, como processamento de lotes ou análises.]

-[deal para rodar tarefas flexíveis, como análise de dados em grande escala ou simulações, a um custo drasticamente menor.

Permite à equipe de TI economizar significativamente em ambientes de desenvolvimento e teste, que não precisam estar sempre ativos.] 
```

Etapa 3: 

```
-[AWS Fargate] 
-[É um motor de computação sem servidor para contêineres que dispensa a necessidade de gerenciar servidores ou máquinas virtuais para rodar suas aplicações.

Em vez de provisionar servidores EC2 para hospedar contêineres, você paga apenas pelos recursos de computação (CPU e memória) que sua aplicação usa.]

-[Ótimo para modernizar a arquitetura de sistemas, como o sistema de estoque ou de vendas, usando contêineres sem se preocupar com a infraestrutura subjacente.

Reduz a complexidade e o tempo de gerenciamento, permitindo que a equipe de TI se concentre em funcionalidades em vez de em servidores.]
```
