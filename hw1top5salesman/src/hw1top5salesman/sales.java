package hw1top5salesman;

public class sales {

	public static void main(String[] args)
	{
		Salesman sales[] = new Salesman[10]; 
		sales[0] = new Salesman("Nick", 500);
		sales[1] = new Salesman("Blade", 300);
		sales[2] = new Salesman("Calvin", 950);
		sales[3] = new Salesman("Bob", 120);
		sales[4] = new Salesman("Sean", 302);
		sales[5] = new Salesman("Brittany", 324);
		sales[6] = new Salesman("Don", 522);
		sales[7] = new Salesman("Kristin", 134);
		sales[8] = new Salesman("Rachel", 765);
		sales[9] = new Salesman("Katy", 764);

		//puts the top 5 salesman from highest to lowest
		Salesman.getSales(sales);
		
		System.out.println("From Ascending to descending the top 5 salesman are:  ");
		Salesman.getTopFive(sales);
	}
}