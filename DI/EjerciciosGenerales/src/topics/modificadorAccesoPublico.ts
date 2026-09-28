class Heroe{
    public alterEgo : string;
    public edad  : number;
    public nombreReal : string;

    constructor(alterEgo: string,edad : number,nombreReal:string ){
        this.alterEgo=alterEgo;
        this.edad=edad;
        this.nombreReal=nombreReal
    }

}
const ironman = new Heroe("Spider-Man", 23, "Peter Parker")
console.log(ironman)