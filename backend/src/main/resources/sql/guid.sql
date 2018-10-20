drop table if exists generateuid;

create table generateuid (
    ssuid varchar(255) NOT NULL,
    nameid varchar(255),
    description TEXT,
    PRIMARY KEY (ssuid)
 );


insert into generateuid (ssuid, nameid, description) values ("testin-123", "Brian","Testing");


##create function/delimiter using built in function of uuid() to have random chars and int as user id. 
DELIMITER //
CREATE TRIGGER insert_guid
BEFORE INSERT ON generateuid
FOR EACH  ROW
BEGIN
	SET NEW.ssuid = UUID();
END;
//
DELIMITER ;



select * from generateuid;

insert into generateuid (nameid, description) values ("Brian2","Test2");

select * from generateuid;