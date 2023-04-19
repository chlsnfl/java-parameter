package ch041702;

public class MyOffice {

	public static void main(String[] args) {
		
		Object im = new Employee("임꺽정", "대리");
		System.out.println(im.toString());
		
		Drivable dd = new Driver("슈마허", "사원", "123조 1011");
		System.out.println(dd);
		
		dd.drive();
		
		Drivable ddd = new Transpoter();
//		ddd.setCarNo("222거3445가");
		ddd.drive();
		
		
	
	
	}

}
