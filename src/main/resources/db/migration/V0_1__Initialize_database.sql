create table team (
    id_team int primary key not null,
    name_team varchar(20),
    id_play int
    );
    /**,
    foreign key (id_team) references Team(id_team)
    **/
create table play_against(
    id_play int primary key not null,
    dateplay date,
    stadium varchar(100)
    );

create table player(
    id_player int primary key not null,
    name_player varchar(20),
    nombre int ,
    id_team int
    );

create table sponsor(
    id_sponsor int primary key not null,
    name_sponsor varchar(20)
    );

create table have (
    id_having int primary key not null,
    id_team int ,
    id_sponsor int
    );


alter table Team 
add constraint FK_Team_Play
foreign key (id_play)
references Play_against(id_play);

alter table Player 
add constraint FK_Player_Team
foreign key (id_team)
references Team(id_team);

alter table Have
add constraint FK_Team_Sponsor
foreign key (id_team)
references Team(id_team);

alter table Have
add constraint FK_Sponsor_Team
foreign key (id_sponsor)
references Sponsor(id_sponsor);
