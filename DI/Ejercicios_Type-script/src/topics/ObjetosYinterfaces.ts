// 1. Interfaz para representar la dirección externa
interface Direccion {
    calle: string;
    pais: string;
    ciudad: string;
}

// 2. Interfaz principal SuperHeroe con el objeto anidado y el método
interface SuperHeroe {
    nombre: string;
    edad: number;
    direccion: Direccion;
    mostrarDireccion: () => string; // Función anónima sin parámetros que devuelve un string
}

// 3. Creación del objeto superHeroe con los datos exactos del enunciado
const superHeroe: SuperHeroe = {
    nombre: 'Spiderman',
    edad: 30, // Edad actualizada a 30 según el enunciado
    direccion: {
        calle: 'Main St',
        ciudad: 'NY', // Ciudad actualizada a NY
        pais: 'USA'
    },
    // 4. Implementación del método utilizando 'this' para acceder a las propiedades
    mostrarDireccion() {
        return `${this.nombre}, ${this.direccion.ciudad}, ${this.direccion.pais}`;
    }
};

// 5. Guardar el resultado en la constante 'direccion' y mostrarlo por consola
const direccion: string = superHeroe.mostrarDireccion();
console.log(direccion); 
// Imprime en consola: Spiderman, NY, USA
