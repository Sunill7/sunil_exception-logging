package epam4;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleIntrestCompoundIntrest {
	private static final Logger L=LogManager.getLogger(SimpleIntrestCompoundIntres.class);
	public static void main(String[] args)
	{
		Scanner w=new Scanner(System.in); 
		L.info("enter amount:");
		double principal_amount=w.nextDouble();
		L.info("enter intrest rate:");
		double interest=w.nextDouble();
		L.info("enter no of years:");
		int time=w.nextInt();
		double simple_intrest,compound_intrest;
		simple_intrest=principal_amount*time*(interest/100);
		compound_intrest=principal_amount*(Math.pow(1+(interest/100),time))-principal_amount;
		L.info("calculated Simple Intrest is:%.2f\n",simple_intrest);
		L.info("calculated Compound Intrest is:%.2f\n",compound_intrest);
	}
}
