package uas;

import java.util.Scanner;

public class bio {
	
	public static void main(String[]args) {
		
		String nama,ttl,alamat,nim,prodi,kelas,semester;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("------------------------BIODATA MAHASISWA-----------------------");
		System.out.println();
		
		System.out.println("NAMA   :");
		nama=keyboard.nextLine();
		
		System.out.println("TTL    :");
		ttl=keyboard.nextLine();
		
		System.out.println("ALAMAT :");
		alamat=keyboard.nextLine();
		
		System.out.println("NIM     :");
		nim=keyboard.nextLine();
		
		System.out.println("PRODI   :");
		prodi=keyboard.nextLine();
		
		System.out.println("KELAS   :");
		kelas=keyboard.nextLine();
		
		System.out.println("SEMESTER :");
		semester=keyboard.nextLine();
		
		System.out.println("===============================================================");
		System.out.println("NAMA     :" + nama);
		System.out.println("TTL      :" + ttl);
		System.out.println("ALAMAT   :" + alamat);
		System.out.println("NIM      :" + nim);
		System.out.println("PRODI    :" + prodi);
		System.out.println("KELAS    :" + kelas);
		System.out.println("SEMESTER :" + semester);
		
		
		
	}

}
