/*
DECLARE @imie NVARCHAR(30);
DECLARE @nazwisko NVARCHAR(30);
DECLARE @wiek NVARCHAR(30);
SET @imie = 'imie';
set @nazwisko = 'nazwisko';
set @wiek = 'wiek';
SELECT @imie = Imie,@nazwisko = Nazwisko,@wiek = 
FROM Nazwiska
WHERE Imie = 'Jan';
PRINT @var1
DECLARE
@wiek INT = 21,
@imie CHAR(20) = 'Jan',
@nazwisko CHAR(20) = 'Adamowski';
SELECT
@nazwisko as Nazwisko,
@imie as Imie,
@wiek as Wiek;

DECLARE
@wiek2 INT,
@imie2 CHAR(20),
@nazwisko2 CHAR(20);
SET @imie2 = (SELECT Imie FROM Nazwiska Where Numer=1);
SET @nazwisko2 = (SELECT Nazwisko FROM Nazwiska Where Numer=1);
SELECT
@nazwisko2 as Nazwisko2,
@imie2 as Imie2;

DECLARE
@pensja MONEY;
SET @pensja = (SELECT Pensja FROM Nazwiska  WHERE numer = 2);
PRINT 'Pensja to : '+CAST(@pensja as char(10));
PRINT 'Pensja to : '+CONVERT(varchar(20), @pensja);

DECLARE
@id INT,
@imie CHAR(20),
@nazwisko CHAR(20),
@stanowisko CHAR(20),
@pensja MONEY,
@miasto char(20);
SELECT 
@ID = Numer,
@imie = Imie,
@nazwisko = Nazwisko,
@stanowisko = Stanowisko,
@pensja = Pensja*12,
@miasto = Miasto
FROM Nazwiska
WHERE Numer = 7;
PRINT 'ID : '+CAST(@id as char(10));
PRINT 'imie : '+CAST(@imie as varchar(20));
PRINT 'nazwisko : '+CAST(@nazwisko as varchar(20));
PRINT 'stanowisko : '+CAST(@stanowisko as varchar(20));
PRINT 'pensja : '+CAST(@pensja as varchar(20));
PRINT 'miasto : '+CAST(@miasto as varchar(20));

DECLARE @tabTest TABLE (id int identity(1,1),
Dodane varchar(50));
INSERT INTO @tabTest
select Nazwisko
from Nazwiska;
UPDATE @tabTest
set Dodane = Dodane + 'dodano do tabeli w dniu ' + CONVERT(varchar(10),GETDATE(),20)
delete from @tabTest where id = 10;
SELECT * FROM @tabTest;

DECLARE @tabTest TABLE 
(id int identity(1,1),
Imie varchar(50),
Nazwisko varchar(50),
Pensja money,
Premia money);
INSERT INTO @tabTest
select Imie,Nazwisko,Pensja,(4000-Pensja)*0.2 from Nazwiska
where Pensja < 4000;
SELECT * FROM @tabTest;
*/
/*
CREATE TABLE #test
(id int primary key identity,
nazwisko varchar(20) not null);
alter table #test
add Miasto varchar(20);
select * from #test;
drop table #test;

CREATE TABLE #test
(id int primary key identity,
nazwisko varchar(20) not null);
insert into #test (nazwisko) values ('Abakowski');
insert into #test (nazwisko) values ('Bebkowski');
insert into #test (nazwisko) values ('Ceckowski');
select * from #test;
update #test set nazwisko = 'Zmienny' where id = 3;
select * from #test;
delete from #test where id = 2;
select * from #test;

declare @numer int = (select max(numer) from Nazwiska)+1,
@imie varchar(20) = 'Hans',
@nazwisko varchar(20) = 'Kloss',
@stanowisko varchar(20) = 'manager';
SELECT 
SYSDATETIME() AS [SYSDATETIME],
SYSDATETIMEOFFSET() AS [SYSDATETIMEOFFSET],
GETDATE() AS [GETDATE],
GETUTCDATE() AS [GETUTCDATE],
CURRENT_TIMESTAMP AS [CURRENT_TIMESTAMP],
SYSUTCDATETIME() AS [SYSUTCDATETIME];
*/
/*
select year('2022-02-12') as rok,
month('2022-02-12') as miesi¹c,
day('2022-02-12') as dzieñ;

select
datepart(yy,getdate()) as Rok,
datepart(MM,getdate()) as Miesi¹c,
datepart(DD,getdate()) as Dzieñ,
datepart(WW,getdate()) as Tydzieñ,
datepart(HH,getdate()) as Godzina,
datepart(MI,getdate()) as Minuta;


select
DATEFROMPARTS(2022,11,22),
DATETIME2FROMPARTS(2022,11,22,10,33,55,1234567,7),
DATETIMEFROMPARTS(2022,11,22,10,33,55,123),
DATETIMEOFFSETFROMPARTS(2022,11,22,10,33,55,1234,1,30,7),
SMALLDATETIMEFROMPARTS(2022,11,22,10,33),
TIMEFROMPARTS(10,33,55,1234,7);

select
CONVERT(datetime,'2021-11-22') - CONVERT(datetime,'2017-06-21') as Zwyk³a_ro¿nica_dat,
CONVERT(int,CONVERT(datetime,'2021-11-22')-CONVERT(datetime,'2017-06-21')) as Konwersja_daty,
CONVERT(int,CONVERT(datetime,'1900-01-01')) as Pocz¹tek,
CONVERT(float,CONVERT(datetime,'2017-09-01 13:22:11')-CONVERT(datetime,'2017-06-21 14:44:00')) * 86400 as Ro¿nica_w_sekundach;*/
/*
select
datediff(yy,min(data_rozp),max(data_rozp))as lata,
datediff(mm,min(data_rozp),max(data_rozp))%12 as miesi¹ce,
datediff(dd,min(data_rozp),max(data_rozp))%365 as dni
from NOWA;

select convert(int,convert(datetime,max(data_rozp))-convert(datetime,min(data_rozp))) from NOWA;

select datediff(dd,min(data_rozp),max(data_rozp)) as dni from NOWA;*/
/*
select
dateadd(dd,-5,getdate()) as[5 dni wczeœniej],
dateadd(dd,5,getdate()) as[5 dni póŸniej],
dateadd(mm,-4,getdate()) as[4 miesi¹ce wczeœniej],
dateadd(yy,2,getdate()) as[2 lata póŸniej];
select
eomonth(getdate()) as ostatni_dzieñ,
eomonth(getdate(),-6) as odjêcie_miesiêcy,
SWITCHOFFSET('2020-12-07 10:57:53.00012345+00:01','+00:10') as zmiana_strefy,
TODATETIMEOFFSET(GETDATE(),'+00:10') as zmiana_formatu;*/

