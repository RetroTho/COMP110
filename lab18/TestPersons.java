
public class TestPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person js = new Student("John Smith","18111 Nordhoff st","(818)677-1111","jsmith@csun.edu",1);
		System.out.println(js);
		System.out.println();
		Person aj = new Employee("Adam Jones","18111 Nordhoff st","(818)677-2222","ajones@csun.edu","JD2222",100000,2001,01,25);
		System.out.println(aj);
		System.out.println();
		Employee bz = new Faculty("Bahram Zartoshty","18111 Nordhoff st","(818)677-2656","bzartoshty@csun.edu","JD4441",100000,2000,01,25,"MW 2:00-3:00",1);
		System.out.println(bz );
		System.out.println();
		Employee ec = new Staff("Erica Carter","18111 Nordhoff st","(818)677-3333","ecarter@csun.edu","JD333",50000,2020,01,05,"secretary");
		System.out.println(ec );
		System.out.println();
		ec.setDateHired(2020,01,01);
		System.out.println(ec );
		System.out.println();
       

	}

}
