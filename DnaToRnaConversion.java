import java.util.Locale;
import java.util.Scanner;
/*
Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four
nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure
and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

Create a function which translates a given DNA string into RNA.
 */

public class DnaToRnaConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adn = scanner.nextLine().toUpperCase(Locale.ROOT);

        System.out.println(dnaToRna(adn));

    }

    public static String dnaToRna(String dna) {

        dna = dna.replace('T','U');

        return dna;  // Do your magic!
    }
}
