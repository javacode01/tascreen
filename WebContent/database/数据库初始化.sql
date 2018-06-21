prompt PL/SQL Developer import file
prompt Created on 2018��4��8�� by Administrator
set feedback off
set define off
prompt Creating SYS_ATTACHMENT...
create table SYS_ATTACHMENT
(
  RECID           VARCHAR2(32) not null,
  MODULE          VARCHAR2(100),
  BUSINESSID      VARCHAR2(32),
  TYPE            VARCHAR2(100),
  NAME            VARCHAR2(100),
  PATH            VARCHAR2(200),
  NOTE            VARCHAR2(1000),
  CREATE_TIME     TIMESTAMP(6),
  CREATER         VARCHAR2(32),
  UPDATE_TIME     TIMESTAMP(6),
  UPDATER         VARCHAR2(32),
  ATTACHMENT_SIZE NUMBER(6,2),
  SUFFIX          VARCHAR2(10)
)
;
comment on table SYS_ATTACHMENT
  is 'ϵͳ������';
comment on column SYS_ATTACHMENT.RECID
  is '����ID';
comment on column SYS_ATTACHMENT.MODULE
  is '��������ģ�飬Ҳ������������';
comment on column SYS_ATTACHMENT.BUSINESSID
  is '��������ID';
comment on column SYS_ATTACHMENT.TYPE
  is '�������ͣ�������ҳͼƬ������ҳͼƬ';
comment on column SYS_ATTACHMENT.NAME
  is '��������';
comment on column SYS_ATTACHMENT.PATH
  is '��������·��';
comment on column SYS_ATTACHMENT.NOTE
  is '������ע';
comment on column SYS_ATTACHMENT.CREATE_TIME
  is '�����ϴ�ʱ��';
comment on column SYS_ATTACHMENT.CREATER
  is '�����ϴ���';
comment on column SYS_ATTACHMENT.UPDATE_TIME
  is '��������ʱ��';
comment on column SYS_ATTACHMENT.UPDATER
  is '����������';
comment on column SYS_ATTACHMENT.ATTACHMENT_SIZE
  is '������С';
comment on column SYS_ATTACHMENT.SUFFIX
  is '������׺';
alter table SYS_ATTACHMENT
  add constraint PK_SYS_ATTACHMENT primary key (RECID);

prompt Creating SYS_DICTIONARIES...
create table SYS_DICTIONARIES
(
  RECID    VARCHAR2(32) not null,
  DIC_TYPE VARCHAR2(100),
  DIC_NAME VARCHAR2(100),
  NOTE     VARCHAR2(500)
)
;
comment on table SYS_DICTIONARIES
  is 'ϵͳ�����ֵ�';
comment on column SYS_DICTIONARIES.RECID
  is '��¼ID';
comment on column SYS_DICTIONARIES.DIC_TYPE
  is '�ֵ�����';
comment on column SYS_DICTIONARIES.DIC_NAME
  is '�ֵ�����';
comment on column SYS_DICTIONARIES.NOTE
  is '��ע';
alter table SYS_DICTIONARIES
  add constraint PK_SYS_DICTIONARIES primary key (RECID);

prompt Creating SYS_DICTIONARIES_ITEM...
create table SYS_DICTIONARIES_ITEM
(
  RECID     VARCHAR2(32) not null,
  DIC_TYPE  VARCHAR2(100),
  ITEM_CODE VARCHAR2(100),
  ITEM_NAME VARCHAR2(1000),
  NOTE      VARCHAR2(1000),
  STATUS    CHAR(1),
  SEQ       NUMBER(10)
)
;
comment on table SYS_DICTIONARIES_ITEM
  is '�ֵ������ݱ�';
comment on column SYS_DICTIONARIES_ITEM.RECID
  is '��¼ID';
comment on column SYS_DICTIONARIES_ITEM.DIC_TYPE
  is '�ֵ�����';
comment on column SYS_DICTIONARIES_ITEM.ITEM_CODE
  is '�ֵ�����';
comment on column SYS_DICTIONARIES_ITEM.ITEM_NAME
  is '�ֵ�������';
comment on column SYS_DICTIONARIES_ITEM.NOTE
  is '��ע';
comment on column SYS_DICTIONARIES_ITEM.STATUS
  is '�Ƿ���Ч0����1����';
comment on column SYS_DICTIONARIES_ITEM.SEQ
  is '����';
