interface MyMath {
    void show(); 
    public void add(int a, int b); // 宣告一個抽象方法 add，用於加法運算
    public void sub(int a, int b); // 宣告一個抽象方法 sub，用於減法運算
    public void mul(int a, int b); // 宣告一個抽象方法 mul，用於乘法運算
    public void div(int a, int b); // 宣告一個抽象方法 div，用於除法運算
}
interface AdvancedMath {
    public void mod(int a, int b); // 宣告一個抽象方法 mod，用於取餘數運算
    public void fac(int a); // 宣告一個抽象方法 fac，用於計算階乘
    public void pow(int a, int b); // 宣告一個抽象方法 pow，用於計算指數冪
}
class Compute implements MyMath, AdvancedMath {// 定義一個名為 Compute 的類別，實作 MyMath 和 AdvancedMath 介面
    private int ans; // 用來存儲計算結果的私有整數字段
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
    public void mod(int a, int b) {
        ans = a % b;
    }
    public void fac(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        ans = factorial;
    }
    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
    }
    public void show() {
        System.out.println("ans=" + ans);
    }
}
public class Class07 {// 主類別 Main
    public static void main(String args[]) {
        Compute cp = new Compute(); // 創建一個 Compute 類別的物件 cp
        cp.mul(3, 5); // 調用 mul 方法進行乘法運算
        cp.show(); // 輸出 ans=15
        cp.mod(14, 5); // 調用 mod 方法進行取餘數運算
        cp.show(); // 輸出 ans=4
        cp.fac(5); // 調用 fac 方法計算階乘
        cp.show(); // 輸出 ans=120
    }
}
