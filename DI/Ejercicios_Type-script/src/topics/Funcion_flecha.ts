const resultado2 = (a:number,b:number): number => {
    return a+b;
}
const resultado3 = resultado2(1,4)
console.log(resultado3)


//
const multiplicar= (a:number, b?:number,c:number = 3): number => {
    return a*c;
}
const llamada1 = multiplicar(1,5)
console.log(llamada1);

const llamada2= multiplicar(1)
console.log(llamada2);

const llamada3= multiplicar(1,5,5)
console.log(llamada3);

const llamada4= multiplicar(1,undefined,undefined)
console.log(llamada4);
