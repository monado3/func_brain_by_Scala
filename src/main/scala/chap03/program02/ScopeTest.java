package chap03.program02;

public class ScopeTest {
    private String value = "value: ScopeTestクラスのフィールド";

    public void someMethod(final String value) {
        System.out.println("someMethod=> " + value);
        System.out.println("someMethod=> " + this.value);
    }

    public static void main(String[] args) {
        final String value = "value: mainメソッドのローカル変数";

        System.out.println("main>= " + value);
        new ScopeTest().someMethod("value: someMethodメソッドの引数");
    }
}
