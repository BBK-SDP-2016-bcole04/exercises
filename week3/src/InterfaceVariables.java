public interface InterfaceVariables {

    public int Test = 1;

    default void method() {
            System.out.println(Test);
    }


}
