package Round2;

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids1 = {10, 2, -5};
        int[] asteroids2 = {5, 10, -2};
        int[] asteroids3 = {-5, 2};

        System.out.println(Arrays.toString(asteroidCollision(asteroids1))); // Output: [10]
        System.out.println(Arrays.toString(asteroidCollision(asteroids2))); // Output: [5, 10]
        System.out.println(Arrays.toString(asteroidCollision(asteroids3))); // Output: [-5, 2]
    }

    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> result = new ArrayList<>();
        
        for (int asteroid : asteroids) {
            // If the result list is empty or the asteroid is moving to the right, add it to the result
            if (result.isEmpty() || asteroid > 0) {
                result.add(asteroid);
            } else {
                // Asteroid is moving to the left
                boolean blasted = false;
                while (!result.isEmpty() && result.get(result.size() - 1) > 0) {
                    int prevAsteroid = result.get(result.size() - 1);
                    if (Math.abs(prevAsteroid) < Math.abs(asteroid)) {
                        // Remove the smaller asteroid
                        result.remove(result.size() - 1);
                    } else if (Math.abs(prevAsteroid) == Math.abs(asteroid)) {
                        // Both asteroids get blasted
                        result.remove(result.size() - 1);
                        blasted = true;
                        break;
                    } else {
                        // Current asteroid gets blasted
                        blasted = true;
                        break;
                    }
                }
                if (!blasted) {
                    // Add the current asteroid to the result if it didn't get blasted
                    result.add(asteroid);
                }
            }
        }
        
        // Convert the result list to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
}
