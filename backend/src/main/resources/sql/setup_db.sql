drop table if exists ssu;

create table ssu (
	ssuid varchar(120) NOT NULL,
	title TEXT,
	description TEXT,
    dateposted DATE,
    PRIMARY KEY (ssuid)
);

DELIMITER //
CREATE TRIGGER insert_new_guid
BEFORE INSERT ON ssu
FOR EACH ROW
BEGIN
	SET NEW.ssuid = UUID();
END;
//
DELIMITER ;



insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("Mary's 22nd Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The second way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2017-08-08');
insert into ssu (title, description, dateposted) values ("New Test", "The classical", '2017-08-08');
