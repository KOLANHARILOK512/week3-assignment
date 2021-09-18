package dollarfactory;

public class DollarCommandInvoker {

	  Command c;
	  public void setCommand(Command c)
	  {
		  this.c = c;
	  }
	  
	  public void executeCommand()
	  {
		  c.execute();
	  }
}
