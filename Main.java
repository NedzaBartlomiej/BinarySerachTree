public class Main
{
	public static void main(String[] args) {
		Bst noRootBst = new Bst();
		Bst withRootBst = new Bst(3);
		
	    noRootBst.add(50);
        noRootBst.add(30);
        noRootBst.add(20);
        noRootBst.add(40);
        noRootBst.add(70);
        noRootBst.add(60);
        noRootBst.add(80);
		withRootBst.add(3);
		withRootBst.add(3);
		withRootBst.add(8);
		
		noRootBst.ascParse();
		withRootBst.ascParse();
		noRootBst.descParse();
		withRootBst.descParse();
		
		System.out.println(noRootBst.search(17)); // false
		System.out.println(noRootBst.search(5)); // true
		System.out.println(withRootBst.search(3)); // true
		System.out.println(withRootBst.search(18)); // false
		
		
		System.out.println(noRootBst.maxValue());
		System.out.println(noRootBst.minValue());
		
		Bt bt = new Bt(1, 1, 23, 4, 7, 8, 3, 3, 34);
		Bst convertedBst = Bst.convert(bt);
		System.out.println("Converted:");
		convertedBst.ascParse();
		
		noRootBst.delete(50);
		noRootBst.ascParse();
	}
}
