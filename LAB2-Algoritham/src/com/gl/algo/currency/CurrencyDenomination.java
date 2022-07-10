package com.gl.algo.currency;

public class CurrencyDenomination {
	
	private int [] denomination;
	private int payAmount;
	private int [] resultDenominationArray;
	private int [] resultDenominationCountArray;
	
		public CurrencyDenomination (int [] Denomination, int payAmount) {
		this.denomination=Denomination;
		this.payAmount=payAmount;
		this.resultDenominationArray= new int [this.denomination.length];
		this.resultDenominationCountArray= new int [this.denomination.length];
	}
		public void curdenomination() 
	{

		bubbleSort(denomination);
		

		int balanceAmount=payAmount;

		int noOfDenomination=denomination.length;
		int index =0;
		int resultIndex =0;
		while (index<noOfDenomination) {

		int quotient = balanceAmount / denomination[index];
		int remainder = balanceAmount % denomination[index];
		
		if (quotient!=0) 
	{
		int temp = (quotient * denomination[index]);
		balanceAmount-=temp;
		resultDenominationArray[resultIndex] = denomination[index];
		resultDenominationCountArray[resultIndex++] = quotient;
		if(remainder == 0)
	{
		if (balanceAmount == 0)
	{
		printSuccessMessege(resultIndex);
		break;
		}	
	}
}

	else
	{
		if (remainder == 0)
	{
		break;
	}
}
		index++;
		}
	}
		
		public static void bubbleSort(int [] array) 
	{
		int length = array.length;
		int temp;
		for (int i=0; i<length; i++)
	{
		for (int j=1;j<(length-i); j++) 
	{
		if (array [j-1]<array[j]) 
	{
		temp=array [j-1];
		array [j-1]=array[j];
		array [j]=temp;
			}
		}
	}
}

		public void printSuccessMessege(int index) {
		System.out.println("Your payment approach in order to give min no of notes will be ");
		for (int i=0; i<index; i++) {
		System.out.println(resultDenominationArray[i] + " : "+ resultDenominationCountArray[i]);
		}
	}
}
		
