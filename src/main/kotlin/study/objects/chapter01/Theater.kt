package study.objects.chapter01

class Theater(
    private val ticketSeller: TicketSeller,
) {

    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }

}

fun main(args: Array<String>) {
    val ticketSeller = TicketSeller(TicketOffice(10000L, mutableListOf(Ticket(1000L))))
    val theater = Theater(ticketSeller)

    val audience = Audience(Bag(1000L))

    theater.enter(audience)
}