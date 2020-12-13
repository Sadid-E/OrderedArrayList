import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

  private ArrayList<T> data;

  public NoNullArrayList() {

  }

  public NoNullArrayList(int startingCapacity) {

  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Argument is null, it cannot be null!");
    }
    super.add(element);
    return true;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Argument is null, it cannot be null!");
    }
    super.add(index, element);
  }

}
