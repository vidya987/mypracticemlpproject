import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { FormGroup, FormControl, FormArray, Validators, FormBuilder } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  private u1;
  private admin=false;
  constructor(private router: Router) { 
    this.router = router;
  }
  logout(){
    this.router.navigate(['app-login']);
  }

  ngOnInit() {
    this.u1 = sessionStorage.getItem("u1");
    console.log("Inside...main");
    console.log(this.u1);
    if(this.u1==1000){
     this.admin=true;
    }
    else{
      this.admin=false;
    }

  }



}
