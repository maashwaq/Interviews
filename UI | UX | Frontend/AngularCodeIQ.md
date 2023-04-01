Angular code interview questions for experienced developers:

Write a code snippet to create a simple Angular component that displays a greeting message.

import { Component } from '@angular/core';

@Component({
  selector: 'app-greeting',
  template: '<h1>Hello, {{name}}!</h1>',
})
export class GreetingComponent {
  name = 'World';
}

Write a code snippet to create a form in Angular that allows users to input their name and email address.

import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
})
export class UserFormComponent {
  userForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.userForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
    });
  }

  onSubmit() {
    if (this.userForm.valid) {
      console.log(this.userForm.value);
    }
  }
}

<form [formGroup]="userForm" (ngSubmit)="onSubmit()">
  <label for="name">Name:</label>
  <input type="text" id="name" formControlName="name">

  <label for="email">Email:</label>
  <input type="email" id="email" formControlName="email">

  <button type="submit">Submit</button>
</form>

Write a code snippet to create a custom directive in Angular that changes the background color of an element when it is clicked.

import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
})
export class HighlightDirective {
  constructor(private el: ElementRef) {}

  @HostListener('click') onClick() {
    this.el.nativeElement.style.backgroundColor = 'yellow';
  }
}

Write a code snippet to create a service in Angular that fetches data from an API and returns an observable.

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class DataService {
  constructor(private http: HttpClient) {}

  getData(): Observable<any> {
    return this.http.get('https://api.example.com/data');
  }
}

Write a code snippet to create a resolver in Angular that fetches data from an API before navigating to a route.

import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot } from '@angular/router';
import { DataService } from './data.service';

@Injectable({
  providedIn: 'root',
})
export class DataResolver implements Resolve<any> {
  constructor(private dataService: DataService) {}

  resolve(route: ActivatedRouteSnapshot) {
    return this.dataService.getData();
  }
}
