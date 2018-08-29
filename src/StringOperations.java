public class StringOperations {
    public static int digits (char c){
        if (c == '1') return 1;
        if (c == '2') return 2;
        if (c == '3') return 3;
        if (c == '4') return 4;
        if (c == '5') return 5;
        if (c == '6') return 6;
        if (c == '7') return 7;
        if (c == '8') return 8;
        if (c == '9') return 9;
        if (c == '0') return 0;
        return -1;
    }

    public static long removeNonDigits(String str){
        //String str = "q38yt3p9ghvjb2thh9-1rtnjh0[5w9wyk";
        boolean numbersFound = false;
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i)) ){
                numbersFound = true;
                temp += str.charAt(i);
            }
        }

        if(numbersFound){
            long i = Long.parseLong(temp);
            return i;
        }
        return -1;
    }
}
