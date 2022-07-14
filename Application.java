
public class Application {

	public static void main(String[] args) {
		
	//test Building class 
	Building b1=new Building("Simpsons House", "742 Evergreen Terrace Springfield, Kentucky 40069", 1950, "Residential", "R-1");
	System.out.println(b1.displayData());
	System.out.println();
	b1.draw();
	System.out.println();
	System.out.println(b1.toString());
	System.out.println();
	System.out.println("============================================================");
	System.out.println();
	//end test Building class
	
	
	//test Business class
	Business b2=new Business("Moe's Tavern", "1000 Evergreen Terrace Springfield, Kentucky 40069", 900, "Business", "B", 1);
	System.out.println(b2.displayData());
	System.out.println();
	b2.draw();
	System.out.println();
	System.out.println(b2.toString());
	System.out.println();
	System.out.println("============================================================");
	System.out.println();
	//end test Business class
	
	//test Mall class
	Mall m1=new Mall("Springfield Mall", "2222 Mall road, Springfield, Kentucky 40069", 50000, "Business", "B", 50, 35, 1000, 300);
	System.out.println(m1.displayData());
	System.out.println();
	m1.draw();
	System.out.println();
	System.out.println(m1.toString());
	System.out.println();
	System.out.println("============================================================");
	System.out.println();
	//end test Mall class
	
	//test Residential class
	Residential r1= new Residential("Flanders house", "744 Evergreen Terrace, Springfield, Kentucky 40069", 2200, "Residential", "R-1", 3, 2, true);
	System.out.println(r1.displayData());
	System.out.println();
	r1.draw();
	System.out.println();
	System.out.println(r1.toString());
	System.out.println();
	System.out.println("============================================================");
	System.out.println();
	//end test Residential class
	
	//test Apartment class
	Apartment a1= new Apartment("Village Apartments", "1212 Peachtree lane, Springfield, Kentucky 40069", 20000, "Residential", "R-1", true, 2, 1, 20, 1000, true);
	System.out.println(a1.displayData());
	System.out.println();
	a1.draw();
	System.out.println();
	System.out.println(a1.toString());
	System.out.println();
	System.out.println("============================================================");
	System.out.println();
	//end test Apartment class
	
	//test SingleFamilyHome class
	SingleFamilyHome s1= new SingleFamilyHome("Wiggums Family home", "732 Evergreen Terrace, Springfield, Kentucky 40069", 1750, "Residential", "R-1", 2, 1, true, true);
	System.out.println(s1.displayData());
	System.out.println();
	s1.draw();
	System.out.println();
	System.out.println(s1.toString());
	System.out.println();
	System.out.println("============================================================");
	System.out.println();
	//end test SingleFamilyHome class

	}//end main



}//end class
