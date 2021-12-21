
import java.util.Arrays;

public class MainInputDataMahasiswa {

    public static String[][] students = new String[3][3];

    public static void main(String[] args) {

        testShowViewBeranda();
    }

    /**
     * menampilkan tempilan utama aplikasi
     */
    public static void showViewBeranda() {
        for (var i = 0; i < students.length; i++) {
            for (var j = 0; j < students[i].length; j++){
                var data = students[i];
                //create number add otomatis
                var number = i + 1;

                if (data != null) {
                    System.out.println(number + ". " + Arrays.deepToString(data));
                    break;
            }
            }
        }
    }
    //Method untuk mengetes ShowViewBeranda
    public static void testShowViewBeranda (){
        students = new String[][]{
                {"Suhendri","18110460","TI-M1803"},
                {"Fahri Abizar","18110445","TI-P1802"},
                {"Zainul Nadawi", "18110355","TI-M1803"}
        };

        showViewBeranda();
    }
}
