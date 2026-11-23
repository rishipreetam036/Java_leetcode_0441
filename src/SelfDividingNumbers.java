import java.util.*;
class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int value = left; value <= right; value++) {
            int remaining = value;
            boolean valid = true;
            while (remaining > 0) {
                int digit = remaining % 10;
                if (digit == 0 || value % digit != 0) { valid = false; break; }
                remaining /= 10;
            }
            if (valid) result.add(value);
        }
        return result;
    }
}
