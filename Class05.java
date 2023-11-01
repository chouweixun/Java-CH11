
interface iAaa {// 定義一個介面 iAaa
    public void show(); // 介面中宣告一個抽象方法 show()
}
class Bbb {// 定義類別 Bbb
    public int num = 10; // Bbb 類別中的整數欄位 num 初始值為 10
    public void set(int n) {
        num = n; // 設定 num 欄位的值為傳入的參數 n
    }
}
class Ccc extends Bbb implements iAaa {// 定義類別 Ccc，繼承自 Bbb 類別，並實作 iAaa 介面
    public void show() {
        System.out.println("num=" + num); // 實作 iAaa 介面中的 show() 方法，輸出 num 欄位的值
    }
}
public class Class05 {
    public static void main(String[] args) {
        Ccc obj = new Ccc(); // 創建一個 Ccc 類別的物件 obj
        obj.set(5); // 呼叫 set 方法設定 num 欄位的值為 5
        obj.show(); // 呼叫 show 方法，輸出 "num=5"
    }
}
