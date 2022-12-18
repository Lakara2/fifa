insert into "team" (id_team , name_team ,id_play)
values (1, 'Argentine', 1),
       (2, 'Bresil' , 2),
       (3 , 'Portugal' , 3),
       (4,'Croatie',4),
       (5,'Maroc',5),
       (6,'France',6);
insert into "play_against" (id_play, dateplay,stadium)
values (1,'10-11-2022','Mahamasina')
     ,(2,'11-11-2022','Analakely'),
      (3,'12-11-12','Ambohijatovo'),
      (4,'13-11-2022','Masay'),
      (5,'14-11-2022','Andraharo'),
      (6,'15-11-2022','Ivandry');
insert into "player" (id_player, name_player, nombre, id_team)
values (1, 'Messi', 10, 1),
       (2, 'Neymar', 10, 2),
       (3, 'Cristiano', 7, 3),
       (4, 'De Bruyne', 14, 4),
       (5, 'Salah', 20, 5),
       (6, 'Mbappe', 22, 6);
insert into "sponsor" (id_sponsor,name_sponsor)
values (1,'Telma'),
       (2,'Orange'),
       (3,'Airtel'),
       (4,'HEI'),
       (5,'Novity'),
       (6,'Wakanime');
insert into "have" (id_having,id_team,id_sponsor)
values (1,1,1),
       (2,2,2),
       (3,3,3),
       (4,4,4),
       (5,5,5),
       (6,6,6);