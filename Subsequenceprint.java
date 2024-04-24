public class Subsequenceprint {
    public static void main(String[] args) {
        String str="abc";
        printsubseq(str,"");
    }
    public static void printsubseq(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        printsubseq(str.substring(1), ans);
        printsubseq(str.substring(1), ans+ch);

    }
    
}
