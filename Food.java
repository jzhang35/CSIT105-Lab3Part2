
package lab3part2;

/**
 *
 * @author Linda Yang
 */
public class Food 
{
    //initialize variables
    private String description;
    private int calories;

    /**
       The Food constructor method
       @param newDescription the new description of the food item
       @param newCalories the new number of calories of the food item
    */
    public Food (String newDescription, int newCalories) 
    {
        description = newDescription;
        calories = newCalories;
    }

    /**
       The getDescription method returns a description of a food item.
       @return a description of the food
    */
    public String getDescription() 
    {
        return description;
    }

    /**
       The getCalories method returns the number of
       calories in a food serving.
       @return the number of calories in a food serving
    */
    public int getCalories() 
    {
       return calories;
    }

    /**
       The SetDescription method sets the description of the food item.
       @param newDescription description the food item
    */
    public void setDescription(String newDescription) 
    {
        description = newDescription;
    }
    
    /**
       The setCalories method sets the number of calories of the food item.
       @param newCalories The number of calories of the food item
    */
    public void setCalories(int newCalories) 
    {
         calories = newCalories;
    }
    
}
