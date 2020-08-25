-- criando instacia BD
create database condoserver;

-- drop table produtos;

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