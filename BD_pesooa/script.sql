CREATE DATABASE pessoas;

use pessoas;

create table if not exists tb_pessoa (
	codigo int primary key auto_increment,
    nome varchar(300) not null,
    fone varchar(40) not null,
    email varchar(200) null
);

show tables;

truncate tb_pessoa;

-- C
insert into
	tb_pessoa (nome, fone, email)
values 
	('João da Silva', '123456789', 'joao@email.com'), 
    ('Maria', '98653214', 'maria@email.com'),
    ('Pedro', '987654321', 'pedro@email.com')
;

-- R
select * from tb_pessoa;
select nome, email from tb_pessoa;
select email, nome from tb_pessoa;
select * from tb_pessoa where codigo = 1;

-- U
update tb_pessoa set nome = 'Jose Dos Santos' where codigo = 1;

-- D
delete from tb_pessoa where codigo = 1;