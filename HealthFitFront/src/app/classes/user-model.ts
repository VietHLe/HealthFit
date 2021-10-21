import {Role} from "./role";

export class UserModel {
  userId !: number;
  userFName !: String;
  userLName !: String;
  accName !: String;
  email !: String;
  password !: String;
  advice !: String;
  role !: Role[];
}
