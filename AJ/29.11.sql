/*
PRINT 'Krok 1.Pocz�tek'
GOTO Krok3;
PRINT 'Krok 2. To nie zostanie wy�wietlone.';
Krok3:
PRINT 'Krok 3.Koniec.';

PRINT 'Krok 1. Wykonany';
GO
DECLARE @delay nvarchar(8);
SELECT @delay =N'00:00:05';
WAITFOR DELAY @delay;
PRINT 'Krok 2. wykonany pi�� sekund p�niej';

START:
DECLARE @Rand int = ABS(CHECKSUM(NEWID()) % 10)+1;
declare @c varchar = CAST(@Rand as varchar);
raiserror(@c, 0, 1) with nowait;
WAITFOR DELAY @Rand;
GOTO START
*/

SELECT Pensja, CASE Pensja WHEN 2900 THEN 'Pensja r�wna 2900' WHEN  4500 THEN 'Pensja r�wna 4500' ELSE 'Inna pensja' END AS 'Komentarz' FROM Nazwiska

SELECT Pensja, CASE
WHEN  Pensja<3000 THEN 'Pensja mniejsza od 3k' 
WHEN Pensja >=3000 and Pensja <=6000 THEN 'Pensja mi�dzy 3k a 6k'
WHEN Pensja >6000 THEN 'Pensja wi�ksza od 6k'
ELSE 'Pensja nieznana' END AS 'Komentarz' FROM Nazwiska