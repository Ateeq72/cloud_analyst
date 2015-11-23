/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudsim.penalty;

import cloudsim.ext.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author aristocrat
 */
public class calulatePenalty {

    double TimeTaken;
    double TimeGiven;
    String BSP;
    double cost;
    static int i = 1;
    static int j;
    public static ArrayList<Double> perucp = new ArrayList<>();


    public void setcalulatePenalty(double TimeGiven, double TimeTaken, String BSP) {
        this.BSP = BSP;
        this.TimeGiven = TimeGiven;
        this.TimeTaken = TimeTaken;


    }

    public double getPenaltyCost() {
        j += i;

        System.out.println("Obtained Data in method: " + TimeGiven + "  " + TimeTaken + "  " + BSP);

        cost = 0;
        if (TimeGiven >= TimeTaken) {
            cost = 0;
        } else if (BSP.equals(Constants.BROKER_POLICY_ACO)) {
            cost = (TimeTaken - TimeGiven) / 100;
        } else if (BSP.equals(Constants.BROKER_POLICY_DYNAMIC)) {
            cost = (TimeTaken - TimeGiven + 0.05) / 100;
        } else if (BSP.equals(Constants.BROKER_POLICY_OPTIMAL_RESPONSE)) {
            cost = (TimeTaken - TimeGiven + 0.06) / 100;
        } else if (BSP.equals(Constants.BROKER_POLICY_PROXIMITY)) {
            cost = (TimeTaken - TimeGiven + 0.07) / 100;
        }

        perucp.add( cost);


        System.out.println("Penalty Cost for CU" + j + ":  " + cost);


        return cost;
    }


}
    

