public class AccelerateForward implements State {

   public void doAction(Context context) {
      System.out.println("The moon rover is in accelerate forward state");
      context.setState(this);	
   }

   public String toString(){
      return "Accelerate Forward State";
   }
}