package wenyu3;
/*
 * StringBuilder的使用
 */
public class StringDemo {

	public static void main(String[] args) {
		char[] arr={'m','y'};
		StringBuilder sub = new StringBuilder();
		
		sub.append("welcome");
		sub.append(' ');
		sub.append("to");
		sub.append(' ');
		
		sub.append("Java");
		sub.delete(0, 2);//删除索引为0-2之间的字符（不包括2位置）。
		sub.deleteCharAt(0);//删除指定位置上的字符
		sub.insert(0, "wel");//将字符串插入指定的位置。
		sub.insert(15,"HTML and ");//将字符串插入指定的位置。
		sub.insert(5, 1);
		sub.insert(15, arr);
//		sub.reverse();//倒置字符串。
		sub.replace(0, 8, "Welcome");
		sub.setCharAt(14, 'a');//重新设置某个位置上的字符。
		sub.setCharAt(15, ' ');
		sub.setCharAt(16, ' ');
		sub.delete(21, 25);
		sub.delete(0, 3);
		sub.setCharAt(0, 'C');
		sub.delete(0, 4);
		StringBuilder sub2 = (sub.reverse()).reverse();
		System.out.println(sub.length());
		sub.setLength(10);
		System.out.println(sub.length());
		for(int i=0;i<sub.length();i++){
			System.out.print(i+" ");
		}
		System.out.println("\n___________________");
		System.out.println(sub.toString());
		sub.trimToSize();//将容量降到实际大小。
		System.out.println(sub.capacity());
		

	}

}
