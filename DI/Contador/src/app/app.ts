import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone:true,
  imports: [RouterOutlet],
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = "Contador";
  sueldos:number[]=[1600,1500,120];
  edad: number=18;
}
