package chap03;

public class JavaVersion {

    public static void main(String[] args) {
        View view = new Button();
        view.click();

        ExtendFunctionKt.showOff(view);

        System.out.println(ExtendFunctionKt.getLastChar("JAVA"));

        StringBuilder sb = new StringBuilder("JAVA?");
        ExtendFunctionKt.setLastChar(new StringBuilder("JAVA?"), '!');
        System.out.println(sb);
    }
}
