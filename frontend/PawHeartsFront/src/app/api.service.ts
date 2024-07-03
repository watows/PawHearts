import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  registerUser(user: any): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });
    return this.http.post(`${this.baseUrl}/users`, JSON.stringify(user), { headers });
  }

  registerAnimal(animal: any): Observable<any> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });
    return this.http.post(`${this.baseUrl}/animals`, JSON.stringify(animal), { headers });
  }

  searchAnimals(term: string): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}/animals/search?term=${term}`);
  }
}