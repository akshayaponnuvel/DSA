package Round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asteroid {
    
    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};

        int[] ans = afterCollision(asteroids);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] afterCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for (int asteroid : asteroids) {
            if (list.isEmpty() || asteroid > 0) {
                list.add(asteroid);
            } else {
                boolean blasted = false;
                while (!list.isEmpty() && list.get(list.size() - 1) > 0) {
                    int prevAsteroid = list.get(list.size() - 1);
                    if (Math.abs(prevAsteroid) < Math.abs(asteroid)) {
                        list.remove(list.size() - 1);
                    } else if (Math.abs(prevAsteroid) == Math.abs(asteroid)) {
                        list.remove(list.size() - 1);
                        blasted = true;
                    } else {
                        blasted = true;
                        break;
                    }
                }
                if (!blasted) {
                    list.add(asteroid);
                }
            } 
        }
    
        return convertToArray(list);
    }
    
    private static int[] convertToArray(List<Integer> list) {
        int[] ans = new int[list.size()];
        int index = 0;
        for (int value : list) {
            ans[index++] = value;
        }
        return ans;
    }
}
