fun main() {

    val login = "admin"
    val correctPassword = "admin123"

    var username: String?
    var password: String?

    while (true) {
        print("Podaj login. ")
        username = readLine()!!
        print("Podaj hasło. ")
        password = readLine()!!

        if (login == username && correctPassword == password) {
            println("Poprawnie zalogowałeś się do systemu")
            break
        } else {
            println("Błędne login lub hasło, spróbuj ponownie")
        }
    }
}