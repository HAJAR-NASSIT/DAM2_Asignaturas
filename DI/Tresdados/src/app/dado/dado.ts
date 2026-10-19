import { Component, Input } from '@angular/core';

@Component({
  imports: [],
  standalone: true,
  selector: 'app-dado',
  styleUrl: './dado.css',
  templateUrl: './dado.html',
})
export class Dado {
  @Input() valor: number = 1;
}
