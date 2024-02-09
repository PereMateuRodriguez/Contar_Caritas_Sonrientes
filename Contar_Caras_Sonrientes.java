//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arr = {";)", ":D", ":-)", ":(", ";-["};
        int con = 0;
        for (int i = 0; i < arr.length; i++){

            if(arr[i].length() == 2){
                String palabra_dos = arr[i];
                if ((palabra_dos.charAt(0) == ';' || palabra_dos.charAt(0) == ':') && (palabra_dos.charAt(1) == ')' || palabra_dos.charAt(1) == 'D')){
                    con++;
                }
            }
            else{
                String palabra_tres = arr[i];
                if ((palabra_tres.charAt(0) == ';' || palabra_tres.charAt(0) == ':') && (palabra_tres.charAt(2) == ')' || palabra_tres.charAt(2) == 'D') &&   (palabra_tres.charAt(1) == '-' || palabra_tres.charAt(1) == '~') ){
                    con++;
                }
            }
        }
        System.out.println(con);
    }

}
