import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent {
  user: any = {};

  constructor(private apiService: ApiService) {}

  onSubmit() {
    this.apiService.registerUser(this.user).subscribe(response => {
      console.log('Usuário registrado com sucesso:', response);
    });
  }
}