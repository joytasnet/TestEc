import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
	}
}
