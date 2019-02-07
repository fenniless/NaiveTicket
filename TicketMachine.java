/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private int score;
    private int status;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        
        
    }
    
        public TicketMachine()
    {
        price = 500;
        balance = 0;
        total = 0;
    }
    

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    /**
     * Return the total.
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        if (balance >= price){
        
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        
         // Update the total collected with the balance.
        total = total + balance;
        // Clear the cost out of the balance
        balance = balance - price;
    }
    else {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# INSUFICIENT");
        System.out.println("# FUNDS");
        System.out.println("# I REQUIRE");
        System.out.println("# MORE CURRENCY");
        System.out.println("##################");
        System.out.println();

    }
    
    
    }
    /**
       * Increase score by the given number of points.
     */
    public void increase(int points)
    {
        points = points + score;   
    }
    
    /**
       * Reduce price by the given amount.
     */
    public void discount(int amount)
    {
        price = price - amount;
    }
    
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
        
    }
    
    public void showPrice()
    {
        System.out.println("The ticket costs: " + price + " cents.");
        
    }
    
    public void empty()
    {
         total = total * 0;
        
    }
    
}
