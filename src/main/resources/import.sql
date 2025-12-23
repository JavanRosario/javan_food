-- Estados brasileiros
insert into estado (nome) values ('Rio de Janeiro');
insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Paraná');

-- Permissões
insert into permissao (nome, descricao) values ('CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (nome, descricao) values ('EDITAR_COZINHAS', 'Permite editar cozinhas');

-- Cidades (relacionadas corretamente aos estados)
insert into cidade (nome, estado_id) values ('Rio de Janeiro', 1);
insert into cidade (nome, estado_id) values ('São Paulo', 2);
insert into cidade (nome, estado_id) values ('Curitiba', 3);

-- Cozinhas
insert into cozinha (nome) values ('Italiana');
insert into cozinha (nome) values ('Japonesa');
insert into cozinha (nome) values ('Brasileira');

-- Formas de pagamento
insert into forma_pagamento (descricao) values ('Débito');
insert into forma_pagamento (descricao) values ('Crédito');
insert into forma_pagamento (descricao) values ('PIX');

-- Restaurantes
insert into restaurante (nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_bairro, endereco_cep, endereco_complemento, endereco_logradouro, endereco_numero, data_cadastro, data_atualizacao) values ('La Tavola', 5.50, 1, 1, 'Centro', '01001-000', 'Sala 101', 'Rua Itália', '100', UTC_TIMESTAMP(), UTC_TIMESTAMP());
insert into restaurante (nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_bairro, endereco_cep, endereco_complemento, endereco_logradouro, endereco_numero, data_cadastro, data_atualizacao) values ('Sushi House', 6.90, 2, 2, 'Liberdade', '01503-020', 'Loja B', 'Rua dos Orientais', '250', UTC_TIMESTAMP(), UTC_TIMESTAMP());
insert into restaurante (nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_bairro, endereco_cep, endereco_complemento, endereco_logradouro, endereco_numero, data_cadastro, data_atualizacao) values ('Sabor Brasil', 3.10, 3, 3, 'Centro', '80040-010', NULL, 'Rua do Comércio', '15', UTC_TIMESTAMP(), UTC_TIMESTAMP());

-- Relacionamento Restaurante x Forma de Pagamento
insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1);
insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 2);
insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (2, 2);
insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (2, 3);
insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (3, 1);
insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (3, 3);

-- Produtos
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Porco com molho agridoce', 'Deliciosa carne suína ao molho especial', 78.90, 1, 1);
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Camarão tailandês', '16 camarões grandes ao molho picante', 110.00, 1, 1);
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Sushi variado', 'Combo com 20 peças de sushi e sashimi', 95.00, 1, 2);
insert into produto (nome, descricao, preco, ativo, restaurante_id) values ('Feijoada completa', 'Feijoada tradicional com acompanhamentos', 45.00, 1, 3);