import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { FormGroup, FormControl, FormArray, Validators, FormBuilder } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
@Component({
  selector: 'app-quantity',
  templateUrl: './quantity.component.html',
  styleUrls: ['./quantity.component.css']
})
export class QuantityComponent implements OnInit {
  loginForm: FormGroup;
  userID: string;
  q1: string;
  title = 'Canteen Management System';
  constructor(private router: Router) { 
    this.router = router;
  }

  ngOnInit() {
  }
  onSubmit(f:NgForm){
    console.log("came here !!");
    
    let quant = f.value;
     let q1 = quant.quant;
     console.log("@@@@@@@");
     console.log(q1);
   console.log(quant);
   this.q1=q1;
   sessionStorage.setItem('q1',q1);
   console.log("Hello");
    this.router.navigate(['app-login']);
  }
  
}
