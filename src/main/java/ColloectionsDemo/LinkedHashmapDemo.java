package ColloectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapDemo {

	public static void main(String[] args) {
		Map lhm=new LinkedHashMap();
		lhm.put(100, "Manmada");
		lhm.put(102, "Shiva");
		lhm.put(null, "Ravi");
		lhm.put(108, null);
		System.out.println("LinkedHashMap elements :"+lhm);

	}

}
