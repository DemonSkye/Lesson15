public class Lesson15 {
    public static void main(String args[]){
        String str = "q38yt3p9ghvjb2thh9-1rtnjh0[5w9wyk";
        //Lets remove all the letters from this string
        //383929059
        //100000000
        // 10000000
        //  1000000
       /* int[] numbers = new int[str.length()];
        int counter = 0;
        for(int i=0; i<str.length(); i++){
            int temp = StringOperations.digits(str.charAt(i));
            if (temp != -1 ){
                numbers[counter] = temp;
                counter++;
            }
        }

        long finalNumber = 0;
        long powerOfTen = 1;
        for(int i =0; i<counter; i++){
            powerOfTen*= 10;
        }

        for(int i = 0 ; i < counter; i++){
            powerOfTen /= 10;
            finalNumber += powerOfTen*numbers[i];
        }
        System.out.print(finalNumber);*/


       //Second way to do this to an entire string
       /*long temp = StringOperations.removeNonDigits(str);
       System.out.println(temp);*/

       String numbers = str.replaceAll("[^0-9]", "");
       long l = Long.parseLong(numbers);
       System.out.print(l);


    }
}
