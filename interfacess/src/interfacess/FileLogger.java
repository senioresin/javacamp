package interfacess;

public class FileLogger implements Logger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandı : " + message );
	}

}
