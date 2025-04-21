package labtuan3;
import java.util.Scanner;
public class HocSinh{
    private int maSo;
    private String hoTen;
    private double dtb;
      
      public int getMaso(){
      return maSo;
      }
      public void setMaso(int maSo){
      this.maSo = maSo;    
      }
      
      public String getHoten(){
      return hoTen;
      }
      public void setHoten(String hoTen){
      this.hoTen = hoTen;
      }
      
      public double getDtb(){
      return dtb;    
      }    
      public void setDtb(double dtb){
      this.dtb = dtb;    
      }
      
      public HocSinh(){
      maSo = 0;
      hoTen = "";
      dtb = 0;        
      }
      
      public HocSinh(int maSo, String hoTen, double dtb){
      this.maSo = 1250080111;
      this.hoTen = "Quach Khanh Luong";
      this.dtb = 7;        
      }         
      
      public HocSinh(HocSinh p){
      maSo = p.maSo;
      hoTen = p.hoTen;
      dtb = p.dtb;
      }
      
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma so hoc sinh:");
        maSo = sc.nextInt();
        System.out.print("Nhap ho ten hoc sinh:");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem trung binh:");
        dtb = sc.nextDouble();
    }

    public void output() {
        System.out.println("Ma so:" + maSo);
        System.out.println("Ho ten:" + hoTen);
        System.out.println("Diem trung binh:" + dtb);
    }  
    
    public void rank() {
    if (dtb < 5) {
        System.out.println("Xep loai yeu");
    } else {
        if (dtb >= 5 && dtb < 7) {
            System.out.println("Xep loai trung binh");
        } else {
            if (dtb >= 7 && dtb < 8) {
                System.out.println("Xep loai kha");
            } else {
                System.out.println("Xep loai gioi");
            }
        }
    }
}
}
