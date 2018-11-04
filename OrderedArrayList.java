import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public T set(int index, T element){
    T x = super.get(index);
    super.remove(index);
    add(element);
    return x;
  }
  public void add(int index, T element){
    super.add(findCorrectIndex(element), element);
  }
  public boolean add(T element){
    super.add(findCorrectIndex(element), element);
    return true;
  }
  private int findCorrectIndex(T element){
    for(int i = 0; i < size(); i++){
      if(element.compareTo(super.get(i)) < 0){
        return i;
      }
    }
    return size();
  }
}
