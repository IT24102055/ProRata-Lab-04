import java.util.Scanner;
public class IT24102055Lab4Q2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// Variable declaration
	float emarks, lmarks,peMarks,plMarks, FinalMarks;

	// Enter Exam marks
	System.out.print("Please enter exam marks (out of 100): ");
      emarks = input.nextFloat();

	// Validate Exam marks
	if( emarks <= 100 && emarks >= 0 ){

		// Enter Lab submission marks
		System.out.print("Please enter lab submission marks(out of 100): ");
		lmarks = input.nextFloat();

		// Validate Lab submission marks
		if( lmarks <= 100 && lmarks >= 0 ){

			// Enter exam marks percentage
			System.out.print("Please enter the percentage given for the exam: ");
			peMarks = input.nextFloat();

			// Validate exam marks percentage
			if( peMarks <= 100 && peMarks >= 0 ){

				// Enter lab submission marks percentage
				System.out.print("Please enter the percentage given for the lab submission: ");
				plMarks = input.nextFloat();

				// Validate Lab submission marks percentage
				if( plMarks <= 100 && plMarks >= 0 ){
					
					// Validate total percentage
					if((peMarks + plMarks) == 100){

						// Calculate final marks
						FinalMarks = (emarks * peMarks / 100) + (lmarks * plMarks / 100);
						System.out.println("\nFinal Exam Mark is : " + FinalMarks);
						
					}else{
						System.out.println("The percentage must add up to 100. Terminating program");
					}
					
				}else{
					System.out.println("Invalid input for lab submission percentage. Terminating program");
				}
					
			}else{
				System.out.println("Invalid input for exam percentage. Terminating program");
			}

			
				
		}else{
			System.out.println("Invalid input for lab submission marks. Terminating program");
		}

		
	}else{
		System.out.println("Invalid input for exam marks. Terminating program");

	}

	

	}
}
      
      	
     