import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

export class AccountService {
  constructor(private http: HttpClient) {}

  // Data REST get methods
  private Url1 = 'http://localhost:8080/healthfit/auth';
  signUp(account: Object): Observable<Object>{
    return this.http.post(`${this.Url1}/signUp`,account)
  }
  signIp(account: Object): Observable<Object>{
    return this.http.post(`${this.Url1}/signIn`,account)
  }
}
