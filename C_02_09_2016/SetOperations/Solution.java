package setOpt.definition;

public class Solution {
	public static void main(String args[]) {
		SetOpt<Student> so2 = new SetOpt<Student>();
		SetOpt<Student> so1 = new SetOpt<Student>();
		so1.add(new Student(1,"Vijay",true));
		so1.add(new Student(2,"Kamal",true));
		so2.add(new Student(1,"Vijay",true));
		so2.add(new Student(2,"Gokhi",false));
		so2.add(new Student(3,"Raj",false));		
		System.out.println("A + B" + so1.union(so2));
		System.out.println("A intersect B" + so1.intersect(so2));
		System.out.println("B - A" + so2.difference(so1));
		System.out.println("A sym Diff B" + so1.symmetricDifference(so2));
		System.out.println("B Subset A ?" + so1.subSet(so2));
		System.out.println("B Superset A ?" + so2.subSet(so1));
	}
}
