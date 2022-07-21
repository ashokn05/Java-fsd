package constructor;

class Employeedata{
	int id = 2211;
	String name  ;

void display() {
	System.out.println(id+" "+name);
	}
}

public class Constructor {

public static void main(String[] args) {

	Employeedata employe1=new Employeedata();
	Employeedata employe2=new Employeedata();

	employe1.display();
	employe2.display();
	}
}

