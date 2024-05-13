package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getPopTotal() > o2.getPopTotal()) {
			return 1;
		} else if (o1.getPopTotal() < o2.getPopTotal()) {
			return -1;
		}
		return 0;
	}
}
