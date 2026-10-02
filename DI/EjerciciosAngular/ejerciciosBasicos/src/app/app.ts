import { Component, signal } from '@angular/core';
import { ContadorComponent2  } from './02.Contador/contador.component';
import { ContadorComponent3 } from './03.contador/contador3.component';

@Component({
  selector: 'app-root',
  standalone: true,
  styleUrl: './app.css',
  templateUrl: './app.html',
  imports:[ContadorComponent2,ContadorComponent3],
})
export class App {
  protected readonly title = signal('02-Contador');
}
