package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.Timekeeper;

public class TimeKeeperView {
	Scanner scan;
	public TimeKeeperView() {
		scan = new Scanner(System.in);
	}
	public void showMessage(String smg) {
		System.out.println("-----------");
		System.out.println(smg);
		System.out.println("-----------");
	}

	public int menu(){
		System.out.println("1. Hien thi tat ca gio lam viec");
		System.out.println("2. Hien thi Timekeeper theo thoi gian");
		System.out.println("3. Them Timekeeper");
		System.out.println("4. Sua Timekeeper");
		int choice = 0;
		choice = scan.nextInt();
		return choice;
	}
	public Timekeeper input(int choice){
		switch (choice) {
		case 2:
			BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
			Timekeeper t = new Timekeeper();
			System.out.println("Nhap thoi gian can tim (dd/mm/yyyy): ");
			String str;
			try {
				str = scan2.readLine();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
				t.setDate_Time(formatter.parse(str));
				return t;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;	
			}
		case 3:
			
			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
				
				Timekeeper insertT = new Timekeeper();
				System.out.println("Them moi Timekeeper");
				
				System.out.print("TimekeeperId: "); 
				insertT.setTimekeeper_Id(scan.readLine());
				
				System.out.println("DateTime (dd/mm/yyyy)");
				SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
				insertT.setDate_Time(formatter.parse(scan.readLine()));
				
				System.out.println("EmpId");
				insertT.setEmpId(BigInteger.valueOf((Long.parseLong(scan.readLine()))));
				
				System.out.print("InOut: "); 
				insertT.setIn_Out(scan.readLine());
				
				return insertT;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
				
			}
			
		case 4:
			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
				
				Timekeeper insertT = new Timekeeper();
				System.out.println("Sua Timekeeper");
				
				System.out.print("TimekeeperId: "); 
				insertT.setTimekeeper_Id(scan.readLine());
				
				System.out.println("DateTime (dd/mm/yyyy)");
				SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
				insertT.setDate_Time(formatter.parse(scan.readLine()));
				
				System.out.println("EmpId");
				insertT.setEmpId(BigInteger.valueOf((Long.parseLong(scan.readLine()))));
				
				System.out.print("InOut: "); 
				insertT.setIn_Out(scan.readLine());
				
				return insertT;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
				
			}
		default:
			break;
		}
		return null;
	}
	public void exit(){
		this.scan.close();
	}
	
}
