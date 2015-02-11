package Chapter13;
// Stack interface with a less rubbish name

public interface Stackable<T> {
  
  void push(T object) throws FullStackException;
  
  T pop() throws EmptyStackException;

}
