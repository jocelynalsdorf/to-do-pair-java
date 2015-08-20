import java.time.LocalDateTime;
import java.util.ArrayList;


public class Category {
	public static ArrayList<Category> instances = new ArrayList<Category>();

	private String mName;
	private int mId;
	private ArrayList<Task> mTasks;

	public Category(String name) {
		mName = name;
		instances.add(this);
		mId = instances.size();
		mTasks = new ArrayList<Task>();
	}

	public String getName() {
		return mName;
	}

	public int getId() {
		return mId;
	}

	public static ArrayList<Category> all() {
    return instances;
  }
	public ArrayList<Task> getTasks() {
		return mTasks;
	}

	public void addTask(Task task) {
		mTasks.add(task);
	}

	public static void clear() {
		instances.clear();
	}

	public static Category find(int id) {
		try {
			return instances.get(id - 1);
		} catch(IndexOutOfBoundsException exception){
			return null;
		}
	}
}