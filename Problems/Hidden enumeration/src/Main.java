public class Main {

    public static void main(String[] args) {
        Secret[] secrets = Secret.values();
        int counter = 0;

        for (int i = 0; i < secrets.length; i++) {
            if (secrets[i].name().startsWith("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

enum Secret {
    START
}