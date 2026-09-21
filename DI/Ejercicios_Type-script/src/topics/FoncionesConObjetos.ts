interface PersonajeLOR {
    nombre:string
    pv:number
}

function curar(personaje:PersonajeLOR,cantidad:number):void{
    personaje.pv= personaje.pv+cantidad
}

const nuevoP:PersonajeLOR={
    nombre:"strider",
    pv:50
}
console.log(nuevoP);

curar(nuevoP,20)