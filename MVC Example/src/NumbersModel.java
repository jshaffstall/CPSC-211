import java.util.ArrayList;

public class NumbersModel {
	ArrayList<Integer> data = new ArrayList<Integer>();
	
	public void addNumber(int number)
	{
		data.add(number);
	}
	
	public int getCount ()
	{
		return data.size();
	}
	
	public int getNumber (int i)
	{
		return data.get(i);
	}
	
	public int getAverage ()
	{
		int total = 0;
		
		for (int i = 0; i < data.size(); i++)
		{
			total += data.get(i);
		}
		
		if (data.size() > 0)
			return total / data.size();
		
		return 0;
	}
}
