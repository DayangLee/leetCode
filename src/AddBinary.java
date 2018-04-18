public class AddBinary {
    public String addBinary(String a, String b) {
        if(a.equals("")) return b;
        if(b.equals("")) return a;


        if(a.length() > b.length()){
            int count = a.length() - b.length();
            for(int i=0; i<count; i++){
                b = "0" + b;
            }
        }
        if(b.length() > a.length()){
            int count = b.length() - a.length();
            for(int i=0; i<count; i++){
                a = "0" + a;
            }
        }
        int len = a.length();


        int cursor = 0;
        String c = "";


        for(int i=len-1;i>=0;i--){
            int num = (a.charAt(i) - '0') + (b.charAt(i) - '0') + cursor;
            if(num == 0){
                c = "0" + c;
                cursor = 0;
            } else if(num == 1){
                c = "1" + c;
                cursor = 0;
            } else if(num == 2){
                c = "0" + c;
                cursor = 1;
            } else if(num == 3){
                c = "1" + c;
                cursor = 1;
            }
        }

        if(cursor == 1)
            c = "1" + c;

        return c;

    }
    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("10","11");
        System.out.println(result);
    }
}
