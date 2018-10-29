import JwtDecode from 'jwt-decode'
export default class User {
  static from (token) {
    try {
      let obj = JwtDecode(token)
      return new User(obj)
    } catch (_) {
      return null
    }
  }

  constructor ({sub, iat, exp}) {
    this.userid = sub,
    this.iat = iat,
    this.exp = exp
  }

}