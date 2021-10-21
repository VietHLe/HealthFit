import { Component, OnInit } from '@angular/core';
import {AccountService} from "../classes/account-service";
import {UserModel} from "../classes/user-model";

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  constructor(private as: AccountService) {}
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
    this.as.signUp(this.newAccount).subscribe((res) => console.log(res));
  }

  onSubmit(): void {
    // this.submitted = true;
    // console.log('Email: ' + this.signin);
    // // console.log('Password: ' + this.signin.Password);
    // this.signIn(this.signin);
    alert(this.name);
  }

}
// import { Component, OnInit } from '@angular/core';
// import { FormControl, Validators } from '@angular/forms';



