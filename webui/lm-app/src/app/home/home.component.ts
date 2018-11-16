import { Component, OnInit } from '@angular/core';
// import {RouterModule,Routes} from '@angular/router';
import { Router } from '@angular/router';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

 
  constructor(private router:Router) {
    this.router=router;
  }

  ngOnInit() {
  }
  homeMethod(){
    console.log("Hello");

    this.router.navigate(['app-quantity']);
  }
}
