function devolver<T>(valor: T): T {
    return valor;
}

const texto = devolver("Hola");
const numero = devolver(25);
const activo = devolver(true);
const frutas = devolver(["manzana", "plátano", "pera"]);

// Tipo genérico indicado explícitamente:
const ciudad = devolver<string>("Bilbao");

console.log(texto);
console.log(numero);
console.log(activo);
console.log(frutas);
console.log(ciudad);