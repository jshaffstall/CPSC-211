import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.go();
	}
	
	public void go ()
	{
		NumbersModel model = new NumbersModel();
		AverageView view1 =  new AverageView(model);
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("1) Add Number");
			System.out.println("2) Exit");
			view1.display();
			
			int choice = input.nextInt();
			
			if (choice == 1)
			{
				System.out.print("Enter the number: ");
				int number = input.nextInt();
				model.addNumber(number);
			}
			
			if (choice == 2)
				System.exit(0);
		}
		
	}

}
