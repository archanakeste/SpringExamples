package InjectClasses;

import application.Consumer;
import application.MyDIApplication;
import service.PrivateMessageServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {
	
		return new MyDIApplication(new PrivateMessageServiceImpl());
	}

}
