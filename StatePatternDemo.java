public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());

      AccelerateBackward acceBack = new AccelerateBackward();
      acceBack.doAction(context);

      System.out.println(context.getState().toString());

      AccelerateForward acceForw= new AccelerateForward();
      acceForw.doAction(context);
      System.out.println(context.getState().toString());

      DeaccelerateForward deacceForw= new DeaccelerateForward();
      deacceForw.doAction(context);
      System.out.println(context.getState().toString());

      ConstantForward constantForw= new ConstantForward();
      constantForw.doAction(context);
      System.out.println(context.getState().toString());
   }
}