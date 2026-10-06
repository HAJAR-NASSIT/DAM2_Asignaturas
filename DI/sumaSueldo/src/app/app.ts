import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-mi-input',
  standalone:true,
  imports:[FormsModule],
  templateUrl: './app.html',
})
export class App {
  protected readonly title = "Bienvenido a Contador App";
  inputUsuario :string='';
  inputEdad:number=0;
  inputSueldos:number=0;
}