alter table SYS_DICTIONARIES_ITEM
  add constraint PK_SYS_DICTIONARIES_ITEM primary key (RECID);

prompt Creating SYS_FUNCTIONS...
create table SYS_FUNCTIONS
(
  FUNCTION_ID    VARCHAR2(32) not null,
  FUNCTION_NAME  VARCHAR2(50),
  FUNCTION_ICON  VARCHAR2(50),
  FUNCTION_LEVEL CHAR(1),
  PARENT_CODE    VARCHAR2(20),
  FUNCTION_CODE  VARCHAR2(20) not null,
  FUNCTION_URL   VARCHAR2(100),
  FUNCTION_TYPE  CHAR(1),
  SEQ            INTEGER,
  DEFAULT_ACTION CHAR(1),
  CREATE_TIME    TIMESTAMP(6),
  CREATER        VARCHAR2(32),
  UPDATE_TIME    TIMESTAMP(6),
  UPDATER        VARCHAR2(32)
)
;
comment on table SYS_FUNCTIONS
  is 'ϵͳ���ܱ�';
comment on column SYS_FUNCTIONS.FUNCTION_ID
  is '����ID';
comment on column SYS_FUNCTIONS.FUNCTION_NAME
  is '��������';
comment on column SYS_FUNCTIONS.FUNCTION_ICON
  is '����ͼ��';
comment on column SYS_FUNCTIONS.FUNCTION_LEVEL
  is '���ܼ���1��ģ��2������3������';
comment on column SYS_FUNCTIONS.PARENT_CODE
  is '�ϼ����ܱ���';
comment on column SYS_FUNCTIONS.FUNCTION_CODE
  is '���ܱ���';
comment on column SYS_FUNCTIONS.FUNCTION_URL
  is '��Դ��ַ';
comment on column SYS_FUNCTIONS.FUNCTION_TYPE
  is '��������1����ѯ2������';
comment on column SYS_FUNCTIONS.SEQ
  is '����';
comment on column SYS_FUNCTIONS.DEFAULT_ACTION
  is 'Ĭ�Ϸ���0����1����';
comment on column SYS_FUNCTIONS.CREATE_TIME
  is '����ʱ��';
comment on column SYS_FUNCTIONS.CREATER
  is '������';
comment on column SYS_FUNCTIONS.UPDATE_TIME
  is '�޸�ʱ��';
comment on column SYS_FUNCTIONS.UPDATER
  is '�޸���';
alter table SYS_FUNCTIONS
  add constraint PK_SYS_FUNCTIONS primary key (FUNCTION_ID);

prompt Creating SYS_ORGAN...
create table SYS_ORGAN
(
  ORGAN_ID    VARCHAR2(32) not null,
  ORGAN_CODE  VARCHAR2(20) not null,
  ORGAN_NAME  VARCHAR2(50),
  PARENT_CODE VARCHAR2(20),
  ICON_URL    VARCHAR2(50),
  SEQ         INTEGER,
  ORGAN_LEVEL CHAR(1),
  ORGAN_CLASS CHAR(2),
  ORGAN_TYPE  CHAR(1),
  CREATE_TIME TIMESTAMP(6),
  CREATER     VARCHAR2(32),
  UPDATE_TIME TIMESTAMP(6),
  UPDATER     VARCHAR2(32)
)
;
comment on table SYS_ORGAN
  is 'ϵͳ��֯�ṹ��';
comment on column SYS_ORGAN.ORGAN_ID
  is '��֯����ID';
comment on column SYS_ORGAN.ORGAN_CODE
  is '��֯�������';
comment on column SYS_ORGAN.ORGAN_NAME
  is '��֯��������';
comment on column SYS_ORGAN.PARENT_CODE
  is '�ϼ���֯����';
comment on column SYS_ORGAN.ICON_URL
  is '��֯ͼ��';
comment on column SYS_ORGAN.SEQ
  is '����';
comment on column SYS_ORGAN.ORGAN_LEVEL
  is '����������1��ʡ��2���о�';
comment on column SYS_ORGAN.ORGAN_CLASS
  is '����������1������2���ʼ�';
comment on column SYS_ORGAN.ORGAN_TYPE
  is '��������:��1:��λ2:����';
comment on column SYS_ORGAN.CREATE_TIME
  is '����ʱ��';
comment on column SYS_ORGAN.CREATER
  is '������';
comment on column SYS_ORGAN.UPDATE_TIME
  is '�޸�ʱ��';
