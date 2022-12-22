package staticNonstatic;

public class Static1 {

	static int x=5;
	int y=10;
	
	void processData() {
		x++;
		y++;
	}
	void printInfo() {
		System.out.println(x+":"+y);
	}
	public static void main(String[] args) {
		Static1 s1=new Static1();
		s1.processData();
		s1.processData();
		s1.processData();
		
		Static1 s2=new Static1();
		s2.processData();
		
		s1.printInfo();
		s2.printInfo();
	}
}
