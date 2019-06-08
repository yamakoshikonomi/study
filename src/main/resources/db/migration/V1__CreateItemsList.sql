# 商品テーブル
CREATE TABLE items (
    id int(10) NOT NULL PRIMARY KEY,
    name varchar(40) NOT NULL,
    price int(5) NOT NULL,
    category varchar(40) NOT NULL
);

