package daily.samples.geekforgeeks;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A typical round of Fizz Buzz can be: 
		Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”. */
		
		int start = 1;
		int limit = 100;
		
		for(int i = start; i <= limit; i++) {
			
			if(i%15 == 0) {
				System.out.println("Fizz Buzz"+" ");
			}else if(i%3 == 0) {
				System.out.print("Fizz"+" ");
			}else if(i%5 == 0) {
				System.out.println("Buzz"+" ");
			}else {
				System.out.print(i+" ");
			}	
		}
	}
}
