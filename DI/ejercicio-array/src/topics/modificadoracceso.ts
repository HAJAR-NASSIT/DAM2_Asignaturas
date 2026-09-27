class Heroe1 {
    public nombre: string;
    private identidadSecreta: string;
    static equipo: string = "avengers"

    constructor(nombre: string , identidadSecreta:string){
    this.nombre=nombre;
    this.identidadSecreta=identidadSecreta;
}
}

const hereo = new Heroe1("Spider-Man", "Peter Parker")
console.log(hereo)
console.log(Heroe1.equipo) // static