--select dateadd(dd,1,eomonth(getdate(),-1)) as 'Pierwszy dzieñ misi¹ca',eomonth(getdate()) as 'Ostatni dzieñ misi¹ca';

/*SELECT LEN(Nazwisko) as wynik_1, LEN(Imie) as wynik_2 FROM Nazwiska;
SELECT LOWER(Nazwisko) as ma³e_1, LOWER(Imie) as ma³e_2 FROM Nazwiska;
SELECT UPPER(Nazwisko) as du¿e_1, UPPER(Imie) as du¿e_2 FROM Nazwiska;
SELECT SUBSTRING(Nazwisko,1,5) as wynik_1, SUBSTRING('Ala ma kota',8,4) as wynik_2 FROM Nazwiska;
SELECT REPLACE(Nazwisko,'i','a') as wynik_1 FROM Nazwiska;
SELECT '                    Ala ma kota          ',LTRIM('                    Ala ma kota          '),RTRIM('                    Ala ma kota          ');
SELECT LEFT(Nazwisko,5) as wynik_1, RIGHT(Nazwisko,5) as wynik_2 FROM Nazwiska;
SELECT CHARINDEX('ski',Nazwisko) as wynik_1, CHARINDEX('o',Nazwisko,2) as wynik_2 FROM Nazwiska;
SELECT ASCII('¹'),ASCII('Ñ'),ASCII('5');
SELECT CHAR(ASCII('¹')),CHAR(ASCII('Ñ')),CHAR(ASCII('5'));
SELECT UNICODE('¹'),UNICODE('Ñ'),UNICODE('5');
SELECT space(10)+Nazwisko FROM Nazwiska;
SELECT Nazwisko, STUFF(Nazwisko,1,0,'vel') FROM Nazwiska;
SELECT Numer , CONCAT('Super pracownik - ',Imie,'',Nazwisko) as Laurka FROM Nazwiska WHERE Stanowisko<>'prezes'*
SELECT REVERSE(Nazwisko) FROM Nazwiska
SELECT Adres, PATINDEX('%[0-9][0-9]-[0-9][0-9][0-9]%',Adres) as Start,
SUBSTRING(Adres,PATINDEX('%[0-9][0-9]-[0-9][0-9][0-9]%',Adres),6) as KodPocztowy
FROM (SELECT '60-144 Poznañ' as Adres
UNION SELECT '60-186 Poznañ'
UNION SELECT '60-698 Poznañ'
UNION SELECT '60-144 Poznañ Jana Pawa³a III') as Adres
BEGIN
DECLARE @liczba INT;
SET @liczba = ROUND(RAND()*100,0)
IF(@liczba<=66)
	IF(@liczba<=33) SELECT 'Wylosowana liczba jest pomiêdzy 0 a 33'as wynik,@liczba as liczba;
	ELSE SELECT 'Wylosowana liczba jest pomiêdzy 34 a 55'as wynik,@liczba as liczba;
ELSE SELECT 'Wylosowana liczba jest pomiêdzy 67 a 100'as wynik,@liczba as liczba;
END*/

BEGIN
DECLARE
@Imie VARCHAR(20) = 'Jan',
@Nazwisko VARCHAR(20) = 'Kowal';
IF((SELECT COUNT(Numer) FROM  Nazwiska WHERE @Imie = Imie and @Nazwisko = Nazwisko) = 0)
INSERT INTO Nazwiska VALUES ((SELECT MAX(numer)+1 FROM Nazwiska),@Imie,@Nazwisko,'Klient',0,'HEl')
ELSE PRINT('Nie dodano nowej osoby');
END
BEGIN
IF((SELECT Numer as asd FROM  Nazwiska WHERE @Imie = Imie and @Nazwisko = Nazwisko) != null)
INSERT INTO Nazwiska VALUES ((SELECT MAX(numer)+1 FROM Nazwiska),@Imie,@Nazwisko,'Klient',0,'HEl')
END