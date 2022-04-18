package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien arr[] = new SinhVien[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new SinhVien();
			System.out.println("Nhap sinh vien thu " + (i+1));
			
			System.out.println("Nhap ten sinh vien ");
			arr[i].setName(sc.nextLine());
			
			System.out.println("Nhap tuoi ");
			arr[i].setOld(sc.nextInt());
			
			System.out.println("Nhap toan ");
			arr[i].setToan(sc.nextFloat());
			
			System.out.println("Nhap hoa ");
			arr[i].setHoa(sc.nextFloat());
			
			System.out.println("Nhap ly ");
			arr[i].setLy(sc.nextFloat());
			sc.nextLine();
			}
			// in danh sach 
			float maxDtb = arr[0].dtb();
			for (int i = 0; i < arr.length; i++) {
				if (maxDtb < arr[i].dtb());
					maxDtb = arr[i].dtb();
			}
			
			for (int i = 0; i < arr.length; i++) {
				if(maxDtb == arr[i].dtb());
				System.out.println(arr[i].toString());
			}
			// sap xep mang theo dtb tang dan
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].dtb() > arr[i].dtb()) {
						SinhVien p = arr[i];
						arr[i] = arr[j];
						arr[j] = p;
					}
				}
			}
			
			
			

	}
			static void print(SinhVien arr[]) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i].toString());
				}
			}

}