public class StopState implements State {

   public void doAction(Context context) {
      System.out.println("the moon rover is in stop state");
      context.setState(this);	
   }

   public String toString(){
      return "Stop State";
   }
}