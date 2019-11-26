package retest;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QSix {
	public static void main(String[] args) throws IOException {

		File file = null;
		file = new File(args[0]);
		if (!file.isFile()) {
			System.out.println("Not a file");
			System.exit(0);
		}
		FileInputStream fis = null;
		DataInputStream dis = null;
		ArrayList<String> al = new ArrayList<String>();
		Map<Integer, String> dev = new HashMap<Integer, String>();
		Map<Integer, String> test = new HashMap<Integer, String>();
		Map<Integer, String> sales = new HashMap<Integer, String>();
		Map<Integer, String> admin = new HashMap<Integer, String>();
		try {
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String record = dis.readLine();
			while (record != null && !record.isEmpty()) {
				al.add(record);
				record = dis.readLine();
			}
			Iterator<String> iterator = al.iterator();
			while (iterator.hasNext()) {
				String next = iterator.next();
				if (next.contains("Dev")) {
					String[] split = next.split(":");
					dev.put(Integer.parseInt(split[0]), split[1]);
				} else if (next.contains("Test")) {
					String[] split = next.split(":");
					test.put(Integer.parseInt(split[0]), split[1]);
				} else if (next.contains("Sales")) {
					String[] split = next.split(":");
					sales.put(Integer.parseInt(split[0]), split[1]);
				} else if (next.contains("Admin")) {
					String[] split = next.split(":");
					admin.put(Integer.parseInt(split[0]), split[1]);
				}
			}
			System.out.println("Developer:" + dev);
			System.out.println("Testing:" + test);
			System.out.println("Finance: " + sales);
			System.out.println("Admin:" + admin);
			dis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				dis.close();
			}
			if (fis != null) {
				fis.close();
			}
		}

	}
}
