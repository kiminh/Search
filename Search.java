import java.util.Queue;
import java.util.Set;

/**
 * define the search problem
 */ 
public class Search<T extends States<T>> {
	private int statesExamined;
	private final Queue<T> queue;
	private final Set<T> seen;

	public Search(Queue<T> queue, Set<T> seen, T initialState) {
		this.queue = queue;
		queue.add(initialState);
		this.seen = seen;
		this.statesExamined = 0;
	}

	public T findGoal() {
		while (!queue.isEmpty()) {
			statesExamined++;
			
			T current = queue.remove();
			if (current.isGoal()) {
				return current;
			}

			for (T newState: current.expand()) {
				if (!seen.contains(newState)) {
					seen.add(newState);
					queue.add(newState);
				}
			}
		}
	}

	public int statesExamined() { return statesExamined; }
}
