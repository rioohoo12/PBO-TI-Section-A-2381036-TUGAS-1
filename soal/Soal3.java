package soal;

public class Soal3 {
    public static void main(String[] args) {
        //Contoh Penggunaan
        System.out.println(countCamelCaseWords("satuDuaTiga")); //Ouput: 3
        System.out.println(countCamelCaseWords("saveChangesInEditor")); //Ouput : 5
    }

    public static int countCamelCaseWords(String camelCaseString) {
        //Jika string kosong, tidak ada kata
        if (camelCaseString == null || camelCaseString.isEmpty()) {
            return 0;
        }

        //Mulai dengan 1 karena kata pertama tidak dimulai dengan huruf kapital ;
        int count = 1;

        // Iterasi setiap karakter dalam string
        for (char c : camelCaseString.toCharArray()) {
            //Jika karakter adalah huruf kapital, itu berarti kata baru dimulai
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }
}