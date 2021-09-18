package dollarfactory;

public class DollarColorCommand implements Command{
	   Dollar dollar;
	   public DollarColorCommand(Dollar dollar)
	   {
		   this.dollar = dollar;
	   }
	@Override
	public void execute() {
		dollar.color();	
	}   
	   
	}