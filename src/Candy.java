/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Candy extends DessertItem {

    //Instance Variables
    //Stores the weight of the candy 
    private double candyWeight;
    //Stores the price per pounds of the candy
    private int pricePerLbs;

    /**
     * Constructor to initialize the instance variables
     *
     * @param name the name of the candy
     * @param weight the weight of the candy
     * @param pricePerLbs the price per pounds of the candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        //Gets the name from the super class(DessertItem)
        super(name);
        //Initializes the candy weight
        this.candyWeight = weight;
        //initializes the price per pounds of the candy 
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * A method that returns the string drawing of the object.
     * @return the name, the weight, price per pounds and cost of the candy 
     */
    public String toString() {
        //Converts the cost of the candy 
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate the amount of spaces left over
        int numOfSpace = 30 - this.getName().length() - output.length();
        //keep adding space according to the number of spaces left.
        for (int i = 0 ; i < numOfSpace; i++) {
           output = " " + output; 
        }
        return this.candyWeight + " lbs. " + "@ $" + this.pricePerLbs*0.01 + " /lb. \n" 
                + this.getName() + output;
    }

    /**
     * a method to get the weight of the candy
     * @return the candy weight
     */
    public double getWeight() {
        return candyWeight;

    }

    /**
     * a method to get the price per pound of candy
     * @return the price per pound
     */
    public int getpricePerLbs() {
        return pricePerLbs;
    }

    /**
     * a method to calculate the total cost of candy
     * @return temp round the double to an integer
     */
    @Override
    public int getCost() {
        double count = candyWeight * pricePerLbs;
        int temp = (int) Math.round(count);
        return temp;
    }
}
