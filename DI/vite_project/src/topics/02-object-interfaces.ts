// 1. Declarar el array de habilidades
const habilidades:string[] = ['Bash','Counter','Healing'];
// 2. Crear la interfaz
interface Personaje {
    nombre:string;
    hp:number;
    habilidades:string[];
    puebloNatal?:string; // El signo '?' la hace opcional
}
// 3. Crear la constante personaje siguiendo la interfaz
const personaje: Personaje = {
    nombre:'hajar',
    hp:22,
    habilidades:['creativa','artista','guapa']
};
// 4. Añadir posteriormente la propiedad opcional
   personaje.puebloNatal = 'Pueblo Paleta';
// 5. Mostrar la información por consola
console.table(personaje);// Te creará una tabla visual preciosa en el navegador
console.log(personaje);

//No, el navegador no entiende TypeScript directamente. Los navegadores (como Chrome, Edge, Safari o Firefox) solo saben leer y ejecutar código JavaScript clásico.