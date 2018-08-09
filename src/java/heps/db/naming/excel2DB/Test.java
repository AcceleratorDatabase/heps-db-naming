/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.excel2DB;

import java.io.File;

/**
 *
 * @author huihui
 */
public class Test {

    public static void main(String[] args) {
    
     File f=new File(System.getProperty("user.dir")+"naming_template.xlsx");
     new Data2DB().allData2DB();
    }
    
}
