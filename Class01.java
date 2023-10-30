abstract class Caaa {
    protected int num; // 整數成員變數 num
    public Caaa(int n) { // 抽象類別 Caaa 的建構子
        num = n; // 將傳入的整數 n 設定給 num 成員變數
    }
    public abstract void show(); // 抽象方法，需要在子類別中實作
}
class Cbbb extends Caaa {// 定義子類別 Cbbb，繼承自抽象類別 Caaa
    // Cbbb 的建構子
    public Cbbb(int n) {
        super(n); // 呼叫父類別的建構子，設定 num 值
    }
    public void show() {// 實作抽象方法 show
        System.out.println("num=" + num); // 印出 num 的值
    }
}
public class Class01 {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb(2); // 創建 Cbbb 的實例並設定 num 成員的值為 2
        bb.show(); // 呼叫 show 方法，印出 "num=2" 字串
    }
}
