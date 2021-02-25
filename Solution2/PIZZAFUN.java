import java.util.ArrayList;

public class PIZZAFUN {
    static int Pno, team2, team3, team4, D;
    ArrayList<Pizza> Stock = new ArrayList<Pizza>();

    public void teamset(int p, int t2, int t3, int t4) {
        team2 = 0;
        team3 = 0;
        team4 = 0;
        Pno = p;

        // team of 2 setter//
        if (t2 > 0 && (p >= 2)) {
            if ((p / 2) > t2) {
                team2 = t2;
            } else if ((p % 2) == 0) {
                team2 = (p / 2);
            } else {
                team2 = (p / 2) - 1;
            }
            t2 = t2 - team2;
            p = p - (team2 * 2);
        }

        // team of 3 setter//
        if (t3 > 0 && (p >= 3)) {
            if ((p / 3) > t3) {
                team3 = t3;
            } else if ((p % 3) == 0) {
                team3 = (p / 3);
            } else {
                team3 = (p / 3) - 1;
            }
            t3 = t3 - team3;
            p = p - (team3 * 3);
        }

        // team of 4 setter//
        if (t4 > 0 && (p >= 4)) {
            if ((p / 4) > t4) {
                team4 = t4;
            } else if ((p % 4) == 0) {
                team4 = (p / 4);
            } else {
                team4 = (p / 4) - 1;
            }
            t4 = t4 - team4;
            p = p - (team4 * 4);
        }

        // For Distributing the left over pizza
        if ((p > 4) && (t4 > 0)) {
            team4 += 1;
            t4 -= 1;
            p -= 4;
        } else if (((p > 3) && (t3 > 0))) {
            team3 += 1;
            t3 = t3 - 1;
            p -= 3;
        } else if (((p > 2) && (t2 > 0))) {
            team2 = team2 + 1;
            t2 -= 1;
            p -= 2;
        }
        D = team2 + team3 + team4;
    }

    public void printer() {
        System.out.println("Team 2: " + team2);
        System.out.println("Team 3: " + team3);
        System.out.println("Team 4: " + team4);
        System.out.println("Total Deliveries: " + D);
        System.out.println("Total pizza left: " + (Pno - ((team2 * 2) + (team3 * 3) + (team4 * 4))));
    }

    public void add(int index, int ingcount, String[] inglist) {
        Stock.add(new Pizza(index, ingcount, inglist));
    }

    public int compare(int tno, int start, ArrayList<Pizza> plist) {
        int i, j, k;
        Pizza temp;
        k = start + tno;
        for (i = 0; i < tno; i++) {
            for (j = 0; j < tno; j++) {
                if (i != j) {
                    if (plist.get(i).ingredients.containsAll(plist.get(j).ingredients)) {
                        if (k <= plist.lastIndexOf(plist)) {
                            temp = plist.get(i);
                            plist.set(i, plist.get(k));
                            plist.set(k, temp);
                            k++;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }

}
