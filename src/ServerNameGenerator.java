public class ServerNameGenerator {
    static String[] adjectives = {"red", "strong", "light", "boldly", "yellow", "sharp", "dull", "quick", "slow", "tall"};
    static String[] nouns = {"cup", "sign", "building", "car", "desk", "fan", "light", "bucket", "dog", "napkin"};

    public static String RandomEl(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String makeServerName(String[] strings1, String[] strings2){
        String Nounslisted= RandomEl(strings1);
        String Adjlisted = RandomEl(strings2);
        String finalString = Nounslisted + "-" + Adjlisted;
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: (adjective - noun)");
        System.out.println(makeServerName(adjectives,nouns));
    }
}

