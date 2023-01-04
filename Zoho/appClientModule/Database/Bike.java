package Database;

import java.util.ArrayList;
import java.util.Collections;

public class Bike implements Comparable<Bike> {

	private String name;
	private int makeYear;
	private int cc;
	private int topSpeed;	


	private Bike(String name, int makeYear, int cc, int topSpeed) {
		this.name = name;
		this.makeYear = makeYear;
		this.cc = cc;
		this.topSpeed = topSpeed;
	}

	//	@Override  - COmparewith Speed
	//	public int compareTo(Bike o) {
	//		return this.TopSpeed - o.TopSpeed;
	//		return -(this.TopSpeed - o.TopSpeed);
	//	}

	//	@Override  - COmparewith CC
		public int compareTo(Bike o) {
	//		return this.cc - o.cc;
			return -(this.cc - o.cc);
		}

	//	@Override - COmparewith MakeYear
//		public int compareTo(Bike o) {
////			return this.makeYear - o.makeYear;
//			return -(this.makeYear - o.makeYear);
//		}

//	public int compareTo(Bike o) {
////				return this.name.compareTo(o.name);
////		return -(this.name.compareTo(o.name));
//	}





	@Override
	public String toString() {
		return name + ", " + makeYear + ", " + cc + ", " + topSpeed ;
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("Honda", 2008, 150, 120);
		Bike b2 = new Bike("Bajaj", 2018, 175, 175);
		Bike b3 = new Bike("Hero", 2019, 155, 170);
		Bike b4 = new Bike("Yezdi", 2010, 355, 160);
		Bike b5 = new Bike("Yamaha", 2011, 450, 180);

		ArrayList<Bike> bikeList =  new ArrayList<>();
		bikeList.add(b1);
		bikeList.add(b2);
		bikeList.add(b3);
		bikeList.add(b4);
		bikeList.add(b5);


		//		bikeList.forEach(b -> System.out.println(b));

		Collections.sort(bikeList);

		bikeList.forEach(b -> System.out.println(b));
		
		System.out.println("\n Reversed List");
		
		Collections.reverse(bikeList);

		bikeList.forEach(b -> System.out.println(b));


	}



}
