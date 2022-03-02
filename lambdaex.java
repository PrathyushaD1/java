interface sayable {
    public String say(String p);
}
/*
public class lambdaex {
    public static void main(String[] args){
        sayable s=(p)->{return "calling "+p;};
        System.out.println(s.say("you"));
    }
}
*/
public class lambdaex{
    public static void main(String[] args) {
        sayable s = new sayable() {
            public String say(String p) {
                return "calling "+p;
            }
        };
        System.out.println(s.say("you"));
    }
}
