INSERT INTO tb_user (name, email, cpf, date_birth) VALUES ('Homer', 'homer@superbock.com', '12345678996', '1952-02-08');
INSERT INTO tb_user (name, email, cpf, date_birth) VALUES ('Bart', 'bart@gmail.com', '12345678990', '1986-12-18');

INSERT INTO tb_address (logradouro, numero, complemento, bairro, cidade, estado, cep) VALUES ('Rua', '22', '902', 'Corujeira', 'Campinas', 'SP', '24230-400');
INSERT INTO tb_address (logradouro, numero, complemento, bairro, cidade, estado, cep) VALUES ('Rua', '02', '0', 'Centro', 'Juiz de Fora', 'MG', '4000-481');
INSERT INTO tb_address (logradouro, numero, complemento, bairro, cidade, estado, cep) VALUES ('Av.', '04', '!T', 'Corujeira', 'Coscob', 'Rj', '06608');


INSERT INTO tb_user_address (user_id, address_id) VALUES (1, 1);
INSERT INTO tb_user_address (user_id, address_id) VALUES (1, 3);
INSERT INTO tb_user_address (user_id, address_id) VALUES (2, 1);
INSERT INTO tb_user_address (user_id, address_id) VALUES (2, 2);