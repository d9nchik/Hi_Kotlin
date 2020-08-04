import java.util.*

fun parseCardNumber(cardNumber: String): Long {
    if(!cardNumber.matches(Regex("(\\d{4} ){3}\\d{4}")))
        throw InputMismatchException("Check data")
    return cardNumber.replace(" ", "").toLong()
}