package December;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Food implements Comparable<Food>{
    String food;
    int rating;
    public Food(String food,int rating){
        this.food = food;
        this.rating = rating;
    }

    public int compareTo(Food other){
        if(this.rating == other.rating){
            return this.food.compareTo(other.food);
        }
        return -1 * Integer.compare(this.rating,other.rating);
    }
}
//Food Rating system
public class Problem_17 {
    Map<String,Integer> foodRatings;
    Map<String,String> foodCuisines;
    Map<String,PriorityQueue<Food>> cuisineFoodRating;
    public Problem_17(String[] foods, String[] cuisines, int[] ratings) {
        foodRatings = new HashMap<>();
        foodCuisines = new HashMap<>();
        for(int i = 0; i < foods.length; i++){
            foodRatings.put(foods[i],ratings[i]);
            foodCuisines.put(foods[i],cuisines[i]);
        }
        cuisineFoodRating = new HashMap<>();
        for(int i = 0; i < cuisines.length; i++){
            cuisineFoodRating.computeIfAbsent(cuisines[i], k-> new PriorityQueue<>()).add(new Food(foods[i],ratings[i]));
        }
    }
    public void changeRating(String food, int newRating) {
        foodRatings.put(food,newRating);
        String cuisineName = foodCuisines.get(food);
        cuisineFoodRating.get(cuisineName).add(new Food(food,newRating));
    }
    
    public String highestRated(String cuisine) {
        Food highestRating = cuisineFoodRating.get(cuisine).peek();
        while(foodRatings.get(highestRating.food) != highestRating.rating){
            cuisineFoodRating.get(cuisine).poll();
            highestRating = cuisineFoodRating.get(cuisine).peek();
        }
        return highestRating.food;
    }
}
