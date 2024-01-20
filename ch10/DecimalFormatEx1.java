package ch10;

import java.text.*;
public class DecimalFormatEx1 {
    public static void main(String[] args) throws Exception{
        double number = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "0000000000.000",
                "##########.###",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,###.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.0000000000E0",
                "00.000000000E0",
                "000.00000000E0",
                "#.##########E0",
                "##.#########E0",
                "###.########E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###"
        };

        for(int i = 0; i < pattern.length;i++){
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n", pattern[i], df.format(number));
        }
    }
}
