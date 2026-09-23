/* Crea un programa en TypeScript que modele productos mediante interfaces y calcule el Impuesto Sobre Ventas (ISV) a partir de un arreglo de artículos.

El programa debe cumplir los siguientes requisitos:

Definir una interfaz Producto con las propiedades:

descripcion (string)

precio (number)

Crear dos objetos que implementen la interfaz Producto, representando:

Un teléfono

Una tableta

Declarar una función calculaISV que:

Reciba un arreglo de productos.

Sume los precios de todos los elementos.

Devuelva el 15% del total (ISV).

Crear un arreglo llamado articulos que contenga los productos definidos.

Llamar a la función calculaISV pasando el arreglo como argumento.

Mostrar por consola el valor del ISV calculado. */


interface Producto{
    descripcion : string;
    precio : number;
}
const teléfono : Producto = {
    descripcion : "TPHONE",
    precio : 140
}
const tableta : Producto = {
     descripcion : "TPHONE",
    precio : 140
}

const calculaISV = (productos:Producto[]) => 


