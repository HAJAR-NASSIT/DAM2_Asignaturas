interface Pasajero{
    nombre : string,
    hijos?:string[]
}
const pasajero1:Pasajero = {
    nombre: "Jorge"
}
const pasajero2:Pasajero ={
    nombre:"Felipe",
    hijos:["Natalia","Gabriel"]
}

function imprimirHijos(pasajero1:Pasajero,pasajero2:Pasajero){
    const len1=pasajero1.hijos?.length
    const len2=pasajero2.hijos?.length
    
    console.log("el numero de hijos del p1 " ,len1, "el numero de hijos del p2 " ,len2)
}
function imprimirHijos2(pasajero1:Pasajero,pasajero2:Pasajero){
    const len1 = pasajero1.hijos?.length || 0;
    const len2 = pasajero2.hijos?.length || 0;
    
    console.log("el numero de hijos del p1 " ,len1, "el numero de hijos del p2 " ,len2)
}
imprimirHijos(pasajero1,pasajero2)
imprimirHijos2(pasajero1,pasajero2)
