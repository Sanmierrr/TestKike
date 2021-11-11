package com.pro.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.write.metadata.WriteSheet;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class EasyExcelTest {

    @Data
    @ColumnWidth(20)
    public static class TestVO {
        @ExcelProperty( value = "姓名",index = 0)
        private String name;
        @ExcelProperty( value = "年龄",index = 1)
        private int age;
        @ExcelProperty( value = "学校",index = 2)
        private String school;
    }
    /**
     * 多个sheet导入测试
     * @throws FileNotFoundException
     */
    @Test
    public void sheetImport() throws FileNotFoundException {
        // 输出流
        OutputStream outputStream = null;
        outputStream = new FileOutputStream(new File("D:/1.xlsx"));

        // 导出的数据
        List<TestVO> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestVO testVO = new TestVO();
            testVO.setAge(i + 20);
            testVO.setName("vo" + i);
            testVO.setSchool("school" + i);
            dataList.add(testVO);
        }

        // 标题
        List<String> headList = Arrays.asList("姓名", "年龄", "学校");

        // 测试多sheel导出
        ExcelWriter excelWriter = EasyExcel.write(outputStream).build();
        WriteSheet test1 = EasyExcel.writerSheet(0, "test1").head(TestVO.class).build();
        WriteSheet test2 = EasyExcel.writerSheet(1, "test2").head(TestVO.class).build();
        excelWriter.write(dataList,test1).write(dataList,test2);
        excelWriter.finish();
    }
}
