import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kt,gk,ck;
        int dtb;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap kt");
        kt= scanner.nextInt();
        System.out.println("nhap gk");
        gk= scanner.nextInt();
        System.out.println("nhap ck");
        ck= scanner.nextInt();
        dtb=(kt+gk+ck)/3;
        System.out.println("diem trung binh la:"+dtb);
        if (dtb>=9){
            System.out.println("hoc luc a");
        }
        else {
            if (dtb>=7 && dtb<9){
                System.out.println("hoc luc b");
            }
            else {
                if (dtb>=5 && dtb<7){
                    System.out.println("hoc luc c");
                }
                else {
                    if (dtb>5){
                        System.out.println("hoc luc f");
                    }
                }
            }
        }
    }
}