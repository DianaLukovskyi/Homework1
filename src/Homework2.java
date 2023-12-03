public class Homework2 {
    public static void main(String[] args) {
        int index=3;
        String str = "Hello";
        String result = removeCharAtlndex(str,index);
        System.out.println(" Without character"  + index +  ":" + result);


    }


    public static String removeCharAtlndex(String str, int index) {
        if (index < 0 || index >= str.length()){

        }
        return str.substring(0,index) + str.substring(index +1);

    }
}
