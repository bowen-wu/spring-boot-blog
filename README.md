# Spring Boot Blog

## MySQL
```
# 此时的 MySQL 没有持有化存储，docker 重启数据会丢失，需要映射文件
docker run --name blog-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -e MYSQL_DATABASE=blog -p 3306:3306 -d mysql:8

# init database
create table user
(
    id int primary key auto_increment,
    username varchar(100),
    avatar varchar(100) default ''
);

insert into user (username, avatar) values ('张三', '');
insert into user (username, avatar) values ('李四', '');
```
