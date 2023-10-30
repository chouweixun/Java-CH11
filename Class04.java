interface MyMath {
    void show();  // 顯示結果
    void add(int a, int b);  // 加法運算
    void sub(int a, int b);  // 減法運算
    void mul(int a, int b);  // 乘法運算
    void div(int a, int b);  // 除法運算
}
class Compute implements MyMath {// 實現 MyMath 介面的 Compute 類別
    private int ans;  
    public void show() {
        System.out.println("ans=" + ans);
    }
    public void add(int a, int b) {
        ans = a + b;
    }
    public void sub(int a, int b) {
        ans = a - b;
    }
    public void mul(int a, int b) {
        ans = a * b;
    }
    public void div(int a, int b) {
        ans = a / b;
    }
}
public class Class04 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        cp.mul(3, 5); // 計算 3*5
        cp.show();     // 此行會打印出 "ans=15" 字符串
    }
}
