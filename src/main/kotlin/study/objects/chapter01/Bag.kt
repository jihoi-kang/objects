package study.objects.chapter01

class Bag(
    private var amount: Long = 0,
    private var invitation: Invitation? = null,
) {
    private var ticket: Ticket? = null

    fun hold(ticket: Ticket): Long {
        return if (hasInvitation()) {
            this.ticket = ticket
            0L
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            ticket.fee
        }
    }

    private fun hasInvitation() = invitation != null

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

}