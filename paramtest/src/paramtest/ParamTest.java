package paramtest;

public class ParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing tripleValue:");
		double percent=10.0;
		System.out.println("Before:Percent="+percent);
		tripleValue(percent);
		System.out.println("After:percent="+percent);
		
		System.out.println("\nTesting tripleSalary:");
		Employee harry=new Employee("Harry",50000);
		System.out.println("Before:salary="+harry.getSalary());
		tripleSalary(harry);
		System.out.println("After:salary="+harry.getSalary());
		
		System.out.println("\nTesting swap:");
		Employee a=new Employee("bystc",50000);
		Employee b=new Employee("jzystc",60000);
		System.out.println("Before:a="+a.getName());
		System.out.println("Before:b="+b.getName());
		swap(a,b);
		
		System.out.println("After:a="+a.getName());
		System.out.println("After:b="+b.getName());
	}
		public static void tripleValue(double x){
			x=3*x;
			System.out.println("End of method:x="+x);
		}
		public static void tripleSalary(Employee x){
			x.raiseSalary(200);
			System.out.println("End of method:salary="+x.getSalary());
		}
		public static void swap(Employee x,Employee y){
			Employee temp=x;
			x=y;
			y=temp;
			System.out.println("End of method:x="+x.getName());
			System.out.println("End of method:y="+y.getName());
		}
		
	}


