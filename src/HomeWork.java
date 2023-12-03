import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        /*  3. Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой.Метод
  возвращает boolean
  abcd  - bcda acbd - анаграммы
  abcd -    acb  abkc - не анаграммы*/

        String str1 ="abcd";
        String str2 = "bcda";
        boolean result = checkAnagram(str1,str2);

        if (result){
            System.out.println(str1  + ","  +  str2 + "This is Anagram"  );

        }else{
            System.out.println(str1 +  "," +  str2  +  "="  + "This is not Anagram");
        }



        }
        public static boolean checkAnagram(String str1,String str2){
        if (str1.length() != str2.length()){

        }
        return false;
        }




    }









