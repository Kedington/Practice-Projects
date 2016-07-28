public abstract class Cereal { // Can not be Instantiated

    public String Brand;

    // Abstract method must be part of Abstract Class
    public abstract void taste(); 

    public void breakfast() {
        System.out.println("Cereal is great for breakfast");
    }

    public static void main(String[] args) {
    
        Cereal flakes = new FrostedFlakes();
        Cereal trix = new Trix();

        flakes.breakfast();
        System.out.print(flakes.Brand + ": ");
        flakes.taste();
        System.out.print(trix.Brand + ": ");
        trix.taste();
    }
}

    
