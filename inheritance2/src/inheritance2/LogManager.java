package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("veritabanına gönderildi");
			
			}
		else if(logType == 2) {
			System.out.println("doysa gönderildi");
			}
		else {
			System.out.println("Email Gönderildi");
		}
	}

}
