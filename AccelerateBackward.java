public class AccelerateBackward implements State {

   public void doAction(Context context) {
      System.out.println("The moon rover is in accelerate backward state");
      context.setState(this); 
   }

   public String toString(){
      return "Accelerate Backward State";
   }
}