# Conta Bancária - Versão Maven

Boas-vindas ao repositório do exercício Conta Bancária - Versão Maven

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Olá! Hoje nosso vamos simular um cenário onde supostamente estaremos dentro de um time de desenvolvimento de uma instituição financeira, e você, enquanto pessoa desenvolvedora, será responsável por implementar um pequeno sistema de apoio à validação de contas bancárias.

Nosso arquiteto de software montou uma especificação técnica que foi designada como uma demanda para você (veja os detalhes abaixo).

</details>

<details>
  <summary><strong>:memo: Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

 - Solucionar problemas relacionados ao gerenciamento de dependências no Maven;
 - Configurar e utilizar o Maven como ferramenta de gerenciamento de dependências em um projeto Java 

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

Verificamos que, ao utilizar a função de transferência eletrônica, outras instituições financeiras não estabelecem o mesmo formato no envio dos números das contas. Sendo assim, o desenvolvimento deste sistema tem como objetivo garantir que o formato das contas informadas pela pessoa usuária esteja de acordo com as diretrizes da nossa instituição (contas com 6 dígitos).

Neste projeto utilizaremos o gerenciador de dependências `Maven`.

### 1. Adicionar dependência no projeto

<details>
  <summary>descrição</summary><br />
    Neste projeto utilizaremos a dependência `Apache Commons Lang` versão `3.11`. Você precisará adicionar essa dependência nas configurações do projeto, levando em consideração o que aprendeu sobre o gerenciador de dependência sendo utilizado.
</details>

### 2. Implementar formatação do número da conta

<details>
  <summary>descrição</summary><br />
      No projeto já temos uma classe chamada `AccountNumberFormatter` contendo um método chamado `formatAccountNumber`. Nesse método, você deve receber o número de uma conta e retornar uma String formatada corretamente, conforme as seguintes regras conforme a quantidade de dígitos da conta:

      - `conta < 6 dígitos`: deverá adicionar zeros àa esquerda até atender ao tamanho de 6 números;
      - `conta > 6 dígitos`: deverão ser removidos todos os números antes dos 6 últimos;
      - `conta == 6 dígitos`: já está aderente, o valor deve permanecer inalterado.

      Exemplos:
      - Conta `448` deverá ser formatada como `"000448"`
      - Conta `877665544` deverá ser formatada como `"665544"`
      - Conta `334455` deverá ser formatada como `"334455"`

      Para nossa sorte, não precisamos implementar isso manualmente, uma vez que a biblioteca que adicionamos anteriormente já possui métodos para nos ajudar nesse trabalho. Dê uma olhada na documentação dos métodos `leftPad` e `right` da classe [StringUtils](https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html).
</details>

### 3. Ler conta no terminal

<details>
  <summary>descrição</summary><br />
    O projeto já possui uma classe principal chamada `Application`. Neste requisito você deve:

    - Receber o número da conta bancária (apenas números) no console (terminal) do sistema.
    - Rejeitar valores não numéricos com a mensagem: `Número da conta inválido!`
    - Caso a conta seja válida, mostrar como resultado a conta com a formatação padrão, utilizando a implementação feita no requisito anterior. A conta deve ser mostrada seguindo o padrão de mensagem `Número da conta: XXXXXX` , onde `XXXXXX`  é o número da conta já formatado.

    **Dica**: há várias formas de se fazer a validação, mas a classe da biblioteca mencionada anteriormente pode ter métodos úteis para isso 😉

    Por exemplo, 👓

    Se a pessoa usuária informar a conta `448` no input do console, deverá obter como resultado um feedback ok:

        Informe o número da conta:
        448
        Número da conta: 000448

    No entanto, se a pessoa usuária informar a conta `1234567890` no input do console, deverá obter como resultado a mensagem de aviso:

        Informe o número da conta:
        1234567890
        Número da conta: 567890

    Caso seja informado um valor não numérico (por exemplo `12345-X`), uma mensagem validando deverá aparecer:

        Informe o número da conta: 
        12345-X
        Número da conta inválido!
</details>

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH).
**Leva menos de 3 minutos!**

</details>

---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->
