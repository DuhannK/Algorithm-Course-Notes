
interface hayvan {
    public void avlan();


abstract class kedi implements hayvan {
    public void takipet() {
    }
}

class kaplan extends kedi {
    @Override
    public void avlan() {
        System.out.println("Kaplan avlanıyor");
    }

    @Override
    public void takipet() {
        System.out.println("Kaplan takip ediyor");
    }
}

public class Hayvan {
    public static void main(String[] args) {
        kaplan kp = new kaplan();
        kp.avlan();
        kp.takipet();
    }
}
}