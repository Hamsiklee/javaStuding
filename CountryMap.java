package tofriday;

import java.util.HashMap;

public class CountryMap {

	public CountryMap() {
		// TODO Auto-generated constructor stub
	}
	
	public void CtMap() {
		HashMap<Integer, CountryVO> cm = new HashMap<Integer,CountryVO>(); 
		cm.put(1, new CountryVO("Ű����", "Űũ��", 90000, 10, "������", "�԰��"));
		cm.put(2, new CountryVO("���콺", "������", 13000, 12, "���ν�", "���"));
		cm.put(3, new CountryVO("��ħ��", "�հ���", 50000, 13, "������", "������"));
		cm.put(4, new CountryVO("�����", "����", 20000, 16, "������", "���ȣ"));
		cm.put(5, new CountryVO("������", "HP", 10000, 54, "����", "������"));
		
	}
}
