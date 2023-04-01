**Book store using Angular Material**

This example code uses Angular Material's 
mat-card, mat-grid-list, mat-grid-tile,
mat-card-image, mat-card-header, mat-card-title, 
mat-card-subtitle, mat-card-content, 
mat-card-actions, mat-button, 
and currency pipe to create a simple book store layout. 
The data for the books is stored in an array of Book objects, which are defined in a separate file.

1. app.component.ts
2. app.component.html
3. app.component.ts

app.component.ts:

import { Component } from '@angular/core';
import { Book } from './book';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  books: Book[] = [
    {
      title: 'The Catcher in the Rye',
      author: 'J.D. Salinger',
      description: 'A classic novel about teenage angst and rebellion.',
      price: 9.99,
      image: 'https://images-na.ssl-images-amazon.com/images/I/81uRySq%2BM-L.jpg'
    },
    {
      title: 'To Kill a Mockingbird',
      author: 'Harper Lee',
      description: 'A Pulitzer Prize-winning novel about racial injustice in the Deep South.',
      price: 12.99,
      image: 'https://images-na.ssl-images-amazon.com/images/I/91PnCi5JGxL.jpg'
    },
    {
      title: '1984',
      author: 'George Orwell',
      description: 'A dystopian novel about government surveillance and control.',
      price: 8.99,
      image: 'https://images-na.ssl-images-amazon.com/images/I/71%2BZjXtJpTL.jpg'
    }
  ];
}


app.component.html

<mat-card>
  <mat-card-header>
    <mat-card-title>Book Store</mat-card-title>
  </mat-card-header>
  <mat-card-content>
    <mat-grid-list cols="3" rowHeight="450px">
      <mat-grid-tile *ngFor="let book of books">
        <mat-card>
          <img mat-card-image [src]="book.image">
          <mat-card-header>
            <mat-card-title>{{ book.title }}</mat-card-title>
            <mat-card-subtitle>{{ book.author }}</mat-card-subtitle>
          </mat-card-header>
          <mat-card-content>
            <p>{{ book.description }}</p>
          </mat-card-content>
          <mat-card-actions>
            <button mat-button color="primary">{{ book.price | currency }}</button>
            <button mat-button>Add to Cart</button>
          </mat-card-actions>
        </mat-card>
      </mat-grid-tile>
    </mat-grid-list>
  </mat-card-content>
</mat-card>

book.ts

export interface Book {
  title: string;
  author: string;
  description: string;
  price: number;
  image: string;
}

