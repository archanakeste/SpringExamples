package application;

import service.MessageService;

public class MyDIApplication implements Consumer{
	MessageService msgService;
	public MyDIApplication(MessageService msgService){
		this.msgService=msgService;
	}
	
	@Override
	public void processMessage(String msg, String rec) {
		msgService.sendMessage(msg, rec);
		System.out.println("Success");
	}

}
