// src/app/cliente-create/cliente-create.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-cliente-create',
  templateUrl: './cliente-create.component.html',
  styleUrls: ['./cliente-create.component.css']
})
export class ClienteCreateComponent {
  cliente = {
    usuario: '',
    senha: ''
  };

  createCliente() {
    // Lógica para criar o cliente
    console.log('Cliente criado:', this.cliente);
  }
}
