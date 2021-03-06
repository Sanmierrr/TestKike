package com.pro.test;

import com.pro.entity.FileCnt;

import java.io.File;
import java.util.HashMap;

/**
* 统计某个目录下所有各种文件类型的数量
*/
public class StaticFile {

    public static void main(String[] args) {
        HashMap<String , FileCnt> myFilemap = new HashMap<String ,FileCnt>();
        staticFile(myFilemap,"D:\\untitled");
        myFilemap.forEach((x,y)->{
            System.out.println("filetype : " +x + " num :" + y );
        });
    }

    static void  staticFile(HashMap<String ,FileCnt> fileMap, String filePath){
        File file = new File(filePath);
        if (file.exists()){
            // 如果是目录 则递归调用
            if(file.isDirectory()){
                String[] list = file.list();
                for (String afile:list) {
                    staticFile(fileMap,filePath + "\\" + afile );
                }
                // 如果是文件 则处理map集合中的数据
            }else {

                // 获取扩展名 以及文件名称
                int lastgg  = filePath.lastIndexOf("\\");
                if (lastgg <=0 ){
                    return;
                }
                // 得到文件的名称
                String fileName = filePath.substring(lastgg+1);
                // 没有扩展名的情况
                String suffix = "notype";

                //获取扩展名
                if(fileName.lastIndexOf('.')>0){
                    try {
                        suffix = fileName.substring(fileName.lastIndexOf('.' )+1);
                    }catch (StringIndexOutOfBoundsException e){
                        System.out.println("filename error : " + fileName);
                    }
                }
                // 如果该类型已经存在于map中
                // 则原有的基础之上自增
                // 否则创建新的对象保存在map中
                if (fileMap.get(suffix)==null){
                    fileMap.put(suffix,new FileCnt(suffix, 1));
                }else{
                    fileMap.get(suffix).increaseNum();
                }
            }
        }
    }
}
