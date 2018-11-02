import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public T set(int index, T element){
    super.set(index, element);
  }
  public void add(int index, T element){

  }
  private int findCorrectIndex(T element){
    
  }
}
