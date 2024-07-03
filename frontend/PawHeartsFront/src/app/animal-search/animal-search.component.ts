import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-animal-search',
  templateUrl: './animal-search.component.html',
  styleUrls: ['./animal-search.component.css']
})
export class AnimalSearchComponent {
  searchTerm: string = '';
  animals: any[] = [];

  constructor(private apiService: ApiService) {}

  onSearch() {
    this.apiService.searchAnimals(this.searchTerm).subscribe(response => {
      this.animals = response;
    }, error => {
      console.error('Erro ao pesquisar animais', error);
    });
  }
}