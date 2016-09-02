package setOpt.definition;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SetOpt<E> {
	private Set<E> set;

	public SetOpt() {
		this.set = new TreeSet<E>();
	}

	public SetOpt(Collection<E> set) {
		super();
		this.set = (Set<E>) set;
	}
	public int size() {
		return this.set.size();
	}
	public boolean isEmpty() {
		return this.set.isEmpty();
	}
	public void clear() {
		this.set.clear();
	}
	public void add(E o) {
		this.set.add(o);
	}
	public boolean contains(Object o) {
		return this.set.contains(o);
	}
	public void remove(Object o) {
		this.set.remove(o);
	}
	public SetOpt<E> union(SetOpt<E> a) {
		Set<E> copy1 = new TreeSet<E>(this.set);
		Set<E> copy2 = new TreeSet<E>(a.set);
		copy1.addAll(copy2);
		SetOpt<E> temp = new SetOpt<E>(copy1);
		return temp;
 	}
	public SetOpt<E> intersect(SetOpt<E> b) {
		Set<E> copy1 = new TreeSet<E>(this.set);
		Set<E> copy2 = new TreeSet<E>(b.set);
		copy1.retainAll(copy2);
		SetOpt<E> temp = new SetOpt<E>(copy1);
		return temp;
	}
	public SetOpt<E> difference(SetOpt<E> c) {
		Set<E> copy1 = new TreeSet<E>(this.set);
		Set<E> copy2 = new TreeSet<E>(c.set);
		SetOpt<E> temp = new SetOpt<E>();
		copy1.removeAll(copy2);
		temp.set = copy1;
		return temp;
	}
	public SetOpt<E> symmetricDifference(SetOpt<E> c) {
		Set<E> copy1 = new TreeSet<E>(this.set);
		Set<E> copy2 = new TreeSet<E>(c.set);
		Set<E> temp = new TreeSet<E>(copy1);
		copy1.retainAll(copy2);
		temp = copy1;
		copy1 = this.set;
		copy1.removeAll(temp);
		copy2.removeAll(temp);
		copy1.addAll(copy2);
		temp = copy1;
		SetOpt<E> temp2 = new SetOpt<E>(temp);
		return temp2;
	}
	public boolean subSet(SetOpt<E> d) {
		Set<E> copy1 = new TreeSet<E>(this.set);
		Set<E> copy2 = new TreeSet<E>(d.set);
		return copy1.containsAll(copy2);
	}
 	@Override
	public String toString() {
		return "" + set;
	}
	
}
