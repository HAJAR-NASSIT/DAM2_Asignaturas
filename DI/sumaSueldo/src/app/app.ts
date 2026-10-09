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
  inputNombre : string='Jorge';
  inputEdad: number=18;
  inputSueldos: number[] =[4000, 12000, 125]
  sumaSueldo1: number = 0;
  sumaSueldo2: number = 0;
  esActivo: boolean = true;


  constructor(){
    this.calcularSumarFor();
    this.calcularSumarForeach();
  }

  calcularSumarFor(){
    let total =0;
      for(let i =0; i<this.inputSueldos.length;i++){
          total+=this.inputSueldos[i];
        }
        this.sumaSueldo1=total;
  }
  calcularSumarForeach(){
    let total = 0;
    this.inputSueldos.forEach(sueldo => total+=sueldo );
    this.sumaSueldo2=total;
  }
  
}
