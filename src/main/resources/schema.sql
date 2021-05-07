CREATE TABLE student(
    Sid INTEGER(11) NOT NULL,
    Navn varchar(50) NOT NULL,
    primary key (Sid)
);

CREATE TABLE fag(
    Fid INTEGER(11) NOT NULL,
    Navn varchar(50) NOT NULL,
    primary key (Fid)
);

CREATE TABLE studentfag(
    Sid INTEGER(11) NOT NULL,
    Fid varchar(15) NOT NULL,
    Aar INTEGER(11) NOT NULL,
    Karakter char(1) NOT NULL,
    Prosent INTEGER(11) NOT NULL,
    primary key (Sid),
    primary key (Fid),
    primary key (Aar),
    foreign key (Sid) references student(Sid),
    foreign key (Fid) references fag(Fid)
);

