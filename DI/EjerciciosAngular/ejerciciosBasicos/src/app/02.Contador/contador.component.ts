import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-contador2',          //  Esta será la etiqueta HTML para usarlo
  standalone: true,                  //  Obligatorio en Angular moderno
  templateUrl: './contador.component.html' // Enlace a tu vista
})
export class ContadorComponent2 {
  // Tu lógica del ejercicio
numero: number = 10;

sumar() {
    this.numero += 1;
}

restar() {
    this.numero -= 1;
}
}