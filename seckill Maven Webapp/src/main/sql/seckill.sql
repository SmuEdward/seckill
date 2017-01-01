create database seckill;

use seckill;

create table seckill(
seckill_id bigint not null auto_increment comment '��Ʒ���id',
name varchar(120) not null comment '��Ʒ����',
number int not null comment '�������',
start_time timestamp not null comment '��ʼʱ��',
end_time timestamp not null comment '����ʱ��',
create_time timestamp not null default current_timestamp comment '����ʱ��',
primary key (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB Auto_increment=1000 default charset = utf8 comment='��ɱ����'

--��ʼ������
insert into seckill(name,number,start_time,end_time)
values
('1000Ԫ��ɱiphone6',100,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
('500Ԫ��ɱipad2',200,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
('300Ԫ��ɱС��4',300,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
('200Ԫ��ɱ����note',400,'2015-11-01 00:00:00','2015-11-02 00:00:00');

--��ɱ�ɹ���ϸ��
create table success_killed(
seckill_id bigint not null comment '��Ʒ���id',
user_phone bigint not null comment '��Ʒ����',
state tinyint not null default -1 comment '״̬��ʾ��-1����Ч 0���ɹ� 1���Ѹ���',
create_time timestamp not null  comment '����ʱ��',
primary key (seckill_id,user_phone), 
key idx_create_time(create_time)
)ENGINE=InnoDB default charset = utf8 comment='��ɱ�ɹ���ϸ��'






