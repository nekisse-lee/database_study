package nekisse;

import java.util.Random;

/*
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| a     | int(11)     | NO   | PRI | NULL    |       |
| b     | varchar(16) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
*/
public class Main {
    private static Random r = new Random();

    public static void main(String[] args) {

        Main main = new Main();
        int count = Integer.parseInt(args[0]);
        main.genData(count, 16);

    }
    
    private void progress(int curr, int tot) {
        if (tot < 1000) {
            return;
        }
        if (curr == tot - 1) {
            System.err.println("");
        }
        if (curr % (tot / 10) == 0) {
            System.err.print("*");
        }
    }

    private void genData(int count, int clen) {
        for (int i = 0; i < count; i++) {
            progress(i, count);
            System.out.printf("%d, %s\n", i, genStr(clen));
        }

    }

    private Object genStr(int clen) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < clen; i++) {
            sb.append((char) ('a' + r.nextInt(24)));
        }
        return sb.toString();
    }
}
