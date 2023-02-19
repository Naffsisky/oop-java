package javaapplication1;
import java.util.Scanner;

class karyawan{
    String departemen;
    String pengalaman;
    String skill;
    int gajiDepartemen;
    int gajiPengalaman;
    int gajiSkill;

    // membuat percabangan departemen dan gajinya
    String gajiDepartemen(){
        departemen = departemen.toLowerCase();
        if ("it".equals(departemen)){
            gajiDepartemen = 8000000;
        } else if ("hrd".equals(departemen)){
            gajiDepartemen = 5000000;
        } else if ("finance".equals(departemen)){
            gajiDepartemen = 4000000;
        } else{
            gajiDepartemen = 0;
        }
        return "Gaji Departemen\t: " + gajiDepartemen;
    }
    
    // membuat percabangan pengalaman dan gajinya
    String gajiPengalaman(){
        pengalaman = pengalaman.toLowerCase();
        if ("pemula".equals(pengalaman)){
            gajiPengalaman = 500000;
        } else if ("menengah".equals(pengalaman)){
            gajiPengalaman = 1000000;
        } else if ("expert".equals(pengalaman)){
            gajiPengalaman = 2000000;
        } else{
            gajiPengalaman = 0;
        }
        return "Gaji Pengalaman\t: " + gajiPengalaman;
    }

    // membuat percabangan skill dan gajinya
    String gajiSkill(){
        skill = skill.toLowerCase();
        if ("web".equals(skill)){
            gajiSkill = 1000000;
        } else if ("mobile".equals(skill)){
            gajiSkill = 2000000;
        } else if ("desktop".equals(skill)){
            gajiSkill = 2500000;
        } else{
            gajiSkill = 0;
        }
        return "Gaji Skill\t: " + gajiSkill;
    }
}

public class JavaApplication1 {

    public static void main(String[] args) {

        karyawan input = new karyawan();
        Scanner user = new Scanner(System.in);
        
        System.out.print("Nama\t\t: ");
        String nama = user.nextLine();
        System.out.print("Alamat\t\t: ");
        String alamat = user.nextLine();
        
        System.out.print("Departemen\t: ");
        input.departemen = user.nextLine();
        System.out.print("Pengalaman\t: ");
        input.pengalaman = user.nextLine();
        System.out.print("Skill\t\t: ");
        input.skill = user.nextLine();

        // input.departemen = ("IT");
        // input.pengalaman = ("pemula");
        // input.skill = ("desktop");

        input.departemen = input.departemen.toUpperCase();
        input.pengalaman = input.pengalaman.toUpperCase();
        input.skill = input.skill.toUpperCase();
        nama = nama.toUpperCase();
        alamat = alamat.toUpperCase();
        System.out.println("\n\n=====================================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Departemen\t: " + input.departemen);
        System.out.println("Pengalaman\t: " + input.pengalaman);
        System.out.println("Skill\t\t: " + input.skill);
        System.out.println("=====================================");
        System.out.println(input.gajiDepartemen());
        System.out.println(input.gajiPengalaman());
        System.out.println(input.gajiSkill());
        System.out.println("=====================================");
        System.out.println("Total Gaji\t: " + (input.gajiDepartemen + input.gajiPengalaman + input.gajiSkill));
    }
    
}
