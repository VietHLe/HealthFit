import { Component, OnInit } from '@angular/core';
import {UserModel} from "../classes/user-model";
import {AccountServiceService} from "../account-service.service";
import {FormArray, FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  constructor(private as: AccountServiceService) {}
  hide = true;

  newAccount = new UserModel();
  myForm: any = {};
  name !: string;


  ngOnInit(): void {}
  onAddAccount(n: number) {
    console.log(n);
    console.log('Account Name: ' + this.newAccount.accName);
    console.log('Email: ' + this.newAccount.email);
    console.log('Password: ' + this.newAccount.password);
    console.log('Account Role: ' + this.newAccount.role);
    this.addAccount();
    console.log(this.newAccount);
  }
  addAccount() {
    this.as.signUp(this.newAccount).subscribe((res:any) => console.log(res));
  }

  onSubmit(myForm:any): void {
    console.log(JSON.stringify(myForm.value));
  }

}
// import { Component, OnInit } from '@angular/core';
// import { FormControl, Validators } from '@angular/forms';



