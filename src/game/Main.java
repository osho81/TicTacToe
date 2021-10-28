package game;

public class Main {

	public static void main(String[] args) {
		// First upload...
		System.out.println("Katarina");
		System.out.println("Osama");
		System.out.println("Tack Osama och Mohamad");
		
		System.out.println();
		for( int i = 0, x = 1; i <= 3; i++) {
			
			for( int j = 0; j <= 3; j++, x++) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		System.out.println("Mohamad skrev ut for loopen!");
		
	}

}
