package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
	 Car car1 = new Car();
	 System.out.println("car1.company : " + car1.company);
	 System.out.println();
	 
	 Car car2 = new Car("자가용");
	 System.out.println("car1.company : " + car1.company);
	 System.out.println();
	 
	 Car car3 = new Car("자가용", "빨강");
	 System.out.println("car1.company : " + car1.company);
	 System.out.println();
	 
	 
	 Car car4 = new Car("택시","검정",200);
	 System.out.println("car1.company : " + car1.company);
	 System.out.println();
	 
	 
	 
	 
	}

}
