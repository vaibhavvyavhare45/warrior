package com.warrior.abstraction.mutlipleindimond;


class Bank implements ModelInterface
{
	public void cashier()
	{
	    System.out.print("\n\n\t This method for Cash related transaction.");
	}
	public void newAccount()
	{
	    System.out.print("\n\n\t This method for New Account Creation.");
	}
	public void goldLoan()
	{
	}
}

class Finance implements ModelInterface
{
	public void personalLoan()
	{
	    System.out.print("\n\n\t Personal  loan  hereeeeeeeeeee.");
	}
	public void goldLoan()
	{
	    System.out.print("\n\n\t Old is Gold, but will give loan on only Gold.");
	}
	public void newAccount() { } 
}

interface ModelInterface
{
	public void newAccount();
	public void goldLoan();
}

public class aaa
{
   public static void main(String ar[] )
   {
	System.out.print("\n\n\t ******** SHRIRAM BANK LTD. ******* ");
	
	    ModelInterface   m  = new Bank();
		                m.newAccount();

			m = new Finance();
		                 m.goldLoan();	
	
   }
}