comment on column SYS_ORGAN.UPDATER
  is '�޸���';
alter table SYS_ORGAN
  add constraint PK_SYS_ORGAN primary key (ORGAN_ID);

prompt Creating SYS_QUARTZ_JOB...
create table SYS_QUARTZ_JOB
(
  RECID           VARCHAR2(32) not null,
  JOB_NAME        VARCHAR2(100),
  JOB_GROUP_NAME  VARCHAR2(100),
  JOB_CLASS       VARCHAR2(500),
  CRON_EXPRESSION VARCHAR2(100),
  STATUS          VARCHAR2(2),
  REMARK          VARCHAR2(500),
  CREATER         VARCHAR2(32),
  CREATETIME      TIMESTAMP(6),
  UPDATER         VARCHAR2(32),
  UPDATETIME      TIMESTAMP(6)
)
;
comment on table SYS_QUARTZ_JOB
  is '��ʱ�������';
comment on column SYS_QUARTZ_JOB.RECID
  is '��ʱ�����¼ID';
comment on column SYS_QUARTZ_JOB.JOB_NAME
  is '��������';
comment on column SYS_QUARTZ_JOB.JOB_GROUP_NAME
  is '������';
comment on column SYS_QUARTZ_JOB.JOB_CLASS
  is '����ִ����';
comment on column SYS_QUARTZ_JOB.CRON_EXPRESSION
  is '����ʱ��';
comment on column SYS_QUARTZ_JOB.STATUS
  is '״̬';
comment on column SYS_QUARTZ_JOB.REMARK
  is '��ע';
comment on column SYS_QUARTZ_JOB.CREATER
  is '������';
comment on column SYS_QUARTZ_JOB.CREATETIME
  is '����ʱ��';
comment on column SYS_QUARTZ_JOB.UPDATER
  is '�޸���';
comment on column SYS_QUARTZ_JOB.UPDATETIME
  is '�޸�ʱ��';
alter table SYS_QUARTZ_JOB
  add constraint PK_SYS_QUARTZ_JOB primary key (RECID);

prompt Creating SYS_ROLES...
create table SYS_ROLES
(
  ROLE_ID     VARCHAR2(32) not null,
  ROLE_NAME   VARCHAR2(100),
  DESCRIPTION VARCHAR2(200),
  ORGAN_CODE  VARCHAR2(20),
  CREATE_TIME TIMESTAMP(6),
  CREATER     VARCHAR2(32),
  UPDATE_TIME TIMESTAMP(6),
  UPDATER     VARCHAR2(32),
  ROLE_CODE   VARCHAR2(20) not null
)
;
comment on table SYS_ROLES
  is 'ϵͳ��ɫ��';
comment on column SYS_ROLES.ROLE_ID
  is '��ɫID';
comment on column SYS_ROLES.ROLE_NAME
  is '��ɫ��';
comment on column SYS_ROLES.DESCRIPTION
  is '��ɫ����';
comment on column SYS_ROLES.ORGAN_CODE
  is '������֯�ṹ';
comment on column SYS_ROLES.CREATE_TIME
  is '����ʱ��';
comment on column SYS_ROLES.CREATER
  is '������';
comment on column SYS_ROLES.UPDATE_TIME
  is '�޸�ʱ��';
comment on column SYS_ROLES.UPDATER
  is '�޸���';
comment on column SYS_ROLES.ROLE_CODE
  is '��ɫ���';
alter table SYS_ROLES
  add constraint PK_SYS_ROLES primary key (ROLE_ID);

prompt Creating SYS_ROLE_FUNCTION...
create table SYS_ROLE_FUNCTION
(
  ID            VARCHAR2(32) not null,
  ROLE_CODE     VARCHAR2(20),
  FUNCTION_CODE VARCHAR2(20),
  CREATE_TIME   TIMESTAMP(6),
  CREATER       VARCHAR2(32)
)
;
comment on table SYS_ROLE_FUNCTION
  is 'ϵͳ��ɫ���ܹ�ϵ��';
comment on column SYS_ROLE_FUNCTION.ID
  is '��ɫ����ID';
comment on column SYS_ROLE_FUNCTION.ROLE_CODE
  is '��ɫ����';
comment on column SYS_ROLE_FUNCTION.FUNCTION_CODE
  is '���ܱ���';
comment on column SYS_ROLE_FUNCTION.CREATE_TIME
  is '����ʱ��';
comment on column SYS_ROLE_FUNCTION.CREATER
  is '������';
