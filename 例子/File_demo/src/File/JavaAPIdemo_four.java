package File;

import java.io.File;

public class JavaAPIdemo_four {
    public static void main(String[] args) {
		File file=new File("e:"+File.separator+"javawork"+File.separator+"File_demo"+File.separator+"hello"+File.separator+"demo");
		long start=System.currentTimeMillis();
		renameDir(file);
		long end=System.currentTimeMillis();
		System.out.println("执行的时间为"+(end-start));
	}
    public static void renameDir(File file){
    	if(file.isDirectory()){
    		File result[]=file.listFiles();
    		if(result!=null){
    			for(int x=0;x<result.length;x++){
    				renameDir(result[x]);
    			}
    		}
    	}else if(file.isFile()){//如果是文件则进行重命名
    		String filename=null;
    		//截取掉后缀名
    		if(file.getName().contains(".")){//如果文件中有包含"."
    			filename=file.getName().substring(0,file.getName().lastIndexOf("."))+".py";
    			//截取文件名字（不包括后缀名）在添加后缀名为".txt"
    		}else{//文件命名没有后缀名
    			filename=file.getName()+".py";
    		}
    		File newfile=new File(file.getParentFile(),filename);//新的文件名字
    		file.renameTo(newfile);//重新命名
    	}
    }
}
