import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class MapLesson {

	public static void main(String[] args) {
		//key value pair
		Map<String,Integer> prefs=new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo=prefs.get("東京都");
		System.out.println(tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto=prefs.get("熊本県");
		System.out.println(kumamoto);
		for(String key:prefs.keySet()) {
			System.out.printf("%sの人口は%d%n", key,prefs.get(key));

		}
		Scanner sc =new Scanner(System.in);
		Random rand=new Random();
		Map<Integer,Integer> data=new LinkedHashMap<>();
		for(int i=1;i<=6;i++) {
			data.put(i, 0);
		}
		System.out.print("何回ふる>>");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int diceNo=rand.nextInt(6)+1;
			data.put(diceNo, data.get(diceNo)+1);
		}
		System.out.println("***result***");
		for(int key:data.keySet()) {
			System.out.println(key+"...."+data.get(key));
		}

		Map<Integer,Integer> map=new TreeMap<>();
		for(int i=0;i<100;i++) {
			int n=rand.nextInt(100)+1;
			if(map.containsKey(n)) {
				map.put(n,map.get(n)+1);
			}else {
				map.put(n, 1);
			}
		}
		System.out.println("***result***");
		System.out.println(map.size()+"種類の数値がでました");
		for(int key:map.keySet()) {
			System.out.printf("%d...%d%n", key,map.get(key));

		}
		System.out.println("Hello");


	}
}

