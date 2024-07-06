import { Component, OnInit } from '@angular/core';
import { ClientesService } from '../services/clientes.service';
import { Cliente } from '../models/cliente.model';

@Component({
  selector: 'app-clientes-list',
  templateUrl: './clientes-list.component.html',
  styleUrls: ['./clientes-list.component.css']
})
export class ClientesListComponent implements OnInit {
  clientes: Cliente[] = [];

  constructor(private clientesService: ClientesService) { }

  ngOnInit(): void {
    this.clientesService.getClientes().subscribe(clientes => {
      this.clientes = clientes;
    });
  }
}