package dollarfactory;

public class DollorDenominationCommand implements Command{
   Dollar dollar;
   public DollorDenominationCommand(Dollar dollar)
   {
	   this.dollar = dollar;
   }
@Override
public void execute() {
	dollar.denomiation();	
}
   
   
}
