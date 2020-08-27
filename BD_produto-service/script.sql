-- criando instacia BD
create database condoserver;

-- drop table produtos;
use condoServer;
-- criando tabela produtos
create table produtos(
codigoProduto int not null primary key auto_increment,
descricaoProduto varchar(45) not null,
detalheProduto varchar(255) not null,
marcaProduto varchar(65),
valorProduto decimal(15,2) not null,
caminhoFoto varchar(255),
idMorador int);

-- consulta tabela produtos
select *
from produtos;

delete from produtos where codigoProduto = 7;

-- truncate table produtos

-- inserindo dados na tabela de produtos
insert into produtos (descricaoProduto, detalheProduto, marcaProduto, valorProduto, caminhoFoto, idMorador) values 
('Almofadas Coloridas', 'Almofadas 40x40 diversas estampas', 'Fabricacao Propria', 50.45, 'almofadas_bordadas.jpg', 1),
('Camisa Time Futebol', 'Camisas de times de futebol variados', 'Nike', 109.45, 'camisas_times.jpg', 1),
('Capacho', 'Capacho para entrada de residencias', 'Fabricacao Propria', 29.45, 'capacho.jpg', 1),
('Faço IR', 'Serviço de apoio para imposto de renda PF e PJ (valor a negociar)', 'N/A', 50.00, 'imposto_renda.jpg', 1),
('Marmita Fit', 'Marmita fit arroz integral, brocolis, couve, milho e carne moida', 'Fabricacao Propria', 25.90, 'marmita_fit.jpg', 1),
('Pijamas', 'Pijamas infantil/adulto diversos tamanhos e modelos', 'Fabricacao Propria', 30.00, 'pijamas.jpg', 1);

alter table produtos
add column idMorador int;

update produtos
set caminhoFoto = 'foto2.jpg',
idMorador = 1
where codigoProduto = 1;



-- criando instacia BD
create database morador;

use morador;
CREATE TABLE condominio (
idCondominio int NOT NULL AUTO_INCREMENT,
nomeCondominio varchar(50) DEFAULT NULL,
enderecoCondominio varchar(50) DEFAULT NULL,
cep varchar(10) DEFAULT NULL,
cidade varchar(30) DEFAULT NULL,
estado varchar(30) DEFAULT NULL,
PRIMARY KEY (idCondominio)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE morador (
idMorador int NOT NULL AUTO_INCREMENT,
idCondominio int DEFAULT NULL,
email varchar(50) DEFAULT NULL,
nomeCliente varchar(50) DEFAULT NULL,
dataNascimento date DEFAULT NULL,
enderecoCliente varchar(50) DEFAULT NULL,
telefoneContato1 varchar(14) DEFAULT NULL,
telefoneContato2 varchar(14) DEFAULT NULL,
timestampCadastro timestamp NULL DEFAULT NULL,
codigoComprovanteEnd int DEFAULT NULL,
idStatus char(1) DEFAULT NULL,
PRIMARY KEY (idMorador)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE login (
idCliente int NOT NULL,
senhaCliente varchar(50) NOT NULL,
timestampCadastro timestamp NULL DEFAULT NULL,
PRIMARY KEY (idCliente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


select * from morador;
select * from condominio;

truncate table morador;