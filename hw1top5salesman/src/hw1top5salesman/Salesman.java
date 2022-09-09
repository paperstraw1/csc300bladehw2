package hw1top5salesman;

public class Salesman 
{
	private String name;
	public float salesTotal;
	
	public Salesman(String name, float salesTotal)
	{
		this.name = name;
		this.salesTotal = salesTotal;
	}
	
	public static void getTopFive(Salesman[] sales)
	{
		Salesman topFive[] = new Salesman[5];
		for(int i = 0; i < 5; i++)
		{
			topFive[i] = sales[i];
			System.out.println(topFive[i]);
		}
	}

	public static Salesman[] getSales(Salesman[] sales)
	{
		Salesman temp = new Salesman("name", -1);
		for(int i = 0; i < sales.length; i++)
		{
			for(int x = 0; x < sales.length - i -1; x++)
			{
				if(sales[x].salesTotal < sales[x+1].salesTotal) 
				{
					temp = sales[x];
					sales[x] = sales[x+1];
					sales[x+1] = temp;
				}
			}
		}
		return sales;
	}

	@Override
	public String toString()
	{
		return this.name + " - total sales: $" + this.salesTotal;
	}
}