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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

/**
 *
 * @author Lab
 */
public class ReadExcel {
    
    
    public List<SoundData> readExcel(int sheetNumber){
    
   List<SoundData> listSounds  = new ArrayList<SoundData>();
        
       try{ 
        File file = new File("resources/SoundImage.xlsx");
        FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
//creating Workbook instance that refers to .xlsx file  

        Workbook  wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(sheetNumber);     //creating a Sheet object to retrieve object  
        Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
       
           

while (itr.hasNext())                 
{  
Row row = itr.next();  
Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
SoundData sd = new SoundData();

while (cellIterator.hasNext())   
{  
Cell cell = cellIterator.next(); 
int columnIndex = cell.getColumnIndex();
switch (columnIndex)               
{  
case 0:    //field that represents string cell type  
//System.out.print(cell.getStringCellValue() + "\t\t\t");
   sd.setSoundFile((String)getCellValue(cell));
break;  
case 1:    //field that represents number cell type  
//System.out.print(cell.getNumericCellValue() + "\t\t\t");  
sd.setImageFile((String)getCellValue(cell));
break;

case 2:    //field that represents number cell type  
//System.out.print(cell.getNumericCellValue() + "\t\t\t");  
sd.setActualResponse((String)getCellValue(cell));
break; 

}  
}
listSounds.add(sd);  

}  
 //wb.close();
 fis.close();
 
   
       }catch(IOException e){
           e.printStackTrace(); 
       }
       
   Collections.shuffle(listSounds);
   return listSounds;     
    }
  
    
    
  // Read User Data
    
      
 public List<UserData> readUserData(){
    
   List<UserData> listUser  = new ArrayList<>();        
       try{ 
        //File file = new File("C:/Users/Lab/Desktop/userData.xlsx");
        FileInputStream fis = new FileInputStream("./result/client/userData.xlsx");   //obtaining bytes from the file  
//creating Workbook instance that refers to .xlsx file  

        Workbook  wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
        Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
      
           

while (itr.hasNext())                 
{  
Row row = itr.next();
//var r = row.getRowNum();
Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
 UserData ud = new UserData();
while (cellIterator.hasNext())   
{  
Cell cell = cellIterator.next(); 
int columnIndex = cell.getColumnIndex();
switch (columnIndex)               
{  
case 0:    //field that represents string cell type  
//System.out.print(cell.getStringCellValue() + "\t\t\t");
 ud.setName((String)getCellValue(cell));
break;  
case 1:    //field that represents number cell type  
//System.out.print(cell.getNumericCellValue() + "\t\t\t");  
ud.setAge(((Double)getCellValue(cell)).intValue());
break;

case 2:    //field that represents number cell type  
//System.out.print(cell.getNumericCellValue() + "\t\t\t");  
ud.setGender((String)getCellValue(cell));
break; 

}  
}

listUser.add(ud);

}  
 //wb.close();
 fis.close();
 
   
       }catch(Exception e){
           e.printStackTrace(); 
       }
          
   return listUser;     
   
 }
    
    
 public void deleteUser(int index){
 
     FileInputStream fis;
        try {
            fis = new FileInputStream("result/client/userData.xlsx");
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheetAt(0);
            int lastRowNum=sheet.getLastRowNum();
 if(index>=0&&index<lastRowNum){
        sheet.shiftRows(index+1,lastRowNum, -1);
        
    }
 if(index==lastRowNum){
        Row removingRow=sheet.getRow(index);
        if(removingRow!=null){
            sheet.removeRow(removingRow);
        }
    }
         try (FileOutputStream file = new FileOutputStream("result/client/userData.xlsx")) {
             wb.write(file);
         }          
   
            
        } catch (IOException ex) {
            Logger.getLogger(ReadExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
     

 
 
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  private Object getCellValue(Cell cell)
{
 
    // Now either do-while or switch can be used
    // to display menu/user's choice
 
    // Switch case is used here for illustration
    // Switch case to get the users choice
    switch (cell.getCellType()) {
 
        // Case 1
        // If cell contents are string
    case Cell.CELL_TYPE_STRING:
        return cell.getStringCellValue();
 
        // Case 2
        // If cell contents are Boolean
    case Cell.CELL_TYPE_BOOLEAN:
        return cell.getBooleanCellValue();
 
        // Case 3
        // If cell contents are Numeric which includes
        // int, float , double etc
    case Cell.CELL_TYPE_NUMERIC:
        return cell.getNumericCellValue();
    }
 
    // Case 4
    // Default case
    // If cell contents are neither
    // string nor Boolean nor Numeric,
    // simply nothing is returned
    return null;
}
    
}
