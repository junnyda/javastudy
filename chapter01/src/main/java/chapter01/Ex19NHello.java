package chapter01;

public class Ex19NHello {
	public static void main(String[] args) {
		final int COUNT = 5;
		
		int i = 0;
		while(i < COUNT) {
			System.out.println((i+1) + ": Hello World");
			
			i = i + 1;
			//i += 1;
			//i++;
		}	
	}
}
