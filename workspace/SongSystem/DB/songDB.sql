drop database if exists db_song;
create database db_song;
use db_song;
set names gbk;
drop table if exists category;
create table category(id int primary key auto_increment,name varchar(20));
insert into category(name) values ("流行歌曲"),("民歌民谣"),("校园歌曲");
select * from category;

drop table if exists song;
create table song(id int primary key auto_increment,name varchar(20),singer varchar(20),pubDate datetime,categoryId int,foreign key(categoryId) references category(id));
insert into song(name,singer,pubDate,categoryId) values ("万水千山","周杰伦","20080504",1),("独家记忆","陈小春","20080507",1),("彩虹","周杰伦","20080508",1),("闹元宵","李继红","20080510",2),("女儿歌","冯雪健","20080507",2),("青春无悔","老狼","20080512",3);
select * from song;


