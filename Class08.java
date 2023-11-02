interface Date {
    public void showDate();
}
interface Test {
    public void showScore();
    public double calcu();
}
class Stu implements Date, Test {
    protected String id; // 學號
    protected String name; // 姓名
    protected int mid; // 期中考成績
    protected int finl; // 期末考成績
    protected int common; // 平時成績
    public Stu(String id, String name, int mid, int finl, int common) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }
    public void showDate() {
        System.out.println("學號：" + id); // 輸出學號
        System.out.println("姓名：" + name);// 輸出姓名
    }
    public void showScore() {
        System.out.println("期中考成績：" + mid);// 輸出期中考成績
        System.out.println("期末考成績：" + finl);// 輸出期末考成績
        System.out.println("平時成績：" + common);// 輸出平時成績
    }
    public double calcu() {
        double semesterScore = (mid * 0.3) + (finl * 0.3) + (common * 0.4);
        return semesterScore;
    }
    public void show() {
        showDate();
        showScore();
        System.out.println("學期成績：" + calcu());
    }
}
public class Class08 {
    public static void main(String args[]) {
        Stu stu = new Stu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
