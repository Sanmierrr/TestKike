package com.pro.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.pro.entity.UserInfo;
import com.pro.listener.UserInfoDataListener;

import java.io.FileInputStream;
import java.io.InputStream;

public class EasyExcelDemo {

    public static void main(String[] args) throws Exception {
        InputStream fis = new FileInputStream("D:\\UserInfo.xlsx");

        AnalysisEventListener listener = new UserInfoDataListener();

        ExcelReader excelReader = EasyExcel.read(fis, UserInfo.class, listener).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        ReadSheet readSheet2 = EasyExcel.readSheet(1).build();
        excelReader.read(readSheet);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
    }

}
