import java.util.HashSet;

public class FindCommonWords {

    public static void main(String[] args) {
        String sen1 = "have common words abc xyz";
        String sen2 = "dont have common words xyz pqr";

        String[] ans1 = sen1.split(" ");
        String[] ans2 = sen2.split(" ");

        HashSet<String> hs = new HashSet<>();
//        hs.addAll(Arrays.asList(ans1));
        for (int i = 0; i < ans1.length; i++) {
            hs.add(ans1[i]);
        }

        for (int i = 0; i < ans2.length; i++) {
            if(hs.contains(ans2[i])){
                System.out.print(ans2[i] + " ");
            }
        }
//        for (String s : ans2) {
//            if (hs.contains(s)) {
//                System.out.print(s + " ");
//            }
//        }
    }
}
