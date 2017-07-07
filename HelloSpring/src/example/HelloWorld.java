package example;

/**
 * Created by luqmanarifin on 7/7/17.
 */
public class HelloWorld {
  private String message;

  public void setMessage(String message){
    this.message  = message;
  }
  public void getMessage(){
    System.out.println("Your Message : " + message);
  }
}