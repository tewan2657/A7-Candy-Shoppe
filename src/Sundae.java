/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Sundae extends IceCream {

    //Instance Variables
    //Stores the name of the topping 
    private String toppingName;
    //Stores the cost of the topping 
    private int toppingCost;

    /**
     *
     * @param icName name of the ice Cream
     * @param icCost cost of the ice Cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {

        super(icName, icCost);

        //initializes both the topping cost and name
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    /**
     *
     * @return
     */
    public String getTName() {
        return toppingName;
    }

    /**
     * 
     * @return 
     */
    public int getToppingCost() {
        return toppingCost;
    }

    public String toString() {
        return null;

    }

}
