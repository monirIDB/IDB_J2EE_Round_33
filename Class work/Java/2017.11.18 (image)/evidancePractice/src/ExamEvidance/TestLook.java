/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExamEvidance;

import javax.swing.UIManager;

/**
 *
 * @author 1163660
 */
public class TestLook {
    public static void main(String [] aerd){
    
    UIManager.LookAndFeelInfo[] looks= UIManager.getInstalledLookAndFeels();
    for(UIManager.LookAndFeelInfo s:looks ){
    
    System.out.println(s.getClassName());
    }
    }
    
}