alter table SYS_ROLE_FUNCTION
  add constraint PK_SYS_ROLE_FUNCTION primary key (ID);

prompt Creating SYS_USERS...
create table SYS_USERS
(
  USER_ID      VARCHAR2(32) not null,
  USER_NAME    VARCHAR2(50) not null,
  PASSWORD     VARCHAR2(128) not null,
  STATUS       CHAR(1),
  SYSTEM       CHAR(1),
  LOCK_TIME    TIMESTAMP(6),
  EXPIRED_TIME TIMESTAMP(6),
  ORGAN_CODE   VARCHAR2(20),
  CREATE_TIME  TIMESTAMP(6),
  UPDATE_TIME  TIMESTAMP(6),
  CREATER      VARCHAR2(32),
  UPDATER      VARCHAR2(32),
  NICKNAME     VARCHAR2(50),
  USER_CODE    VARCHAR2(20) not null
)
;
comment on table SYS_USERS
  is 'ϵͳ�û���';
comment on column SYS_USERS.USER_ID
  is '�û�ID';
comment on column SYS_USERS.USER_NAME
  is '�û���';
comment on column SYS_USERS.PASSWORD
  is '����';
comment on column SYS_USERS.STATUS
  is '״̬0��������1������';
comment on column SYS_USERS.SYSTEM
  is '�Ƿ�ϵͳ�û�0����1����';
comment on column SYS_USERS.LOCK_TIME
  is '����ʱ��';
comment on column SYS_USERS.EXPIRED_TIME
  is '����ʱ��';
comment on column SYS_USERS.ORGAN_CODE
  is '������֯����';
comment on column SYS_USERS.CREATE_TIME
  is '����ʱ��';
comment on column SYS_USERS.UPDATE_TIME
  is '�޸�ʱ��';
comment on column SYS_USERS.CREATER
  is '������';
comment on column SYS_USERS.UPDATER
  is '�޸���';
comment on column SYS_USERS.NICKNAME
  is '�ǳ�';
comment on column SYS_USERS.USER_CODE
  is '�û�����';
alter table SYS_USERS
  add constraint PK_SYS_USERS primary key (USER_ID);

prompt Creating SYS_USER_ROLE...
create table SYS_USER_ROLE
(
  ID          VARCHAR2(32) not null,
  USER_CODE   VARCHAR2(20),
  ROLE_CODE   VARCHAR2(20),
  CREATE_TIME TIMESTAMP(6),
  CREATER     VARCHAR2(32)
)
;
comment on table SYS_USER_ROLE
  is '�����û���ɫ��ϵ';
comment on column SYS_USER_ROLE.ID
  is '�û���ɫID';
comment on column SYS_USER_ROLE.USER_CODE
  is '�û�����';
comment on column SYS_USER_ROLE.ROLE_CODE
  is '��ɫ����';
comment on column SYS_USER_ROLE.CREATE_TIME
  is '����ʱ��';
comment on column SYS_USER_ROLE.CREATER
  is '������';
alter table SYS_USER_ROLE
  add constraint PK_SYS_USER_ROLE primary key (ID);

