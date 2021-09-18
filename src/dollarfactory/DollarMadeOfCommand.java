package dollarfactory;

public class DollarMadeOfCommand implements Command{
	   Dollar dollar;
	   public DollarMadeOfCommand(Dollar dollar)
	   {
		   this.dollar = dollar;
	   }
	@Override
	public void execute() {
		dollar.madeof();	
	}
	   
	   
	}