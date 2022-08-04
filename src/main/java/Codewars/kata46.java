package Codewars;

public class kata46 {
    public static void main(String[] args) {
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }
    // ЦЕПОЧКА DNA должна дополнять друг друга. Она содержит следующие символы: "A, T, G, C"
    // Если приходит element "A" , мы меняем его на element "T", и наоборот.
    // Если приходит element "G" , мы меняем его на element "С" , наоборот.

    // План
    // повеситься, пока не поздно.
    // charAt(); как использовать хз.
    // StringBuilder, append нужный element "char"

    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char x = dna.charAt(i);
            if (dna.charAt(i) == 'A') {
                sb.append('T');
            }
            if (dna.charAt(i) == 'T') {
                sb.append('A');
            }
            if (dna.charAt(i) == 'G') {
                sb.append('C');
            }
            if (dna.charAt(i) == 'C' ) {
                sb.append('G');
            }
        }
        return sb.toString();
    }
}
