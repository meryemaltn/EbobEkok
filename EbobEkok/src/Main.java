import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     int ebob = 0;
	     System.out.print("1. Sayýyý giriniz: ");
	     int n1 = scan.nextInt();
	     System.out.print("2. Sayýyý giriniz: ");
	     int n2 = scan.nextInt();
	     
	     int i = 1; 
	     while (i < n1)
	     {
	    	 if(n1 % i == 0 && n2 % i == 0) {
	    		 ebob = i;
	    		 }
	    	 i++;
	     }
	     
	     System.out.println("Ebob = " + ebob);
	
	     int ekok = 0;
	     int j = n1*n2 ;
	     while (j > 0)
	     {
	    	if(j % n1 == 0 && j % n2 == 0) {
               ekok = j;
           }
	    	j--;
       }
	     System.out.println("Ekok = " + ekok);
	     }
}