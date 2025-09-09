
public class stringbuilder {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("tony");
     //Insert char
     sb.insert(0, 'S');
     System.out.println(sb);
     sb.delete(0, 1);
     System.out.println(sb);
     System.out.println(sb.charAt(0));
     //Get Char
     sb.setCharAt(0, 'P');
     System.out.println(sb);
      sb.append(" Stark");
     System.out.println(sb); 
     System.out.println(sb.length());




   
}

    
}
