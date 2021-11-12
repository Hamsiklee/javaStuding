package tofriday;

import java.util.HashMap;

public class CountryMap {

	public CountryMap() {
		// TODO Auto-generated constructor stub
	}
	
	public void CtMap() {
		HashMap<Integer, CountryVO> cm = new HashMap<Integer,CountryVO>(); 
		cm.put(1, new CountryVO("키보드", "키크론", 90000, 10, "광진구", "함경식"));
		cm.put(2, new CountryVO("마우스", "로지텍", 13000, 12, "용인시", "김범"));
		cm.put(3, new CountryVO("받침대", "왕갈비", 50000, 13, "수원시", "장태진"));
		cm.put(4, new CountryVO("모니터", "샘성", 20000, 16, "강남구", "김기호"));
		cm.put(5, new CountryVO("프린터", "HP", 10000, 54, "평양시", "김정은"));
		
	}
}
