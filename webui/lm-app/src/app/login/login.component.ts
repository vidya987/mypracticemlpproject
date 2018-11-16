import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { FormGroup, FormControl, FormArray, Validators, FormBuilder } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  userID: string;
  u1: string;
  title = 'Canteen Management System';
  constructor(private router: Router) { 
    this.router = router;
  }

  ngOnInit() {}
click(empId)	
{
   sessionStorage.setItem('empId',empId);
   console.log(empId);
  console.log("Hello");
  this.router.navigate(['app-main']);
}

onSubmit(f:NgForm){
  console.log("came here !!");
  
  let userID = f.value;
   let u1 = userID.userId;
   console.log("@@@@@@@");
   console.log(u1);
 console.log(userID);
 this.u1=u1;
 sessionStorage.setItem('u1',u1);
 console.log("Hello");
  this.router.navigate(['app-main']);
}


}




