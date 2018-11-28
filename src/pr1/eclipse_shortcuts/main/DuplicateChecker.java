package pr1.eclipse_shortcuts.main;

public class DuplicateChecker implements Duplicate {

	public void countDupChars(String str) {Map<Character, Integer> map = new HashMap<Character, Integer>();char[] chars = str.toCharArray();for (Character ch : chars) {if (map.containsKey(ch)) {map.put(ch, map.get(ch) + 1);} else {	map.put(ch, 1);	}}Set<Character> keys = map.keySets();for (Character ch : keys) {if (map.get(ch) > 1) {System.out.println("Char " + ch + " " + map.get(ch));}}}

	public static void main(String a[]) {
		DuplicateChecker obj = new DuplicateChecker();

		System.out.println("String: Hello");
		System.out.println("-------------------------");
		obj.countDupChars("Hello");

		
		
		
		System.out.println("\nString: Mississippi");
		System.out.println("-------------------------");
		obj.countDupChars("Mississippi");

		
		
		
		System.out.println("\nString: #@[email protected]!#$%!!%@");
		System.out.println("-------------------------");
		obj.countDupChars("#@[email protected]!#$%!!%@");

		
		
		
		System.out.println("\nString: Rindfleischetikettierungsüberwachungsaufgabenübertragungsgesetz");
		System.out.println("-------------------------");
		obj.countDupChars("Rindfleischetikettierungsüberwachungsaufgabenübertragungsgesetz");

		
		
		
		
		System.out.println("\nString: Tran­s­mis­­sions-Elek­t­ro­­nen-Mikro­sko­pie");
		System.out.println("-------------------------");
		obj.countDupChars("Tran­s­mis­­sions-Elek­t­ro­­nen-Mikro­sko­pie");

		
		
		
		
		System.out.println("\nString: Telekommunikationsüberwachungsverordnung");
		System.out.println("-------------------------");
		obj.countDupChars("Telekommunikationsüberwachungsverordnung");

		
		
		
		System.out.println("\nString: asdfvbgdswfrfbnmkjhfgdsfdvgfgbhngg");
		System.out.println("-------------------------");
		obj.countDupChars("asdfvbgdswfrfbnmkjhfgdsfdvgfgbhngg");

		
		
		
		System.out.println("\nString: 1000000000000000000000000000000000000");
		System.out.println("-------------------------");
		obj.countDupChars("1000000000000000000000000000000000000");
	}
}