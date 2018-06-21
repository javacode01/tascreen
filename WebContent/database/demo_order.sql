-----------------------------------------------------
-- Export file for user SDGS12315                  --
-- Created by Administrator on 2018/4/17, 17:47:45 --
-----------------------------------------------------

spool demo_order.log

prompt
prompt Creating table DEMO_ORDER
prompt =========================
prompt
create table DEMO_ORDER
(
  RECID       VARCHAR2(32) not null,
  ORDER_NO    VARCHAR2(50),
  DESCRIPTION VARCHAR2(200),
  CREATER     VARCHAR2(32),
  CREATE_TIME TIMESTAMP(6),
  UPDATER     VARCHAR2(32),
  UPDATE_TIME TIMESTAMP(6)
)
;
comment on table DEMO_ORDER
  is '������ʾ����';
comment on column DEMO_ORDER.RECID
  is '����id';
comment on column DEMO_ORDER.ORDER_NO
  is '�������';
comment on column DEMO_ORDER.DESCRIPTION
  is '�������';
comment on column DEMO_ORDER.CREATER
  is '������';
comment on column DEMO_ORDER.CREATE_TIME
  is '����ʱ��';
comment on column DEMO_ORDER.UPDATER
  is '������';
comment on column DEMO_ORDER.UPDATE_TIME
  is '����ʱ��';
alter table DEMO_ORDER
  add constraint PK_DEMO_ORDER primary key (RECID);


spool off
