package InjectClasses;

import application.Consumer;
import application.MyDIApplication;
import service.MessageServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new MessageServiceImpl());
	}

	
}
