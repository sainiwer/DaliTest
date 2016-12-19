package wenyu3;

/*
 * 1.统计每个字母出现的次数。
 * 2.随机产生100个小写字母，并将它们放到一个数组中。
 * 3.对数组中每个字母出现的次数进行计算，那么创建具有26个int值的数组counts，每个值代表一个字母出现的次数。
 * count[0]的值代表a字母出现的次数，以此类推。
 * 4.
 */
public class CountLettersInArrays {

	public static void main(String[] args) {
		char[] chars = createArray();
		System.out.println("");
		displayArray(chars);
		int[] counts = countLetters(chars);
		System.out.println();
		System.out.println("");
		displayCounts(counts);

	}

	public static char[] createArray() { // 随机生成100个小写字母
		char[] chars = new char[100];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();// 使用一个随机生成字母的类产生小写字母。
		}
		return chars;
	}

	public static void displayArray(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.println(chars[i]);
			} else {
				System.out.println(chars[i] + "");
			}
		}
	}

	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}
		return counts;
	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.println(counts[i] + "" + (char) (i + 'a'));
			} else {
				System.out.println(counts[i] + "" + (char) (i + 'a') + "");
			}
		}
	}

}

class RandomCharacter {
	public static char getRandomLowerCaseLetter() {
		return getRandomLowerCaseLetter(); 
	}

}
