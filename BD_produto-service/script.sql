-- criando instacia BD
create database condoserver;

-- criando tabela produtos
create table produtos(
codigoProduto int not null primary key auto_increment,
descricaoProduto varchar(45) not null,
detalheProduto varchar(255) not null,
marcaProduto varchar(65),
valorProduto decimal(15,2) not null);

create table fotosProdutos(
codigoFoto int not null primary key auto_increment,
binarioFoto blob,
codigoProduto int,
foreign key (codigoProduto) references produtos (codigoProduto));

-- consulta tabela produtos
select *
from produtos;

-- inserindo dados na tabela de produtos
insert into produtos (descricaoProduto, detalheProduto, marcaProduto, valorProduto) values 
('Marmita Fit 1', 'Marmita fit com arroz integral, frango, salada simples', 'Fabricacao Propria', 25.45),
('Marmita Fit 2', 'Marmita fit com batata doce, frango, salada simples', 'Fabricacao Propria', 25.45),
('Marmita Fit 3', 'Marmita fit com arroz integral, carne moida magra, salada simples', 'Fabricacao Propria', 29.45),
('Marmita Fit 4', 'Marmita fit com batata doce, carne moida magra, salada simples', 'Fabricacao Propria', 29.45),
('Marmita Executiva', 'Marmita executiva feijoada com arroz, couve, torresmo e farofa', 'Fabricacao Propria', 35.90);

insert into produtos (descricaoProduto, detalheProduto, marcaProduto, valorProduto) values 
('Produtos Natura', 'Toda a linha todo dia, mamae e bebe e outras', 'Natura', 0.00);

alter table produtos
drop column quantidadeProduto;