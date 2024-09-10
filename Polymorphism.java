class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing menggonggong");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeong");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing();
        Hewan hewan2 = new Kucing();
        
        hewan1.suara();  // Output: Anjing menggonggong
        hewan2.suara();  // Output: Kucing mengeong
    }
}
