import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");
		System.out.println(names.get(1));

		List<Integer> points = new ArrayList<>();
		points.add(Integer.valueOf(10));
		points.add(80);
		points.add(75);
		for (int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}
		for (Integer i : points) {
			System.out.println(i.intValue());
		}

		Iterator<Integer> it = points.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}

		int n = 10;
		String str = String.valueOf(n);//"10"
		//String str= n +"";

		Set<String> colors = new HashSet<>();

		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");

		Set<Integer> set = new HashSet<>();
		Random rand = new Random();
		int count = 0;
		while (true) {
			count++;
			int dice = rand.nextInt(6) + 1;
			set.add(dice);
			System.out.println(dice);
			if (set.size() == 6) {
				break;
			}
		}
		System.out.println(count + "回で揃いました!");

		Set<String> fruits=new TreeSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		for(String f:fruits) {
			System.out.println(f);
		}

		List<Integer>  nums=new ArrayList<>();
		for(int i=0;i<10;i++) {
			nums.add(rand.nextInt(10)+1);
		}
		System.out.println(nums);
		Set<Integer> data=new TreeSet<>(nums);
		System.out.println(data);
		
		String dataCSV="タコ,イクラ,マグロ,トロ,イクラ,ウニ,ホタテ,マグロ,トロ,マグロ,エビ,イカ";
		String[] sushi=dataCSV.split(",");
		for(String s:sushi) {
			System.out.println(s);
		}
		System.out.println("食べた種類を食べた順に表示します(重複除く)");
		List<String> list=Arrays.asList(sushi);
		Set<String> set1 = new LinkedHashSet<>(list);
		System.out.println(set1);
	}
}
