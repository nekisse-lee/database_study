import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] a =  {"mislav", "stanko", "stanko", "ana"};
//        String[] a =  {"mislav", "ana", "stanko", "ana"};
        String[] b=  {"stanko", "ana", "mislav"};

        System.out.println(solution(a, b));

    }
    static private String solution2(String[] participant, String[] completion) {

        return "";

    }

    static private String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        StringBuilder p = new StringBuilder();
        StringBuilder c = new StringBuilder();
        System.out.println("participant.length = " + participant.length);
        System.out.println("completion.length = " + completion.length);
        for (String s : participant) {
            p.append(", ").append(s);
        }

        for (String s : completion) {
            c.append(", ").append(s);
        }
        System.out.println("p = " + p);
        System.out.println("c = " + c);

        int i;
        for ( i=0; i < completion.length; i++){
            System.out.println(i);
            if (!participant[i].equals(completion[i])){

                return "미완주자 " + participant[i];
            }
            System.out.println(i + "번째 " + "p= " + participant[i] + "  \tc=" + completion[i]);
        }
        return "미완주자 " + participant[i];
    }

}
