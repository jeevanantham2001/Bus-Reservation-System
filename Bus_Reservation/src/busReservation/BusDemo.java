package busReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
	
	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();	
		
		buses.add(new Bus(1,true,40));
		buses.add(new Bus(2,false,48));
		buses.add(new Bus(3,true,2));
		
		int user_input=1;	
		Scanner sc=new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(user_input==1){
			System.out.println("Enter 1 to Book  and 2 to exit");
			user_input=sc.nextInt();		       
				if(user_input==1) {
		    	   System.out.println("Booking...");
		       }
				if(user_input==1) {
					Booking booking=new Booking();
					if(booking.isAvailable(bookings,buses)) {
						bookings.add(booking);
						System.out.println("Your booking is confirmed");
					}
					else {
						System.out.println("Sorry bus is full. Try Another bus or date.");
					}
				}
		}
	}
	
  
	
  
  	
}
