/* Ejercicio  2 SQL 
1. Lista el nombre de todos los productos que hay en la tabla producto.
*/ 
Select   * from  producto;

/*
2. Lista los nombres y los precios de todos los productos de la tabla producto.
*/ 
Select  nombre, precio  from  producto;

/*
3. Lista todas las columnas de la tabla producto.
*/ 

Select  codigo, nombre, precio, codigo_fabricante  from  producto;

/*
4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando 
el valor del precio.
*/ 
Select  codigo, nombre, precio, round(precio) PREC_AJUSTADO, 
        codigo_fabricante  from  producto;
/*
5. Lista el código de los fabricantes que tienen productos 
en la tabla producto.
*/ 

Select  * from   Fabricante  FAB
where  ( select count(*) from Producto PROD
         Where  codigo_fabricante = FAB.Codigo ) > 0 
; 

# Control -------------------

Select  codigo, nombre, (select count(*) from Producto 
         Where  codigo_fabricante = FAB.Codigo) "CANTIDAD"
         from   Fabricante  FAB ;
         
/*
6. Lista el código de los fabricantes que tienen productos en la tabla 
producto, sin mostrar los repetidos
*/ 
 
Select  Distinct  Nombre 
from   Fabricante  FAB
where  ( select count(*) from Producto PROD
         Where  codigo_fabricante = FAB.Codigo ) > 0 
; 

/*
7. Lista los nombres de los fabricantes ordenados de forma ascendente.
*/ 

Select  codigo , Nombre  From   Fabricante 
Order by  Nombre ; 

/*
8. Lista los nombres de los productos ordenados en 
primer lugar por el nombre de forma 
ascendente y en segundo lugar por el 
precio de forma descendente.
*/ 
##  Dato para   probar el  DESC del order by 
Insert into   Producto (nombre,precio,codigo_fabricante) 
                values ("Disco SSD 1 TB", 100, 1); 

Select  codigo , Nombre , Precio  From   Producto
#Order by  Nombre  ASC , Precio ASC  ; 
Order by  Nombre  , Precio  ; 

/*
9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
*/ 

Select   * from Fabricante  limit 5; 

/*
10. Lista el nombre y el precio del producto más barato. 
(Utilice solamente las cláusulas  ORDER BY y LIMIT)
*/ 

# Opcion 1  
Select * from  Producto 
where  precio = ( Select  min(precio) from Producto ) ;

# Opcion 2 
Select  * from   Producto 
Order by  precio asc  limit 1  ;

/*11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER 
BY y LIMIT)  */ 

Select  * from   Producto 
Order by  precio DESC  limit 1  ;

Select * from  Producto 
where  precio = ( Select  max(precio) from Producto ) ;

/*
12. Lista el nombre de los productos que tienen un precio 
menor o igual a $120.
*/ 

Select * from  Producto 
where  precio <= 120 ;

/*
13. Lista todos los productos que tengan un precio entre $60 y $200. 
Utilizando el operador BETWEEN.
*/ 

Select * from  Producto 
where   precio Between 60 and 120 ; 


Select * from  Producto 
where   precio >= 60  
and     precio <= 120 ;
/*
14. Lista todos los productos donde el código de fabricante 
sea 1, 3 o 5. Utilizando el operador IN.*/

Select   * from Producto 
Where  Codigo_fabricante in (1,3,5);

Select   * from Producto 
Where  Codigo_fabricante  = 1 
 or    Codigo_fabricante  = 3
 or    Codigo_fabricante  = 5;
 
/*
15. Devuelve una lista con el nombre de todos los productos que contienen 
la cadena Portátil en el nombre.
*/ 

Select * from  Producto
Where   upper(nombre)  Like '%PORT%';




/*
Consultas Multitabla 
1. Devuelve una lista con el código del producto, nombre del producto, 
código del fabricante y nombre del fabricante, de todos los productos 
de la base de datos.
*/

Select   * from Fabricante ;
Select   * from  Producto ; 

Select   PROD.codigo  CDO_ART, PROD.Nombre  DESCRIPCION, Precio, 
         Codigo_fabricante ,
         FAB.NOMBRE FABRICANTE
from  Producto PROD 
join  Fabricante FAB  on PROD.Codigo_fabricante =  FAB.Codigo ; 
#Order by   FAB.NOMBRE;

/*
2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos 
los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por 
orden alfabético.
*/ 

Select   PROD.codigo  CDO_ART, PROD.Nombre  DESCRIPCION, Precio, 
         Codigo_fabricante ,
         FAB.NOMBRE FABRICANTE
from  Producto PROD 
join  Fabricante FAB  on PROD.Codigo_fabricante =  FAB.Codigo 
Order by   FAB.NOMBRE;
/*
3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, 
del producto más barato. */ 

Select   PROD.codigo  CDO_ART, PROD.Nombre  DESCRIPCION, Precio, 
         Codigo_fabricante ,
         FAB.NOMBRE FABRICANTE
from  Producto PROD 
join  Fabricante FAB  on PROD.Codigo_fabricante =  FAB.Codigo 
Where  PROD.precio = ( Select  min(Prod2.Precio) From  Producto PROD2 ) ;

/*
4. Devuelve una lista de todos los productos del fabricante Lenovo.
*/

Select  * from  Producto
Where  codigo_fabricante  = (Select FAB.codigo from Fabricante FAB
                             where  nombre = "Lenovo"
                            ) ; 

/*Select  * from  Producto
Where  codigo_fabricante  in (Select FAB.codigo from Fabricante FAB) ;*/ 

/*
5. Devuelve una lista de todos los productos del fabricante Crucial 
que tengan un precio mayor que $200.
*/ 

Select  * from  Producto
Where  codigo_fabricante  = (Select FAB.codigo from Fabricante FAB
                             where  nombre = "Crucial"
                            ) 
      and  precio > 200  ; 

/*
6. Devuelve un listado con todos los productos de los fabricantes Asus, 
Hewlett-Packard. 
Utilizando el operador IN.
*/ 

#Select  aa.codigo Cod_articulo, bb.codigo Cod_Proveedor  
Select   *  from  Producto AA
join  Fabricante  BB  on  aa.codigo_fabricante  = bb.codigo
Where  codigo_fabricante  in (Select FAB.codigo from Fabricante FAB
                             where  nombre in( "Asus","Hewlett-Packard")
                            )   ;

/*
7. Devuelve un listado con el nombre de producto, precio y 
nombre de fabricante, de todos los productos que tengan un 
precio mayor o igual a $180. Ordene el resultado en primer 
lugar por el precio (en orden descendente) 
y en segundo lugar por el nombre (en orden ascendente) */ 

Select   aa.Nombre DESCRIPCION, precio, BB.Nombre  FABRICANTE   
from  Producto AA
join  Fabricante  BB  on  aa.codigo_fabricante  = bb.codigo
where  precio >= 180 
order by  precio Desc, AA.Nombre  ;




