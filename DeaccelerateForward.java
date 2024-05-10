public class DeaccelerateForward implements State {

   public void doAction(Context context) {
      System.out.println("the moon rover is in deaccelerate forward state");
      context.setState(this);	
   }

   public String toString(){
      return "Deaccelerate Forward State";
   }
}