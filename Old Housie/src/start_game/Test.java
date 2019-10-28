package start_game;

import java.util.Arrays;

import game.getticket.TicketGenerator;

public class Test {
	public static void main(String[] args) {
		TicketGenerator ticket = new TicketGenerator();
		int[][] number = ticket.getTicket();
		for(int[] val : number) {
			System.out.println(Arrays.toString(val));
		}
	}

}
