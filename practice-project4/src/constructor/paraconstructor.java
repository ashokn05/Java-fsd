package constructor;

class Study{
	int id = 4444;
	String name;

	Study(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paraconstructor {
public static void main(String[] args) {

	Study std1=new Study(2,"abcd");
	Study std2=new Study(10,"efgh");
	std1.display();
	std2.display();
		}
}
