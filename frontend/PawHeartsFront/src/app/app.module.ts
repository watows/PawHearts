import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';  // Importar FormsModule
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClienteCreateComponent } from './cliente-create/cliente-create.component';
import { ClienteUpdateComponent } from './cliente-update/cliente-update.component';

@NgModule({
  declarations: [
    AppComponent,
    ClienteCreateComponent,
    ClienteUpdateComponent,
    // outros componentes
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule  // Adicionar FormsModule aos imports
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
