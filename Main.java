//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SUV Explorer=new SUV("Explorer",false);
        Explorer.move(40,0);
        Explorer.acclerate(20);
        System.out.println("Current Gear:"+Explorer.getGears());
        System.out.println("Current Speed:"+Explorer.getCurrentSpeed());




        }
    }
