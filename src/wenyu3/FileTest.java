package wenyu3;

import java.io.File;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("/Users/wenyu/Downloads/wen.java");
		System.out.println("是否存在该文件：" + file.exists());
		System.out.println("文件长度：" + file.length());
		System.out.println("是否可写：" + file.canWrite());
		System.out.println("是否可读：" + file.canRead());
		System.out.println("是否是一个目录：" + file.isDirectory());
		System.out.println("是否是绝对路径：" + file.isAbsolute());
		System.out.println("文件是隐藏：" + file.isHidden());
		System.out.println("文件的绝对路径是：" + file.getAbsolutePath());
		System.out.println("Last modified on " + new Date(file.lastModified()));// 返回文件最后被修改的时间Date类显示是为了易读性
	}

}
