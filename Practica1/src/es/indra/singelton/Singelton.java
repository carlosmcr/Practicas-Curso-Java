package es.indra.singelton;

public class Singelton {

	private String url;
	private static Singelton miSingelton;

	private Singelton() {
		this.url = url;
	}
	
	public static Singelton getSingelton() {
		if (miSingelton == null) {
			miSingelton = new Singelton();
		}
		return miSingelton;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
