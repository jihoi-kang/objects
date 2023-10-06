package study.objects.chapter01

class TicketOffice(
    private var amount: Long,
    private var tickets: MutableList<Ticket> = mutableListOf(),
) {

    fun sellTicketTo(audience: Audience) {
        val paidAmount = audience.buy(getTicket())
        plusAmount(paidAmount)
    }

    private fun getTicket(): Ticket {
        return tickets.removeFirst()
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

}