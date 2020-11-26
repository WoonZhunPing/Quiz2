
public class Quiz2 {

	public static void main(String[] args) {
		
		System.out.println("1.For");
		int max = 5;
				for (int n = 1; n <= max; n++) { 
					System.out.println(n); } 
				System.out.println();
				
		System.out.println("1.While");
		int a = 5 ; 
		int b = 1 ;
			while (b<= a) {
				System.out.println(b);
				b++;
				
			}
			System.out.println();


		System.out.println("2.For"); 
		int total = 25; 
		for (int number = 1; number <= (total / 2); number++) { 
			total = total - number; 
			System.out.println(total + " " + number); } 
		System.out.println();
		
		System.out.println("2.While");
		int totals = 25;
		int num = 1;
		while(num <= (totals/2)) {
			totals = totals - num; 
			System.out.println(totals + " " + num);
			num++;
		}
		System.out.println();
		
		
		System.out.println("3.For"); 
		for (int i = 1; i <= 2; i++) { 
			for (int j = 1; j <= 3; j++) { 
				for (int k = 1; k <= 4; k++) { 
					System.out.print("*");
					} 
				System.out.print("!");
				} 
			System.out.println(); 
			} 
		System.out.println();
		
		System.out.println("3.While");
		int i = 1;
		while(i <= 2) {
			int j = 1;
			while(j <= 3 ) {
				int k = 1;
				while(k <= 4 ) {
					System.out.print("*");
					k++;
				}
				
				System.out.print("!");
				j++;
				
			}
			i++;
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("4.For"); 
		int number = 4; 
		for (int count = 1; count <= number; count++) { 
			System.out.println(number); 
			number = number / 2; 
			}
		System.out.println();
	
		System.out.println("4.While"); 
		int nums = 4; 
		int counts = 1 ;
		while(counts <= nums) {
			System.out.println(nums); 
			nums = nums / 2;
			counts++;
			
		}
		}

	

}
