/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttuhsc.speechperception.utility;

import com.ttuhsc.speechperception.vo.SoundData;
import com.ttuhsc.speechperception.vo.UserData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Lab
 */
public class WriteExcel {
    
    public void writeExcel(List<SoundData> list,UserData user,String soundCategory) throws IOException{
    

      Workbook workbook;
      int rowno=1;
      SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
       Date date = new Date();
      String currentDate= formatter.format(date);
      String userName = user.getName();
      String sessionNumber = user.getSessionNumber().toString();
      File dir = new File("./result/client_result/"+userName+"/"+currentDate+"/"+sessionNumber);
      if(!dir.exists()){
      dir.mkdirs();
      }
      File file = new File("./result/client_result/"+userName+"/"+currentDate+"/"+sessionNumber+"/result.xlsx");
     int correctResponse=0;
     int incorrectResponse=0;
      try{
      if(!file.exists()){
      file.createNewFile();
         
       
  workbook = new XSSFWorkbook();
      }else{
     workbook= WorkbookFactory.create(new FileInputStream(file));
      }
      Sheet sheet=workbook.createSheet(soundCategory);
      Row r=sheet.createRow(0);
      r.createCell(0).setCellValue("Sound File");
      r.createCell(1).setCellValue("Actual Response");
      r.createCell(2).setCellValue("User Response");
        
        
       for(SoundData sd : list) {
           
           if(sd.getActualResponse().equalsIgnoreCase(sd.getUserResponse())){
           correctResponse++;
           }else{
           incorrectResponse++;
           }
                Row row=sheet.createRow(rowno++);
                row.createCell(0).setCellValue(sd.getSoundFile());
                row.createCell(1).setCellValue(sd.getActualResponse());
                row.createCell(2).setCellValue(sd.getUserResponse());
            }
       
       Row row1=sheet.createRow(14);
       row1.createCell(0).setCellValue("Result");
       Row row2=sheet.createRow(15);
       row2.createCell(0).setCellValue("Correct Responses");
       row2.createCell(1).setCellValue(correctResponse);
       Row row3=sheet.createRow(16);
       row3.createCell(0).setCellValue("Incorrect Responses");
       row3.createCell(1).setCellValue(incorrectResponse);
       Row row4=sheet.createRow(17);
       row4.createCell(0).setCellValue("Accuracy");
       int acc= correctResponse*100/10;
       row4.createCell(1).setCellValue(acc+"%");
            FileOutputStream filestream = new FileOutputStream(file);
            workbook.write(filestream);
            filestream.close();
            System.out.println("Data Copied to Excel");
      }catch(Exception e){
          System.err.println(e);
      }
      
    }
    
    public void writeUserData(UserData user) throws IOException{
    
      String excelFilePath = "./result/client/userData.xlsx";
        FileInputStream  myxls = new FileInputStream(new File(excelFilePath));
      XSSFWorkbook workbook=new XSSFWorkbook(myxls);
      XSSFSheet sheet=workbook.getSheetAt(0);
      int lastRowNum = sheet.getLastRowNum();
     
                XSSFRow row=sheet.createRow(++lastRowNum);
                row.createCell(0).setCellValue(user.getName());
                row.createCell(1).setCellValue(user.getAge());
                row.createCell(2).setCellValue(user.getGender());
             
            myxls.close();
            FileOutputStream file = new FileOutputStream("./result/client/userData.xlsx");
            workbook.write(file);
            file.close();
            System.out.println("Data Copied to Excel");

      
    }
    
}
