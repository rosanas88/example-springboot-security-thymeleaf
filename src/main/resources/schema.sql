create table IF NOT EXISTS reserva
(
   id integer not null,
   nome_responsavel varchar(255) not null,
   documento_responsavel varchar(255),
   telefone_responsavel varchar(255) not null,
   numero_pessoas integer not null,
   data_reserva DATE not null,
   horario varchar(5) not null,
   primary key(telefone_responsavel, data_reserva, horario)
);