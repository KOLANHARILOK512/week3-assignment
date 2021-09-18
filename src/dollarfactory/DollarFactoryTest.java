package dollarfactory;

public class DollarFactoryTest {

	public static void main(String[] args) {
		Dollar dollar = new Dollar();
		DollarCommandInvoker invoker = new DollarCommandInvoker();
		invoker.setCommand(new DollarMadeOfCommand(dollar));
		invoker.executeCommand();
		
		invoker.setCommand(new DollorDenominationCommand(dollar));
		invoker.executeCommand();
		
		invoker.setCommand(new DollarColorCommand(dollar));
		invoker.executeCommand();	
	}

}
