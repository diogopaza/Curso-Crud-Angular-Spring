import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first, tap, delay } from 'rxjs/operators';

import { Course } from './../model/course';


@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  private readonly API = 'api/cursos';

   //chamada Ajax - assíncrona com o servidor
  constructor(private httpClient: HttpClient) {

   }

  list(){
    return this.httpClient.get<Course[]>(this.API)
    .pipe(
      first(),
     // delay(5000),
      tap(courses => console.log(courses))
    );
  }

  save(course: Partial<Course>){
   return this.httpClient.post<Course>(this.API,course).pipe(first());
  }
}
