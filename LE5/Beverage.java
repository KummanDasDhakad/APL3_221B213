abstract class Beverage {
    private void Pour(int qty){
        System.out.println("Pour " + qty + "ml of beverage.");
    }
    protected abstract void addContiment();
    protected void Stir(){}
    private void Serve(){
        System.out.println("Serve through waiter.");
    }
    public final void templateMethod(int qty){
        Pour(qty);
        addContiment();
        Stir();
        Serve();
    }
}