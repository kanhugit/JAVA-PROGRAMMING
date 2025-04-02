package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRankManager {
    public static void main(String[] args) {
        List<Learner> learners = new ArrayList<>();
        learners.add(new Learner(1, "KANHA", 85));
        learners.add(new Learner(2, "GANA", 92));
        learners.add(new Learner(3, "MAHESH", 85));
        learners.add(new Learner(4, "SRIDHAR", 95));
        learners.add(new Learner(5, "WESTFELLOW", 92));

        Collections.sort(learners);

        // Assign ranks
        int rank = 1;
        for (int i = 0; i < learners.size(); i++) {
            if (i > 0 && learners.get(i).marks == learners.get(i - 1).marks) {
                learners.get(i).rank = learners.get(i - 1).rank;
            } else {
                learners.get(i).rank = rank;
            }
            rank++;
        }

        for (Learner learner : learners) {
            System.out.println(learner);
        }
    }
}

