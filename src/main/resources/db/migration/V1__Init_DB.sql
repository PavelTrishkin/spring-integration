create sequence sell_seq start 1 increment 1;
create table sells_tbl (
        sell_id int8 not null,
        created_fld timestamp,
        order_id_fld int8,
        username_fld varchar(255),
        product_title_fld varchar(255),
        amount_fld int8,
        sum_fld numeric(19, 2),
        primary key (sell_id));