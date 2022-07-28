package Home;

public abstract class Pizza {
    public abstract int readyt();
    public abstract int beackt();
    public abstract int cost();
    public int allt(){
        return this.readyt()+this.beackt()+1;
    }
}

class Peperoni extends Pizza{
    @Override
    public int readyt() {
        return 20;
    }
    @Override
    public int beackt() {
        return 15;
    }
    @Override
    public int cost(){
        return 100;
    }
}

class Seagifts extends Pizza{
    @Override
    public int readyt() {
        return 41;
    }
    @Override
    public int beackt() {
        return 30;
    }
    @Override
    public int cost(){
        return 200;
    }
}

class BBQ extends Pizza{
    @Override
    public int readyt() {
        return 30;
    }
    @Override
    public int beackt() {
        return 25;
    }
    @Override
    public int cost(){
        return 150;
    }
}

class ONELOVE extends Pizza{
    @Override
    public int readyt() {
        return 5;
    }
    @Override
    public int beackt() {
        return 10;
    }
    @Override
    public int cost(){
        return 50;
    }
}
