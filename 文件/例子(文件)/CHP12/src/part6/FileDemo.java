package part6;
//文件
import java.io.File;
public class FileDemo {
	public static void main(String args[]) {
		String [] files = {"file1.txt", "file2.txt", "file3.txt"};
		fileInfo(files);
	}  

	public static void fileInfo(String[] files) {
		for (int i = 0; i < files.length; i++) {
			File f = new File(files[i]);
			if (f.exists()) {
				System.out.println("getName: " + f.getName());
				System.out.println("getPath: " + f.getPath());
				System.out.println("getParent: " + f.getParent());
				System.out.println("length: " + f.length());
			} else
				System.out.printf("文件%s不存在", files[i]);
			System.out.println();
		} 
	}
} 
