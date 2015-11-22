/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudsim.penalty;

import cloudsim.ext.Constants;


/**
 *
 * @author aristocrat
 */
public class calulatePenalty {
    
    double TimeTaken;
    double TimeGiven;
    String BSP;
    double cost;
    int i;

    public calulatePenalty(double TimeGiven,double TimeTaken,String BSP) {
        this.BSP = BSP;
        this.TimeGiven = TimeGiven;
        this.TimeTaken = TimeTaken;      
        System.out.println("Obtained Data : " + TimeGiven + "  "+ TimeTaken+"  "  + BSP);
         i++;       
    }
    
    public double getPenaltyCost()
    {
        
        System.out.println("Obtained Data in method: " + TimeGiven + "  "+ TimeTaken+"  "  + BSP);
       
        cost =0;
        if (TimeGiven >= TimeTaken)
        {
            cost = 0;
        }
       
        else if(BSP.equals(Constants.BROKER_POLICY_ACO))
        {
            cost = (TimeTaken - TimeGiven) /100;
        }
        else if(BSP.equals(Constants.BROKER_POLICY_DYNAMIC))
        {
            cost = (TimeTaken - TimeGiven + 0.05) /100;
        }
        else if(BSP.equals(Constants.BROKER_POLICY_OPTIMAL_RESPONSE))
        {
            cost = (TimeTaken - TimeGiven + 0.06) /100;
        }
        else if(BSP.equals(Constants.BROKER_POLICY_PROXIMITY))
        {
            cost = (TimeTaken - TimeGiven + 0.07) /100;
        }
        System.out.println("Returned Value : " +cost);
        return cost;
    }
    
    
    
}
