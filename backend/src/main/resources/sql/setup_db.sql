drop table if exists ssu;
drop table if exists users;

create table users(
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

insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode)
values ("Justin","Ramer","jRamer22","password1234","123456789","626-223-2232","jramer@yahoo.com",'1995-01-01',"Ramer is a gamer");
insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode)
values ("Mary","Tibet","mt78","password1234","123456789","626-223-2232","maryr@yahoo.com",'1996-11-11',"Ramer is a gamer");
insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode)
values ("Charles","Jay","charleszzzz","password1234","123456789","626-223-2232","charr@yahoo.com",'1996-05-22',"Ramer is a gamer");
insert into users (firstname, lastname, username, pswd, cin, phonenumber, emailaddress, birthday, secretcode)
values ("Ryan","Duning","rdunning","password1234","123456789","626-223-2232","rdunn@yahoo.com",'1996-07-14',"Ramer is a gamer");

create table ssu (
	ssuid int(11) NOT NULL AUTO_INCREMENT,
    likes int(11),
	userid int(11) NOT NULL,
	title TEXT,
	description TEXT,
    dateposted DATE,
    PRIMARY KEY (ssuid),
    FOREIGN KEY (userid) REFERENCES users(userid) ON DELETE CASCADE
);

insert into ssu (likes, userid, title, description, dateposted) values (5, 1, "John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (likes, userid, title, description, dateposted) values (12, 1, "Mary's 22nd Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The second way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2017-08-08');
insert into ssu (likes, userid, title, description, dateposted) values (11, 2, "John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (likes, userid, title, description, dateposted) values (13, 1, "John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (likes, userid, title, description, dateposted) values (8, 3, "John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');
insert into ssu (likes, userid, title, description, dateposted) values (2, 4, "John's 21st Birthday", "The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphos, similar to an underscore at the beginning of the new group", '2012-01-01');