package ticket;

public class TicketInfo {

    static String ticket;

    static boolean isLucky (String ticket){
        String[] theTicket = ticket.split(" ");
        if (theTicket.length == 6) {
            int a = Integer.parseInt(theTicket[0]);
            int a1 = Integer.parseInt(theTicket[1]);
            int a2 = Integer.parseInt(theTicket[2]);
            int b = Integer.parseInt(theTicket[3]);
            int b1 = Integer.parseInt(theTicket[4]);
            int b2 = Integer.parseInt(theTicket[5]);
            int firstHalf = a + a1 + a2;
            int secondHalf = b + b1 + b2;

            return firstHalf == secondHalf;
        } else {
            return false;
        }
    }



}
