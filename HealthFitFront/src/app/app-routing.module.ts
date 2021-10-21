import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SignUpComponent} from "./sign-up/sign-up.component";
import {SignInComponent} from "./sign-in/sign-in.component";
import {MacroModelComponent} from "./macro-model/macro-model.component";

const routes: Routes = [
  {path: 'sign-up', component:SignUpComponent},
  {path: 'sign-in', component:SignInComponent},
  {path: 'macroMod', component:MacroModelComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
