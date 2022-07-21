package methods;

public class callingmethod {

int v=18;

int operation(int v) {
	v =v*(5/50);
	return(v);
}

public static void main(String args[]) {
	callingmethod d = new callingmethod();
	System.out.println("Before operation value of data is "+d.v);
	d.operation(100);
	System.out.println("After operation value of data is "+d.v);
	}
}

