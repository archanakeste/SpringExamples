package Client;

import InjectClasses.EmailServiceInjector;
import InjectClasses.MessageServiceInjector;
import InjectClasses.SMSServiceInjector;
import application.Consumer;

public class ClientTest {

	public static void main(String[] args) {
String msg="fdfdfdfdfdf";
String rec="archana.keste@gmail.com";

MessageServiceInjector injector=null;
//send email
injector=new EmailServiceInjector();
Consumer consumer= injector.getConsumer();
consumer.processMessage(msg, rec);
 
//send SMS
injector=new SMSServiceInjector();
Consumer consumer2= injector.getConsumer();
consumer2.processMessage(msg, rec);

	}

}
