package cyou.lositha.springehcacheexample;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomCharDemo {

    public String randomString() {

        System.out.println("===================== 2 method");

        String[] randomStrings = new String[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char[] word = new char[random.nextInt(8) + 3];
            // words of length 3 through 10. (1 and 2 letter words are boring.)
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }

        for (String randomString : randomStrings) {
            System.out.println(randomString);
        }

        return randomString();

    }

}
