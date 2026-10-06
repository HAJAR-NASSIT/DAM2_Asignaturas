import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
selector: 'app-contador3',          //  Esta será la etiqueta HTML para usarlo
standalone: true,  
imports:[FormsModule],                //  Obligatorio en Angular moderno
templateUrl: './contador3.component.html' // Enlace a tu vista
})
export class ContadorComponent3 {
// Convertimos el número a un Signal para que sea ultra reactivo
numero = signal<number>(10);

// Esta será la base que el usuario modificará desde la pantalla
base: number = 5;

sumar() {
// Usamos .update() para sumarle la base actual de forma reactiva
this.numero.update((valorActual: number) => valorActual + this.base);
}

restar() {
// Usamos .update() para restarle la base actual
this.numero.update((valorActual: number) => valorActual - this.base);
}
}