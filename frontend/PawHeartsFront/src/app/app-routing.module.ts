import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClienteCreateComponent } from './cliente-create/cliente-create.component';
import { ClienteUpdateComponent } from './cliente-update/cliente-update.component';

const routes: Routes = [
  { path: 'cliente-create', component: ClienteCreateComponent },
  { path: 'cliente-update', component: ClienteUpdateComponent },
  // outras rotas
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }