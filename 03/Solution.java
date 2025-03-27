import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {
        char[] characters = s.toCharArray();
        Stack<Character> validatorStack = new Stack<>();
        Map<Character, Character> closeValidator = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );
        for(char character : characters) {
            if(validatorStack.isEmpty()) {
                validatorStack.add(character);
                continue;
            }

            if(closeValidator.containsKey(character)){
                char top = validatorStack.peek();
                if(closeValidator.get(character) == top){
                    validatorStack.pop();
                } else {
                    return false;
                }
            } else {
                validatorStack.add(character);
            }

        }
        return validatorStack.isEmpty();
    }

    public static void main(String[] args) {
        boolean result = isValid("([]){}");
        System.out.println(result);
    }
}
