import { Component } from '@angular/core';

@Component({
  selector: 'app-animal-search',
  templateUrl: './animal-search.component.html',
  styleUrls: ['./animal-search.component.css']
})
export class AnimalSearchComponent {
  searchTerm: string = '';
}
