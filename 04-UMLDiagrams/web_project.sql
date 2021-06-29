/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     18/6/2021 21:18:20                           */
/*==============================================================*/


drop table if exists AGENDA;

drop table if exists APPOINTMENT;

drop table if exists APPOINTMENTSERVICE;

drop table if exists EMPLOYEE;

drop table if exists SERVICE;

drop table if exists SERVICEEMPLOYEE;

drop table if exists USER;

/*==============================================================*/
/* Table: AGENDA                                                */
/*==============================================================*/
create table AGENDA
(
   AGENDACODE           char(8) not null,
   USERCODE             char(10) not null,
   AGENDADATE           datetime,
   AGENDADESCRIPTION    varchar(64),
   primary key (AGENDACODE)
);

/*==============================================================*/
/* Table: APPOINTMENT                                           */
/*==============================================================*/
create table APPOINTMENT
(
   APPOINTMENTCODE      char(8) not null,
   AGENDACODE           char(8),
   APPOINTMENTSTARTHOUR time,
   APPOINTMENTENDHOUR   time,
   DIASCITA             varchar(64),
   primary key (APPOINTMENTCODE)
);

/*==============================================================*/
/* Table: APPOINTMENTSERVICE                                    */
/*==============================================================*/
create table APPOINTMENTSERVICE
(
   APPOINTMENTCODE      char(8) not null,
   SERVICECODE          char(8) not null,
   primary key (APPOINTMENTCODE, SERVICECODE)
);

/*==============================================================*/
/* Table: EMPLOYEE                                              */
/*==============================================================*/
create table EMPLOYEE
(
   EMPLOYEECODE         char(10) not null,
   EMPLOYEENAME         varchar(32),
   primary key (EMPLOYEECODE)
);

/*==============================================================*/
/* Table: SERVICE                                               */
/*==============================================================*/
create table SERVICE
(
   SERVICECODE          char(8) not null,
   SERVICENAME          varchar(32),
   SERVICEDESCRIPTION   varchar(64),
   primary key (SERVICECODE)
);

/*==============================================================*/
/* Table: SERVICEEMPLOYEE                                       */
/*==============================================================*/
create table SERVICEEMPLOYEE
(
   SERVICECODE          char(8) not null,
   EMPLOYEECODE         char(10) not null,
   primary key (SERVICECODE, EMPLOYEECODE)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   USERCODE             char(10) not null,
   USERNAME             varchar(32),
   USERPASSWORD         varchar(32),
   primary key (USERCODE)
);

alter table AGENDA add constraint FK_USERAGENDA foreign key (USERCODE)
      references USER (USERCODE) on delete restrict on update restrict;

alter table APPOINTMENT add constraint FK_AGENDAAPPOINTMENT foreign key (AGENDACODE)
      references AGENDA (AGENDACODE) on delete restrict on update restrict;

alter table APPOINTMENTSERVICE add constraint FK_APPOINTMENTSERVICE foreign key (APPOINTMENTCODE)
      references APPOINTMENT (APPOINTMENTCODE) on delete restrict on update restrict;

alter table APPOINTMENTSERVICE add constraint FK_APPOINTMENTSERVICE2 foreign key (SERVICECODE)
      references SERVICE (SERVICECODE) on delete restrict on update restrict;

alter table SERVICEEMPLOYEE add constraint FK_SERVICEEMPLOYEE foreign key (SERVICECODE)
      references SERVICE (SERVICECODE) on delete restrict on update restrict;

alter table SERVICEEMPLOYEE add constraint FK_SERVICEEMPLOYEE2 foreign key (EMPLOYEECODE)
      references EMPLOYEE (EMPLOYEECODE) on delete restrict on update restrict;


/*==============================================================*/
/* Insercion                                                    */
/*==============================================================*/
insert into USER values('1751990332', 'David', 'Hello_12345');
insert into USER values('1751990334', 'Elian', 'Hello_12345');

insert into EMPLOYEE values('1751990332', 'Bryan');
insert into EMPLOYEE values('1751990334', 'Steven');

insert into SERVICE values('ABDC1234', 'Software Develop', 'Tell us your ideas');
insert into SERVICE values('DEFG5678', 'Marketing', 'We help you will the marketing of your enterprise');

insert into AGENDA values('ABDC1234', '1751990332', '2000-06-10 10:30:00', 'Agenda 1');
insert into AGENDA values('DEFG5678', '1751990334', '2000-06-10 10:30:00', 'Agenda 1');

insert into APPOINTMENT values('ABDC1234', 'DEFG5678', '10:30:00', '13:30:00', 'L-M-X-J-V');
insert into APPOINTMENT values('DEFG5678', 'ABDC1234', '10:30:00', '13:30:00', 'S-D');

insert into SERVICEEMPLOYEE values('ABDC1234', '1751990334');
insert into SERVICEEMPLOYEE values('DEFG5678', '1751990332');

insert into APPOINTMENTSERVICE values('ABDC1234', 'DEFG5678');
insert into APPOINTMENTSERVICE values('DEFG5678', 'ABDC1234');