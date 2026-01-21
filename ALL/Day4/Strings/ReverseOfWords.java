public class ReverseOfWords{
    public static void main(String[] args) {      
    String s="Hello World";
    
    String []words=s.split(" ");
    String reverseString="";
    for(int i=words.length-1;i>=0;i--){
        reverseString+=words[i]+" ";
    } 
    System.out.println("Length: "+s.length());
    System.out.println( reverseString.trim());  
}
}
