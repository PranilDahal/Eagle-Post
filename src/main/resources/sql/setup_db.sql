drop table if exists ssu;

create table ssu (
	id int(11) NOT NULL AUTO_INCREMENT,
	title TEXT,
	description TEXT,
    date_posted DATE,
    PRIMARY KEY (id)
);

insert into ssu (title, description, date_posted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, date_posted) values ("Mary's 22nd Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2017-08-08');