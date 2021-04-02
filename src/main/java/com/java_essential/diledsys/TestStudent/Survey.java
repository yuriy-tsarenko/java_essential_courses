package com.java_essential.diledsys.TestStudent;

public class Survey {
    private int count = 0;

    public int task() {
        for (int i = 1; i < 5; i++) {
            System.out.println(Base.qusting.get(i));
            int v = rnd(3);
            for (int j = 1; j <= 4; j++) {
                int q = rnd(11);

                if (j == v) System.out.println(Base.num.get(j) + ". " + Base.answer.get(i));
                else if (q != i) System.out.println(Base.num.get(j) + ". " + Base.answer.get(q));
            }
            String answer = Scan.input("ваш ответ:");
            System.out.println();
            if (answer.equals(Base.num.get(v))) {
                System.out.println(count++);
            }
        }
        return count;
    }

    private int rnd(int d) {
        return (int) (1 + Math.round(Math.random() * d));
    }
}
