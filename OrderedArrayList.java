public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
  }

  public OrderedArrayList(int startingCapacity) {
  }

  public int correctIndex(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Argument is null, it cannot be null!");
    }
    for (int i = 0; i < super.size(); i++) {
      if (element.compareTo(super.get(i)) < 0) {
        return i;
      }
    }
    return super.size();
  }

  public boolean add(T element) {
    super.add(correctIndex(element), element);
    return true;
  }

  public void add(int index, T element) {
    super.add(correctIndex(element), element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Argument is null, it cannot be null!");
    }
    T original = super.get(index);
    super.remove(index);
    super.add(correctIndex(element), element);
    return original;
  }

}
