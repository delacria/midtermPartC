/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printgrades;


/**This class takes String input grade code a+,a,b,c from user 
 * and calls method gradeDetail to print the 
 * grades: Excellent,Very good,Good and Satisfactory.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enum which avoids String input 
 * then print the grade details. 
 * @author delacria
 */

public class PrintGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
      {
    
    Grades t= new Grades();
    
  
    System.out.println("All Grades:");
    
    for (GradeCodes.GradeCode gradeCode : GradeCodes.GradeCode.values()) {
        System.out.print(gradeCode + ": ");
        t.gradeDetail(gradeCode);
    }
    }  // TODO code application logic here
    
   
}
