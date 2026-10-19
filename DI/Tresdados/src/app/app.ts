import { Component } from '@angular/core';
// Importamos la clase 'Dado' apuntando a la ruta correcta sin extensión .ts
import { Dado } from './dado/dado';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Dado], // Registramos el componente hijo aquí
  templateUrl: './app.html', // Corregido: apunta a app.html
  styleUrl: './app.css', // Corregido: apunta a app.css
})
export class AppComponent {
  dado1: number = 1;
  dado2: number = 3;
  dado3: number = 5;
  resultado: string = '¡Haz clic en el botón para jugar!';

  tirarDados(): void {
    // Generamos números aleatorios del 1 al 6 para cada uno de los tres dados
    this.dado1 = Math.floor(Math.random() * 6) + 1;
    this.dado2 = Math.floor(Math.random() * 6) + 1;
    this.dado3 = Math.floor(Math.random() * 6) + 1;

    // Condición de victoria: los tres dados deben ser idénticos
    if (this.dado1 === this.dado2 && this.dado2 === this.dado3) {
      this.resultado = '¡Has ganado! 🎉';
    } else {
      this.resultado = 'Has perdido ❌ Inténtalo de nuevo.';
    }
  }
}

