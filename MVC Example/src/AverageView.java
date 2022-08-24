
public class AverageView {
	private NumbersModel model;
	
	public AverageView (NumbersModel m)
	{
		model = m;
	}
	
	public void display ()
	{
		int average = model.getAverage();
		System.out.println("Average: " + average);
	}
}
