package com.gl.algo.currency;
import java.util.Scanner;

public class Denomination {

	Scanner input;
	private int [] denomination;
	private int payAmount;
	private int sizeOfDenomination;
	
	public Denomination()
{
	input = new Scanner(System.in);
}
	public void userInput() 
{
	System.out.println("Enter the size of currency denominations ");
	sizeOfDenomination = input.nextInt();
	denomination = new int [sizeOfDenomination];
	System.out.println("Enter the currency denominations value ");
	for (int i=0; i<sizeOfDenomination; i++) 
{
	denomination [i] = input.nextInt();
}
	System.out.println("Enter the amount you want to pay ");
	payAmount = input.nextInt();
}

	public void getOutput()
{
	CurrencyDenomination curdenom = new CurrencyDenomination(denomination, payAmount);
	curdenom.curdenomination();
	}
}
