import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule,Routes} from '@angular/router';
import {FormsModule} from '@angular/forms';
//  import { CHILD_ROUTES } from './main/main.component';
import { ReactiveFormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FoodItemsComponent } from './food-items/food-items.component';
import { ViewmenuComponent } from './viewmenu/viewmenu.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { MainComponent } from './main/main.component';
import { QuantityComponent } from './quantity/quantity.component';
import { AdmininfoComponent } from './admininfo/admininfo.component';
import { PendingorderComponent } from './pendingorder/pendingorder.component';
import { OrderhistoryComponent } from './orderhistory/orderhistory.component';
import { EmployeeinfoComponent } from './employeeinfo/employeeinfo.component';
import { CartComponent } from './cart/cart.component';
import { EmporderhistoryComponent } from './emporderhistory/emporderhistory.component';
 
const routes:Routes=[

 
  {path:'', component:HomeComponent},
  {path:'app-login', component:LoginComponent},
  {path:'app-quantity', component:QuantityComponent},
  {path:'app-main', component:MainComponent,
    children :[
      {path:'app-admininfo', component:AdmininfoComponent},
      {path:'app-pendingorder', component:PendingorderComponent},
      {path:'app-food-items', component:FoodItemsComponent},
      {path:'app-orderhistory', component:OrderhistoryComponent},
      {path:'app-employeeinfo', component:EmployeeinfoComponent},
      {path:'app-cart', component:CartComponent},
      {path:'app-home', component:HomeComponent}
      
    ]
  }
 
  
];




@NgModule({
  declarations: [
    AppComponent,
    FoodItemsComponent,
    ViewmenuComponent,
    HomeComponent,
    LoginComponent,
    MainComponent,
    QuantityComponent,
    AdmininfoComponent,
    PendingorderComponent,
    OrderhistoryComponent,
    EmployeeinfoComponent,
    CartComponent,
    EmporderhistoryComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
