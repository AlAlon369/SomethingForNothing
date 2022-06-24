package Others;

public class kata16 {
    public static void main(String[] args) {
        System.out.println(TwiceAsOld(45, 30));
    }
    // У бати родился 30 лет назад сын, сыну еще пока 0 лет, а бате 30.
    // Через сколько лет батя будет старше своего сына в два раза, или сколько ему потребуется лет, чтобы быть старше в два раза.


    public static int TwiceAsOld(int dadYears, int sonYears) {
        if (dadYears >= sonYears * 2) {
            return dadYears - sonYears * 2;
        } else {
            return sonYears * 2 - dadYears;
        }
    }
}
       // return 2 * sonYears - dadYears;
        // return 2 / dadYears + sonYears;
      //  return dadYears + sonYears / 4;
        // dadYears / 2 + sonYears;
        // return dadYears - 1 * sonYears;
       // return (dadYears - sonYears) - sonYears;


// Бате 30, сыну 7. Через 16 лет бате будет 36, а сыну 23.
//  assertEquals(16, TwiceAsOld.TwiceAsOld(30,7));