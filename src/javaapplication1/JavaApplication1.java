/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author naffsisky
 */

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
        if (null == departemen){
            gajiDepartemen = 0;
        } else gajiDepartemen = switch (departemen) {
            case "it" -> 8000000;
            case "hrd" -> 5000000;
            case "finance" -> 4000000;
            default -> 0;
        };
        return "Gaji Departemen\t: " + gajiDepartemen;
    }
    
    // membuat percabangan pengalaman dan gajinya
    String gajiPengalaman(){
        pengalaman = pengalaman.toLowerCase();
        if (null == pengalaman){
            gajiPengalaman = 0;
        } else gajiPengalaman = switch (pengalaman) {
            case "pemula" -> 500000;
            case "menengah" -> 1000000;
            case "expert" -> 2000000;
            default -> 0;
        };
        return "Gaji Pengalaman\t: " + gajiPengalaman;
    }

    // membuat percabangan skill dan gajinya
    String gajiSkill(){
        skill = skill.toLowerCase();
        if (null == skill){
            gajiSkill = 0;
        } else gajiSkill = switch (skill) {
            case "web" -> 1000000;
            case "mobile" -> 2000000;
            case "desktop" -> 2500000;
            default -> 0;
        };
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