// src/app/cliente-update/cliente-update.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-cliente-update',
  templateUrl: './cliente-update.component.html',
  styleUrls: ['./cliente-update.component.css']
})
export class ClienteUpdateComponent {
  cliente = {
    usuario: '',
    senha: ''
  };

  updateCliente() {
    // Lógica para atualizar o cliente
    console.log('Cliente atualizado:', this.cliente);
  }
}

