package game.getticket;

import java.util.Arrays;
import java.util.Random;

public class TicketGenerator
{
	public int[][] getTicket()
	{
		Random rand = new Random();
		int min=1, max=9, noOfRows = 3, noOfCols= 9;
		int[][] number = new int[noOfRows][noOfCols];

		for(int i=0; i<noOfCols; i++)
		{
			if(i!=0)
			{
				min = max+1;
				max += 10;
			}
			//System.out.println("cols " +i);

			for(int j=0; j<noOfRows ;j++)
			{
				int[] randomNos = getRandomNumber(min,max);
				int rn = randomNos[(rand.nextInt(randomNos.length))];

				if(!Arrays.deepToString(number).contains(rn+ " ")) {
					number[j][i] = rn;
					//System.out.println(number[j][i]);
				}
				else {
					j--;
					//System.out.println(number[j][i]+ " ");
				}
			}
		}

		for(int i=0; i<noOfRows;i++)
		{
			String noSpace = "4";

			int noOfSpaces = Character.getNumericValue(noSpace.charAt(rand.nextInt(noSpace.length())));
			//System.out.println("noSpace " +noOfSpaces);
			int oldIndex =0;
			for(int k=1;k<noOfSpaces;k++)
			{
				int newIndex = rand.nextInt(9);
				if(oldIndex != newIndex || k==0 ){
					//System.out.println(i+ "newIndex" +newIndex);
					oldIndex = newIndex;
					number[i][newIndex] = 0;
				}
				else {
					k--;
				}
			}
		}
		return number;
		//System.out.println("Ticket " +Arrays.deepToString(number));
	}

	public int[] getRandomNumber(int min, int max) {
		//System.out.println(min+ " " +max);
		int[] randomNos;

		if(min==1) {
			randomNos = new int[9];
		}
		else if(min ==80) {
			randomNos = new int[11];
			max = max+1;
		}
		else {
			randomNos = new int[10];
		}
		int j=0;

		for(int i=min; i<=max; i++){
			randomNos[j] =i;
			j++;
		}
		//System.out.println("Random no: " +Arrays.toString(randomNos));
		return randomNos;

	}
}



