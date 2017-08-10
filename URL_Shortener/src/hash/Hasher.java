package hash;

public class Hasher {

	String longUrl;
	String shortUrl;
	
	
	private Hasher(String longUrl) {
		this.longUrl = longUrl;
	}
	
	public Hasher HashFactory(String longUrl) {
		Hasher hasher = new Hasher(longUrl);
		return hasher;
	}
	
	public void hashUrl(String longUrl) {
		
	}
	
}
