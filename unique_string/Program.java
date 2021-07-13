public class Program{
    
    boolean isUniqueStr(String str){
       boolean[] chArray = new boolean[128];
       for(char c:str.toCharArray()){
            if(!chArray[c]){
                chArray[c] = true;
           }else{
                return false;
           }
       }
       return true;
    }
    public static void main(String []args){
        Program p = new Program();
        System.out.println(p.isUniqueStr("abca"));
    }
}