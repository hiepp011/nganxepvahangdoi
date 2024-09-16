package lienketdon;

import java.util.Scanner;

public class LinkList {
	private Link first;
	Link q = null;
	Link p = null;

	public LinkList() {
		first = null;
	}

	public void insert(String maSV, String hoTen, double diem) {
		Link nut = new Link(maSV, hoTen, diem);
		// Xác định kết quả Đậu/Rớt
		if (diem >= 5) {
			nut.setKq("Đậu");
		} else {
			nut.setKq("Rớt");
		}
	    // Xác định xếp loại
	    if (diem >= 9) {
	        nut.setXl("Xuất sắc");
	    } else if (diem >= 8) {
	        nut.setXl("Giỏi");
	    } else if (diem >= 6.5) {
	        nut.setXl("Khá");
	    } else if (diem >= 5) {
	        nut.setXl("Trung bình");
	    } else {
	        nut.setXl("Yếu");
	    }
		nut.nextLink = first;
		first = nut;
	}

	public void creatList() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String maSV = "";
			System.out.println("nhap ma sinh vien");
			maSV = scanner.nextLine();
			if (maSV.length() == 0) {
				break;
			} else {
				System.out.println("nhap ho ten: ");
				String hoTen = scanner.nextLine();
				System.out.println("nhap diem: ");
				float diem = scanner.nextFloat();
				scanner.nextLine();
				insert(maSV, hoTen, diem);
			}

		}

	}

	public void printList() {
		Link p = first;
		while (p != null) {
			System.out.println(
					p.getMaSV() + " " + p.getHoTen() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl() + " ");
			p = p.nextLink;
		}
	}

	public void printf() {
		Link p = first;
		while (p != null) {
			if (p.getDiem() >= 5) {
				System.out.println(
						p.getMaSV() + " " + p.getHoTen() + " " + p.getDiem() + " " + p.getKq() + " " + p.getXl() + " ");
				p = p.nextLink;
			}
		}
	}

	public double max() {
		Link p = first;
		double ln = first.getDiem();
		while (p != null) {
			if (ln < p.getDiem())
				ln = p.getDiem();
			p = p.nextLink;
		}
		return ln;

	}
	 public Link search(String maSV)
	    {
	    	Link p=first;
	    	while ((p!= null)&&(p.getMaSV().equals(maSV)!=true))
	    	{
	    		p=p.nextLink;
	    	}
	    	return(p);
	    }
	  public void search1(String hoTen) {
	        Link p = first;
	        while (p != null) {
	            if (p.getHoTen().equals(hoTen)) {
	                System.out.println(p.getMaSV() + ";" + p.getHoTen());
	            }
	            p = p.nextLink;
	        }
	    }
	   public void delete(String maSV)
	    {
	    	Link p= search(maSV);
	    	if(p!=null)
	    	{
	    		if (p== first) {first=first.nextLink;}
	    		else
	    		{
	    			Link v,u=first;
	    			while ((u.nextLink!=p)&&(u!=null)) u=u.nextLink;
	    			v=p.nextLink;
	    			u.nextLink=v;
	    		}
	    	}
	    }

}
