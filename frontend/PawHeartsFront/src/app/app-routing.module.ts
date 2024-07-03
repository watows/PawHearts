import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { AnimalRegistrationComponent } from './animal-registration/animal-registration.component';
import { AnimalSearchComponent } from './animal-search/animal-search.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'register-user', component: UserRegistrationComponent },
  { path: 'add-pet', component: AnimalRegistrationComponent },
  { path: 'search-pet', component: AnimalSearchComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
