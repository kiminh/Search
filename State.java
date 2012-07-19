import java.util.List;

/**
 * interface State
 *
 */ 
public interface State<T> {

	public List<T> expand();

	public boolean isGoal();
}
