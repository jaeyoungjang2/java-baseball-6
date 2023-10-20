package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    public List<Integer> createRandNumber() {
        List<Integer> randNumbers = new ArrayList<>();
        while (randNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randNumbers.contains(randomNumber)) {
                randNumbers.add(randomNumber);
            }
        }
        return randNumbers;
    }
}