package hamburger;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Hamburger {


    class Solution {
        public int solution(int[] ingredient) {
            int answer1 = 0;

            StringBuilder build = new StringBuilder();

            for(int i=0; i<ingredient.length; i++) {
                build.append(ingredient[i]);
                if(build.length()>3 && build.subSequence(build.length()-4, build.length()).equals("1231")) {
                    answer1++;
                    build.delete(build.length()-4, build.length());
                }
            }

            return answer1;
        }
    }
}
