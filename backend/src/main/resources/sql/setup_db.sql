drop table if exists ssu;
drop table if exists users;

create table ssu (
	ssuid int(11) NOT NULL AUTO_INCREMENT,
	title TEXT,
	description TEXT,
    dateposted DATE,
    PRIMARY KEY (ssuid)
);

insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("Mary's 22nd Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The second way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2017-08-08');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (title, description, dateposted) values ("John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');


create table users (
	userid int(11) NOT NULL AUTO_INCREMENT,
  firstname TEXT,
  lastname TEXT,
  username TEXT,
  pswd TEXT,
  cin TEXT,
  phonenumber TEXT,
  emailaddress TEXT,
  birthday DATE,
  secretcode TEXT,
  PRIMARY KEY (userid)
);

insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode) values ("John", "Smith", "Jmoney", "MoneyMoneyMoney", "305239203", "6262344234", "jsmith@gmail.com",'2001-07-01', "3m");
insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode) values ("Jamie", "Chan", "Jamie45", "daisysarenice", "306221222", "6262542342", "daisy45@yahoo.com",'1999-01-03', "daisy");
insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode) values ("Ken", "Sanchez", "Raiders523", "raidersRule", "304223444", "6262384237", "raidernation523@gmail.com",'2000-05-23', "raiders");
insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode) values ("Michelle", "Lee", "MLee888", "poohbear88", "311239203", "6262744236", "MLee@gmail.com",'1999-06-06', "honey");
