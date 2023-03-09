package pdf;

public class Perant_calling {
	
	public Calling_object sub(int a, int b) {
		int c;
		c=a-b;
		Calling_object krt=new Calling_object();
		System.out.println("c");
		return krt;
		//System.out.println("c");
		
	}

	
	public static void main(String[] args) {

		Perant_calling perant_calling= new Perant_calling();
		Calling_object calling_object=perant_calling.sub(10, 20);
		//.add(10, 20);
	}

}
