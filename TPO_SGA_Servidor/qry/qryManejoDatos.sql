delete from Lotes
DBCC CHECKIDENT (lotes, RESEED, 0) --resetear autoincrement a 1
select * from lotes

delete from articulos 
DBCC CHECKIDENT (articulos, RESEED, 0) --resetear autoincrement a 1
select * from articulos

delete from clientes
DBCC CHECKIDENT (clientes, RESEED, 0) --resetear autoincrement a 1
select * from clientes

delete from ubicaciones
DBCC CHECKIDENT (ubicaciones, RESEED, 0) --resetear autoincrement a 1
select * from ubicaciones



select * from articulos;
select * from ubicaciones;
select * from lotes;

-- Ubicacaciones de los 3 lotes del articulo 1
update ubicaciones set cantLibre=800, codLote = 1 where nroUbicacion = 1 
update ubicaciones set cantLibre=800, codLote = 2 where nroUbicacion = 2
update ubicaciones set cantLibre=900, codLote = 3 where nroUbicacion = 3 


-- Ubicacaciones de los 2 lotes del articulo 2
update ubicaciones set cantLibre=750, codLote = 4 where nroUbicacion = 4
update ubicaciones set cantLibre=750, codLote = 5 where nroUbicacion = 5

-- Ubicacaciones de 1 lote del articulo 3
update ubicaciones set cantLibre=500, codLote = 6 where nroUbicacion = 6

-- Ubicacaciones de 1 lote del articulo 4
update ubicaciones set cantLibre=500, codLote = 7 where nroUbicacion = 7

-- Ubicacaciones de 1 lote del articulo 5
update ubicaciones set cantLibre=500, codLote = 8 where nroUbicacion = 8

-- Ubicacaciones de 1 lote del articulo 6
update ubicaciones set cantLibre=500, codLote = 9 where nroUbicacion = 9

-- Ubicacaciones de 1 lote del articulo 7
update ubicaciones set cantLibre=500, codLote = 10 where nroUbicacion = 10

-- Ubicacaciones de 1 lote del articulo 8
update ubicaciones set cantLibre=500, codLote = 11 where nroUbicacion = 11