// 6 - Koostada programm, mis sorteerib int array, kasutades Bubble sorti. Programm peab töötama eri suuruste arraydega (10 - 1000). Programm prindib alguses välja sorteerimata array ja kui array on sorteeritud printima selle välja. Ka peab olema välja prinditud programmi loopide arv.
//7 - Koostada eelmise ülesande programmile lisafunktsioon, mis genereerib eri suurustes arrayd ja täidab nad ka ära suvaliste arvudega. Arvude vahemik on 10 - 10 000. 
import java.util.Random;

public class Kodune{
    public static void main(String[] args){
        Random r = new Random();
        int arraySize = 0; //Määramaks massiivi suurust, kuid ma eeldan, et oleks saanud ka nii, et oleksin lihtsalt igakord küsinud arrayforSorting.length väärtust.
        int loopCount = 0; //Lugemaks kordusi.
        int insertion; //Sisestamaks või muutmaks massiivis olevaid arve.
        while(arraySize<10){ //Tagamaks, et massiivis oleks vähemalt 10 arvu genereerib väiksema arvu korral uue. Läheb loopCounti kirja.
            arraySize = r.nextInt(1000);
            loopCount++;
        }
        int arrayForSorting[] = new int[arraySize]; //Tekkitame massiivi.
        for (int i = 0; i < arraySize ; i++){ //Täidame massiivi suvaliste numbritega ja loeme korduseid.
            insertion = 0;
            while(insertion < 10){
                insertion = r.nextInt(10000);
                loopCount++;
            }
            arrayForSorting[i]=insertion;
        }
        System.out.println("Sorteerimata massiiv:"); //Trükkime välja sorteerimata massiivi ja loeme korduseid.
        for (int i = 0; i < arraySize-1; i++){
            System.out.print(arrayForSorting[i]+", ");
            loopCount++;
        }
        System.out.println(arrayForSorting[arraySize-1]); //Sorteerime massiivi ja loeme korduseid.
        for (int i = 0; i < arraySize-1; i++){
            for (int j = 0; j < arraySize-i-1; j++){
                if (arrayForSorting[j] > arrayForSorting[j+1]){
                    insertion = arrayForSorting[j];
                    arrayForSorting[j] = arrayForSorting [j+1];
                    arrayForSorting[j+1] = insertion;
                    loopCount++;
                }
            }
        }

        System.out.println("Sorteeritud massiiv:"); //Trükime välja sorteeritud massiivi ja loeme korduseid.
        for (int i = 0; i < arraySize-1; i++){
            System.out.print(arrayForSorting[i]+", ");
            loopCount++;
        }
        System.out.println(arrayForSorting[arraySize-1]);
        System.out.println("Tsükklite arv: "+loopCount);//Trükime välja korduste arvu.
    }
}