abstract class MyMath {
    protected int ans;
    public void show() {
        System.out.println("ans=" + ans);
    }
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}
class Compute extends MyMath {
    public void add(int a, int b) {// 實作抽象函數 add
        ans = a + b;
    }
    public void sub(int a, int b) {// 實作抽象函數 sub
        ans = a - b;
    }
    public void mul(int a, int b) {// 實作抽象函數 mul
        ans = a * b;
    }
    public void div(int a, int b) {// 實作抽象函數 div
        ans = a / b;
        }
    }
public class Class02 {
    public static void main(String args[]) {
        Compute cp = new Compute();
        cp.mul(3, 5); // 計算 3*5
        cp.show();    // 此行會印出 "ans=15" 字串
    }
}
