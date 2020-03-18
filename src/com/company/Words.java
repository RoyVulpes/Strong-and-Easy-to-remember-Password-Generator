package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Words {

    List<String> VERBS_LIST = new ArrayList<>();
    List<String> NOUNS_LIST = new ArrayList<>();
    List<String> ADJECTIVES_LIST = new ArrayList<>();
    List<String> ADVERBS_LIST = new ArrayList<>();


    public Words() {

        VERBS_LIST.add("runs");
        VERBS_LIST.add("combs");
        VERBS_LIST.add("smells");
        VERBS_LIST.add("eats");
        VERBS_LIST.add("writes");
        VERBS_LIST.add("listens");
        VERBS_LIST.add("complains");

        NOUNS_LIST.add("dog");
        NOUNS_LIST.add("horse");
        NOUNS_LIST.add("fox");
        NOUNS_LIST.add("man");
        NOUNS_LIST.add("woman");
        NOUNS_LIST.add("bat");
        NOUNS_LIST.add("watch");

        ADJECTIVES_LIST.add("quickly");
        ADJECTIVES_LIST.add("greatly");
        ADJECTIVES_LIST.add("spectacularly");
        ADJECTIVES_LIST.add("awesomely");
        ADJECTIVES_LIST.add("terribly");
        ADJECTIVES_LIST.add("stupendously");

        ADVERBS_LIST.add("daily");
        ADVERBS_LIST.add("everywhere");
        ADVERBS_LIST.add("absentmindedly");
        ADVERBS_LIST.add("competitively");
        ADVERBS_LIST.add("afterwards");
        ADVERBS_LIST.add("carefully");
        ADVERBS_LIST.add("savagely");
        ADVERBS_LIST.add("remorsefully");
    }

    public String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String generatePassword() {

        Random r = new Random();

        int randomVerb = r.nextInt(VERBS_LIST.size());
        int randomNoun = r.nextInt(NOUNS_LIST.size());
        int randomAdjective = r.nextInt(ADJECTIVES_LIST.size());
        int randomAdverb = r.nextInt(ADVERBS_LIST.size());

        String[] wordsMashup = new String[] {NOUNS_LIST.get(randomNoun), VERBS_LIST.get(randomVerb), ADJECTIVES_LIST.get(randomAdjective), ADVERBS_LIST.get(randomAdverb)};

        String randomPassword = capitalize(NOUNS_LIST.get(randomNoun)) + capitalize(VERBS_LIST.get(randomVerb)) + capitalize(ADJECTIVES_LIST.get(randomAdjective)) + capitalize(ADVERBS_LIST.get(randomAdverb));

//        for (String word : wordsMashup) {
//            System.out.println(word);
//        }
        return randomPassword;
    }

//    public String howToRemember() {
//        return
//    }

}
