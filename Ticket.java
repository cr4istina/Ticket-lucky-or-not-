package ticket;

public class Ticket {
    public static void main(String[] args) {


        System.out.println("When you have a ride with trolleybus in Chisinau, you get a ticket!");
        System.out.println("There are two types of ticket: Lucky and, obviously, not Lucky");
        System.out.println("Check it now!");

        System.out.println(TicketInfo.isLucky("156432"));

        System.out.println("You can read the answer above, true - means the ticket is LUCKY!");
        System.out.println("false - sorry! Try again :) ");



    }
}
