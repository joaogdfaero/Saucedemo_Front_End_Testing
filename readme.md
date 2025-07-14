## Treinamento QA - Selenium
Teste de login e logout na pagina: https://www.saucedemo.com/v1/index.html

## Cenários de Teste

**1. Cenário: Login de usuário com sucesso**

Descrição: Usuário insere credenciais válidas e faz login no sistema.

Caso de Teste:

Acesse a página de login.
Insira o nome de usuário "usuario_teste".
Insira a senha "senha123".
Clique no botão "Entrar".
Verifique se o usuário é redirecionado para a página inicial.
Verifique se a mensagem "Bem-vindo, usuario_teste" é exibida.

**2. Cenário: Logout de usuário**

Descrição: Usuário faz logout do sistema.

Caso de Teste:

Acesse a página inicial estando logado.
Clique no botão "Logout".
Verifique se o usuário é redirecionado para a página de login.
Verifique se a mensagem "Você saiu com sucesso" é exibida.

**3. Cenário: Adicionar produto ao carrinho**

Descrição: Usuário adiciona um produto ao carrinho de compras.

Caso de Teste:

Acesse a página de um produto específico.
Clique no botão "Adicionar ao Carrinho".
Verifique se o produto é adicionado ao carrinho.
Verifique se a quantidade de itens no carrinho é atualizada.

**4. Cenário: Remover produto do carrinho**

Descrição: Usuário remove um produto do carrinho de compras.

Caso de Teste:

Acesse o carrinho de compras.
Clique no botão "Remover" ao lado do produto específico.
Verifique se o produto é removido do carrinho.
Verifique se a quantidade de itens no carrinho é atualizada.

**5. Cenário: Finalizar compra**

Descrição: Usuário finaliza a compra dos produtos no carrinho.

Caso de Teste:

Acesse o carrinho de compras.
Clique no botão "Finalizar Compra".
Insira as informações de pagamento.
Clique no botão "Confirmar Compra".
Verifique se a compra é confirmada.
Verifique se uma mensagem de confirmação é exibida.# Saucedemo_Front_End_Testing