prompt Loading SYS_ATTACHMENT...
prompt Table is empty
prompt Loading SYS_DICTIONARIES...
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('a249bc4a95d344b5a65a869cff5d8918', 'ISORNOT', '�Ƿ�', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('47a9fe6ff2e54f259dba2f36ebe90b72', 'FLEVEL', '���ܼ���', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('60f95adaf02c4abf8a1f4df597373041', 'FTYPE', '��������', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('2e6f4e4cb6734dadbc52d8437886a7fe', 'ORGANLEVEL', '��������', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('ad862009a0654ddf953bb6ee166fc18d', 'ORGANCLASS', '��������', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('866b97126e614d1e9d71f1c214c240e6', 'ORGANTYPE', '��������', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('5abc36d1b33e4b5d90eda11cf44cd68d', 'USERSSYSTEM', '�Ƿ�ϵͳ�û�', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('36078061cd8e47cc95490897c55db540', 'USERSSTATUS', '�û�״̬', null);
insert into SYS_DICTIONARIES (RECID, DIC_TYPE, DIC_NAME, NOTE)
values ('0fac0c2a71884287b5ade2dcff2ad80e', 'QUARTZJOBSTATUS', '��ʱ����״̬', null);
commit;
prompt 9 records loaded
prompt Loading SYS_DICTIONARIES_ITEM...
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('dfec3514f1ae4715b547997e96edf845', 'ISORNOT', '0', '��', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('e612a780ee91408585ac5336852a1e9a', 'ISORNOT', '1', '��', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('37d00e367e0247a5a0276d3d941c9140', 'FLEVEL', '2', '����', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('16f4a8ff9ef340828b1fbf8e69071c4a', 'FLEVEL', '3', '����', null, null, 3);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('1aa7563c62284709971752b3f9ff46e4', 'FTYPE', '1', '��ѯ', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('9b709ca220b04a2da828722e7af75f25', 'FTYPE', '2', '����', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('daf8f6d78ece49abb64574cc3f4b4a19', 'FLEVEL', '1', 'ģ��', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('66a8bfcc9a4f4dcb8bc0c02d8f88a85e', 'ORGANLEVEL', '1', '�ܹ�˾', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('bc8196cbfa724bceae1518784772b298', 'ORGANLEVEL', '2', '�ֹ�˾', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('97156546dd2a49ae839a43c0d1bb3b81', 'ORGANLEVEL', '3', '����', null, null, 3);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('617b37ae6d634926a7677d6455ee4143', 'ORGANLEVEL', '4', '����', null, null, 4);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('f6029e888cc545bf9b14719e2f62135f', 'ORGANLEVEL', '5', '���ڲ�', null, null, 5);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('d2192510336342179e7b5d8951326877', 'ORGANCLASS', '1', '��˾', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('d6bb5f9a45ba440a934d33b88c9b67f8', 'ORGANCLASS', '2', '����', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('79546522e8d44abb86f35c1e2fd86a43', 'ORGANTYPE', '1', '��˾', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('3708f99e35e54c9fa36e773d1f937022', 'ORGANTYPE', '2', '����', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('d7ca56bc8a5349b9b6249cd906df6904', 'USERSSTATUS', '0', '����', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('5f93b42fee7d41f9821e9732e5be5ec1', 'USERSSTATUS', '1', '����', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('027ba33b6bfb48eeb66cfffe91b9c565', 'USERSSYSTEM', '0', '��', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('84a641f73a3d4a5a9ac39451af9cbb5b', 'USERSSYSTEM', '1', '��', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('6bcf8ae61c10426ab4adcf55b288ff4e', 'QUARTZJOBSTATUS', 'NONE', '����', null, null, 1);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('8e834940bae84ba1ad590a7c7376b82b', 'QUARTZJOBSTATUS', 'NORMAL', '����״̬', null, null, 2);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('81f3f8ea96ee4c928ca61eed33090a45', 'QUARTZJOBSTATUS', 'PAUSED', '��ͣ״̬', null, null, 3);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('0283268b51a849919a7b0edc71269dd3', 'QUARTZJOBSTATUS', 'COMPLETE', '���������', null, null, 4);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('c687b285c7db4ce4854e547944fbd66c', 'QUARTZJOBSTATUS', 'BLOCKED', '�߳�����״̬', null, null, 5);
insert into SYS_DICTIONARIES_ITEM (RECID, DIC_TYPE, ITEM_CODE, ITEM_NAME, NOTE, STATUS, SEQ)
values ('4d98864322874aac81625b5ebe01b767', 'QUARTZJOBSTATUS', 'ERROR', '���ִ���', null, null, 6);
commit;
prompt 26 records loaded
prompt Loading SYS_FUNCTIONS...
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('3F78BF1C4B424F4F9A8E0F2E62183B07', 'ϵͳ����', 'fa fa-th-large', '1', 'root', '0099', null, null, 99, null, to_timestamp('22-11-2017 15:16:35.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('22-11-2017 15:16:35.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null);
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('C83773F6A9854502A2883DC15ED7B367', '�û�����', 'fa fa-user', '2', '0099', '00990001', null, null, 1, null, to_timestamp('22-11-2017 15:18:49.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('24-12-2017 02:28:32.004000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('A9D81C42E46A44E7802440DBE90618ED', '��ɫ����', 'fa fa-unlock', '2', '0099', '00990002', null, null, 2, null, to_timestamp('22-11-2017 15:19:33.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('24-12-2017 02:28:58.205000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('B51F8D51CB6B4320BB5898C23965F220', '���ܹ���', 'fa fa-wrench', '2', '0099', '00990003', null, null, 3, null, to_timestamp('22-11-2017 15:19:33.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('24-12-2017 02:32:29.577000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('8ABACF0F7A2E433B959F93F1563B765C', '��ѯ', null, '3', '00990001', '009900010001', 'sys/users/initmanagerusers', '1', 1, '1', to_timestamp('22-11-2017 15:23:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('22-11-2017 15:23:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null);
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('C0906A8B563946208CE577C6EC06820B', '��ѯ', null, '3', '00990002', '009900020001', 'sys/roles/initmanagerroles', '1', 1, '1', to_timestamp('22-11-2017 15:23:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('22-11-2017 15:23:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null);
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('26EF7BFAF2E74427A89E569E1B063A56', '��ѯ', null, '3', '00990003', '009900030001', 'sys/functions/initmanagerfunctions', '1', 1, '1', to_timestamp('22-11-2017 15:23:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('22-11-2017 15:23:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null);
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('32B92F3D5194494A981069218CD9BC3D', '�����ֵ����', 'fa fa-book', '2', '0099', '00990004', null, null, 4, null, to_timestamp('22-12-2017 19:17:53.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('24-12-2017 02:32:50.176000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('1EC561807E9746DE829F420EA48FFEE9', '��ѯ', null, '3', '00990004', '009900040001', 'sys/dictionaries/initmanagerdictionaries', '1', 1, '1', to_timestamp('22-12-2017 19:17:53.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('22-12-2017 19:17:53.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null);
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('72086f4c94cd469ca9c65b5c750a7f68', '��֯�ṹ����', 'fa fa-sitemap', '2', '0099', '00990005', null, null, 5, null, to_timestamp('24-12-2017 02:58:57.262000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 02:58:57.262000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('fc962c16a18b472492cb173ca361d679', '��ѯ', null, '3', '00990005', '009900050001', 'sys/organ/initmanagerorgan', '1', 1, '1', to_timestamp('24-12-2017 03:00:34.336000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 03:00:34.336000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('ab8776f89a1344768af1811b34bbdd0b', '��ʱ�������', 'fa fa-clock-o', '2', '0099', '00990006', null, null, 6, null, to_timestamp('11-03-2018 13:47:49.176000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('11-03-2018 13:55:20.669000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_FUNCTIONS (FUNCTION_ID, FUNCTION_NAME, FUNCTION_ICON, FUNCTION_LEVEL, PARENT_CODE, FUNCTION_CODE, FUNCTION_URL, FUNCTION_TYPE, SEQ, DEFAULT_ACTION, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('a13a6812a6fd41af9ca2e6aa23d8f32a', '��ѯ', null, '3', '00990006', '009900060001', 'sys/quartzjob/initmanagerquartzjob', '1', 1, '1', to_timestamp('11-03-2018 13:58:32.760000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('11-03-2018 13:58:32.760000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
commit;
prompt 13 records loaded
prompt Loading SYS_ORGAN...
insert into SYS_ORGAN (ORGAN_ID, ORGAN_CODE, ORGAN_NAME, PARENT_CODE, ICON_URL, SEQ, ORGAN_LEVEL, ORGAN_CLASS, ORGAN_TYPE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('56f7d190549e4d2994314cd5ddf20e5f', '000100010002', '����1��', '00010001', null, 2, '4', null, '2', to_timestamp('24-12-2017 21:58:36.517000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 21:58:36.517000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ORGAN (ORGAN_ID, ORGAN_CODE, ORGAN_NAME, PARENT_CODE, ICON_URL, SEQ, ORGAN_LEVEL, ORGAN_CLASS, ORGAN_TYPE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('28f5279e437f44eb8ebc7d80efdabcb4', '000100010003', '����1��', '00010001', null, 3, '5', null, '2', to_timestamp('24-12-2017 21:59:17.356000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 21:59:17.356000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ORGAN (ORGAN_ID, ORGAN_CODE, ORGAN_NAME, PARENT_CODE, ICON_URL, SEQ, ORGAN_LEVEL, ORGAN_CLASS, ORGAN_TYPE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('bbb730278da444ea96d65476fd991c76', '000100010004', '����2��', '00010001', null, 4, '3', null, '2', to_timestamp('24-12-2017 22:04:07.312000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 22:04:17.278000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ORGAN (ORGAN_ID, ORGAN_CODE, ORGAN_NAME, PARENT_CODE, ICON_URL, SEQ, ORGAN_LEVEL, ORGAN_CLASS, ORGAN_TYPE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('19fd5e58816f4ea69f1bd341ddc8bc50', '0001', '��Ǯ�˵Ĺ�˾', 'root', null, 1, '1', null, '1', to_timestamp('24-12-2017 21:55:06.709000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 22:00:24.386000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ORGAN (ORGAN_ID, ORGAN_CODE, ORGAN_NAME, PARENT_CODE, ICON_URL, SEQ, ORGAN_LEVEL, ORGAN_CLASS, ORGAN_TYPE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('da514ada0cea41e39d6a0fdc5f30f860', '00010001', '��Ǯ�˵ļ��Ϸֹ�˾', '0001', null, 1, '2', null, '1', to_timestamp('24-12-2017 21:56:53.278000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 21:59:57.633000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ORGAN (ORGAN_ID, ORGAN_CODE, ORGAN_NAME, PARENT_CODE, ICON_URL, SEQ, ORGAN_LEVEL, ORGAN_CLASS, ORGAN_TYPE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER)
values ('e10d1c6ebaea45e29f56b25ff40e8182', '000100010001', '����1��', '00010001', null, 1, '3', null, '2', to_timestamp('24-12-2017 21:57:42.438000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 21:57:51.690000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
commit;
prompt 6 records loaded
prompt Loading SYS_QUARTZ_JOB...
insert into SYS_QUARTZ_JOB (RECID, JOB_NAME, JOB_GROUP_NAME, JOB_CLASS, CRON_EXPRESSION, STATUS, REMARK, CREATER, CREATETIME, UPDATER, UPDATETIME)
values ('58b9878cf6d348b28d6a89614571fbf1', '��ʱ�������', '1', 'com.sys.utils.schedule.QuartzJob', '0/2 * * * * ?', null, '����', '1', to_timestamp('11-03-2018 20:51:02.757000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('11-03-2018 21:01:26.290000', 'dd-mm-yyyy hh24:mi:ss.ff'));
commit;
prompt 1 records loaded
prompt Loading SYS_ROLES...
insert into SYS_ROLES (ROLE_ID, ROLE_NAME, DESCRIPTION, ORGAN_CODE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER, ROLE_CODE)
values ('FD5E07609C0940DAB801A575C88B422F', '���Խ�ɫ', '���ڹ��ܲ���', null, to_timestamp('22-11-2017 15:26:30.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('22-11-2017 15:26:30.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, '0001');
insert into SYS_ROLES (ROLE_ID, ROLE_NAME, DESCRIPTION, ORGAN_CODE, CREATE_TIME, CREATER, UPDATE_TIME, UPDATER, ROLE_CODE)
values ('8920c67439b44c29a195a0b4310c09dd', '����', null, null, to_timestamp('24-12-2017 18:15:05.445000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', to_timestamp('24-12-2017 18:15:05.445000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', '0002');
commit;
prompt 2 records loaded
prompt Loading SYS_ROLE_FUNCTION...
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('2262e33c3b6e465bb6cab3e792043f9c', '0002', '00990001', to_timestamp('02-04-2018 12:36:18.549000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('d94996537f39494c966bb39d89dcbb3d', '0002', '00990003', to_timestamp('02-04-2018 12:36:18.618000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('86cd7231778f4244a5a9701b05914c40', '0002', '00990002', to_timestamp('02-04-2018 12:36:18.624000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('0c84f86ef0bf4d638ff344453984317d', '0002', '009900040001', to_timestamp('02-04-2018 12:36:18.633000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('0604841718f045e697680265d9cf148e', '0002', '00990005', to_timestamp('02-04-2018 12:36:18.641000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('256067262b62497692134ff9511a5b2d', '0002', '009900060001', to_timestamp('02-04-2018 12:36:18.647000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('b20b4c5148db4eb8911f7fbd37f7cc0b', '0002', '00990004', to_timestamp('02-04-2018 12:36:18.653000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('a77f27d735e94a95ae979d3bd22514e1', '0002', '00990006', to_timestamp('02-04-2018 12:36:18.659000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('6f2a168b4cc341d59c53cde7007cb3de', '0002', '009900020001', to_timestamp('02-04-2018 12:36:18.665000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('e3e7327c4e934248921aae46d4e9e62e', '0002', '009900050001', to_timestamp('02-04-2018 12:36:18.671000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('fa50193c9e7547139feea0650bb1aa9b', '0002', '0099', to_timestamp('02-04-2018 12:36:18.677000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('bd338c261a0d4e899eb67fe8e0456f79', '0002', 'root', to_timestamp('02-04-2018 12:36:18.683000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('f8c63bd34cae4ee79de9ea37faefc6a1', '0002', '009900030001', to_timestamp('02-04-2018 12:36:18.688000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('7048632a0d0e44679edba86faf98312e', '0002', '009900010001', to_timestamp('02-04-2018 12:36:18.694000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('a5b0f1a171e344759a77dffbd5ad6a45', '0001', '00990001', to_timestamp('02-04-2018 12:36:28.815000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('22f4bb7ba74043689a311851a035a85d', '0001', '00990003', to_timestamp('02-04-2018 12:36:28.821000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('3f3afae5aa4243be82e57d0f69dca8cb', '0001', '00990002', to_timestamp('02-04-2018 12:36:28.828000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('47065afcd2dd46cf9291478b1a15fffb', '0001', '009900040001', to_timestamp('02-04-2018 12:36:28.833000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('ea3d207058214916adf8d808100798fa', '0001', '00990005', to_timestamp('02-04-2018 12:36:28.837000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('9f044ff40757409a9b58101898d2c627', '0001', '009900060001', to_timestamp('02-04-2018 12:36:28.840000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('8fadd9abea7040a8a0c907b3ab6dd295', '0001', '00990004', to_timestamp('02-04-2018 12:36:28.844000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('eff3c7c2a6f34a098bc86e4bc8d67f9d', '0001', '00990006', to_timestamp('02-04-2018 12:36:28.850000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('5bf2f1afd67241598be01fac18a732a4', '0001', '009900020001', to_timestamp('02-04-2018 12:36:28.855000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('d12d6055e89a4025a512945d0abd57bb', '0001', '009900050001', to_timestamp('02-04-2018 12:36:28.859000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('1089b744fec241a085adaaa70b22b016', '0001', '0099', to_timestamp('02-04-2018 12:36:28.864000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('a4a87ae5fdac4709a8c74e5cdd3a1e99', '0001', 'root', to_timestamp('02-04-2018 12:36:28.868000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('38f92ad87d90408f82ff35713ae795e1', '0001', '009900030001', to_timestamp('02-04-2018 12:36:28.872000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
insert into SYS_ROLE_FUNCTION (ID, ROLE_CODE, FUNCTION_CODE, CREATE_TIME, CREATER)
values ('196a5b045a1c4a54ba6720cf5577b3e6', '0001', '009900010001', to_timestamp('02-04-2018 12:36:28.877000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
commit;
prompt 28 records loaded
prompt Loading SYS_USERS...
insert into SYS_USERS (USER_ID, USER_NAME, PASSWORD, STATUS, SYSTEM, LOCK_TIME, EXPIRED_TIME, ORGAN_CODE, CREATE_TIME, UPDATE_TIME, CREATER, UPDATER, NICKNAME, USER_CODE)
values ('1', 'admin', '96e79218965eb72c92a549dd5a330112', null, null, null, null, null, null, to_timestamp('31-12-2017 17:37:46.258000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, '1', '�û�1', '1');
insert into SYS_USERS (USER_ID, USER_NAME, PASSWORD, STATUS, SYSTEM, LOCK_TIME, EXPIRED_TIME, ORGAN_CODE, CREATE_TIME, UPDATE_TIME, CREATER, UPDATER, NICKNAME, USER_CODE)
values ('bcbb6dc97ed14f33b29fa4240c02e3de', 'login1', 'e10adc3949ba59abbe56e057f20f883e', '1', '0', null, null, '000100010001', to_timestamp('26-12-2017 08:56:44.927000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('26-12-2017 08:56:44.927000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1', '1', '�����û�1', '0001');
commit;
prompt 2 records loaded
prompt Loading SYS_USER_ROLE...
insert into SYS_USER_ROLE (ID, USER_CODE, ROLE_CODE, CREATE_TIME, CREATER)
values ('C37ED3DFDD0C4143897FDC24C0B4DD9D', '1', '0001', to_timestamp('25-12-2017 18:28:39.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null);
insert into SYS_USER_ROLE (ID, USER_CODE, ROLE_CODE, CREATE_TIME, CREATER)
values ('e148c177ce8a41ae9d6bc2100717da3e', '0001', '0001', to_timestamp('26-12-2017 09:26:17.954000', 'dd-mm-yyyy hh24:mi:ss.ff'), '1');
commit;
prompt 2 records loaded
set feedback on
set define on
prompt Done.
