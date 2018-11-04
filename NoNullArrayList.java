import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public T set(int index, T element){
    T x = super.get(index);
    if(element == null){
      throw new IllegalArgumentException("element cannot be null");
    }
    super.set(index, element);
    return x;
  }
  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("element cannot be null");
    }
    super.add(element);
    return true;
  }
  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("element cannot be null");
    }
    super.add(index, element);
  }
}
