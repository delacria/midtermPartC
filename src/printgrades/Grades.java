/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printgrades;

/**
 *
 * @author delacria
 */


public class Grades {
  public void gradeDetail(GradeCodes.GradeCode code)
{
  switch(code)
        {
        case APLUS: System.out.println("EXCELLENT");
        break;
        case A: System.out.println("VERY GOOD");
        break;
        case B:
        System.out.println("GOOD");
        break;
        case C: 
            System.out.println("SATISFACTORY");
        break;
        
        default:
         System.out.println("NOT VALID CODE");
        break;
 
        }
}
}
