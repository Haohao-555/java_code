package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class A {
	/*
	 * *读取文件方法
	 */
	@SuppressWarnings("resource")
	public String readFile(String strpath) {
		System.out.println("readFile:" + strpath);
		String res = null;
		StringBuilder sb = new StringBuilder();
		int n = 0;
		try {
			File file = new File(strpath);
			InputStreamReader br = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader reader = new BufferedReader(br);
			String str;
			while ((str = reader.readLine()) != null) {
				System.out.println("readFiledddd:" + strpath);
				sb.append(str + "\n");
				System.out.println("55:" + str);
				n += 1;
				System.out.println("44:" + n);
				

			}
			res = sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	private StringBuffer sb = new StringBuffer();

	/*
	 * 实现写入文件方法
	 */
	private void writeFile(File file, String content) {
		if (file == null || content == null) {
			return;
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
