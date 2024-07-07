package package1;

class Gun {
    
    public void fire(){
        System.out.println("Fire");
    }
    
}

class Pistol extends Gun {

    @Override
    public void fire() {
        System.out.println("Drrrrrrr");
    }
    
}

class AK47 extends Gun {

    @Override
    public void fire() {
        System.out.println("Trrrrrrr");
    }
    
}

class Game {
    public static void main(String[] args) {
        
        AK47 g1 = new AK47();
        g1.fire();
        
        Pistol g2 = new Pistol();
        g2.fire();
    }
}