public class StringMethods {
    public static void main(String args[]){
        String st = "   Hello, my name is Darshan. Nice to meet you!     ";
        System.out.println(st);

        // length
        System.out.println(st.length());

        // to lower case
        System.out.println(st.toLowerCase());

        // to upper case
        System.out.println(st.toUpperCase());

        // trim
        System.out.println(st.trim());

        // substring
        System.out.println(st.substring(10, 13)); // can't have jumps or negative indices and last index is exclusive

        /*
         NOTE: Replace will replace all the instances of the substring
        */
        // replace characetr
        System.out.println(st.replace("H", "B"));

        // replace substring    
        System.out.println(st.replace("Hello", "Bye"));

        // startswith
        System.out.println(st.startsWith("H"));

        // endswith
        System.out.println(st.endsWith(" "));

        // get character at index
        System.out.println(st.charAt(18));

        //  get index of substring
        System.out.println(st.indexOf("H", 10)); // searches the substring from the given index, if doesn't exist returns -1
        
        // get the last index of a substring
        System.out.println(st.lastIndexOf("i"));

        // compare if 2 strigs are equal
        System.out.println(st.equals("Hello"));
        System.out.println(st.equals(st)); // comparing the string object with itself

    }
}
