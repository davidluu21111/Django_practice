public class ConstantForward implements State {

   public void doAction(Context context) {
      System.out.println("the moon rover is in constant forward state");
      context.setState(this);	
   }

   public String toString(){
      return "Constant Forward State";
   }
}