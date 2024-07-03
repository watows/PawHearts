import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-animal-registration',
  templateUrl: './animal-registration.component.html',
  styleUrls: ['./animal-registration.component.css']
})
export class AnimalRegistrationComponent {
  animal = {
    name: '',
    species: '',
    age: null,
    description: ''
  };

  constructor(private apiService: ApiService) {}

  onSubmit() {
    this.apiService.registerAnimal(this.animal).subscribe(response => {
      console.log('Animal registrado com sucesso!', response);
    }, error => {
      console.error('Erro ao registrar animal', error);
    });
  }
}