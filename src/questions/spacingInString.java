package questions;

public class spacingInString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
        for (int space : spaces) {
            sb.insert(space + cnt, " ");
            cnt++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        spacingInString ss = new spacingInString();
        int arr9[] = {8,13,15};
        System.out.println(ss.addSpaces("LeetcodeHelpsMeLearn",arr9));
    }
}
