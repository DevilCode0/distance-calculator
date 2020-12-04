import java.util.Scanner;
public class distance {

	public static void main(String[] args) {
		String cityN[]=
			{"Riyadh","Mecca","Jeddah","Dammam"};
		double coord[][]= {
				{24.7136,46.6753},//Riyadh
				{21.3891,39.8579},//Mecca
				{21.4858,39.1925},//Jeddah
				{26.4207,50.0888},//Dammam
				};
		
		///////////////////////////////

		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		for (int i = 0; i < cityN.length; ++i)
		System.out.println((i+1)+" "+cityN[i]);
		System.out.println("Calculate distance from where");
		System.out.println("Enter city number");
		num1 =(input.nextInt())-1;
		
		for (int i = 0; i < cityN.length; ++i)
		System.out.println((i+1)+" "+cityN[i]);
		System.out.println("to where");
		System.out.println("Enter city number");
		num2 =(input.nextInt())-1;

		///////////////////////////////
		
		distanceCAL(coord[num1][0],coord[num1][1],coord[num2][0],coord[num2][1],
				cityN[num1],cityN[num2]);
	}
	
		///////////////////////////////
			  static void distanceCAL(Double N1,Double E1,Double N2,Double E2,String name1,String name2) {
	Double n1 = N1 * Math.PI/180;
	Double n2 = N2 * Math.PI/180;
	Double l1 = (N2-N1) * Math.PI/180;
	Double l2 = (E2-E1) * Math.PI/180;

	Double a = Math.sin(l1/2) * Math.sin(l1/2) +
          Math.cos(n1) * Math.cos(n2) *
          Math.sin(l2/2) * Math.sin(l2/2);
	Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

	Double d = (6371e3 * c)/1000; // in KM

System.out.println("the distance between "+name1+" and "+name2+" is "+Math.round(d));
	}

}
